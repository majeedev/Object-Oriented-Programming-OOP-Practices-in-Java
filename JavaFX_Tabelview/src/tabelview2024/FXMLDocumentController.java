/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelview2024;

import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 *
 * @author almaj
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField txfild_name;
    
    @FXML
    private ComboBox<String> cb_major;

    @FXML
    private ComboBox<String> cb_semester;
    
     @FXML
    private ComboBox<String> cb_studentName;
    @FXML
private TableView<String[]> tabel_student;

@FXML
private TableColumn<String[], String> table_name;

@FXML
private TableColumn<String[], String> table_major;

@FXML
private TableColumn<String[], String> table_semester;

 private ObservableList<String[]> studentList = FXCollections.observableArrayList();
    private final String DB_URL = "jdbc:derby:G:\\tableView2024;create=true";
    

     

  // Load students with their major and semester names
private void loadStudents() {
    studentList.clear();
    String query = "Select * from StudentS";

    try (Connection conn = DriverManager.getConnection(DB_URL);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {
         
        while (rs.next()) {
            String name = rs.getString("Name");
            String majorName = rs.getString("MajorID"); // From Major table
            String semesterName = rs.getString("SemesterID"); // From Semester table
            
            studentList.add(new String[]{name, majorName, semesterName});
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

    tabel_student.setItems(studentList);
}

    @FXML
private void handleButtonAction(ActionEvent event) {
    String name = txfild_name.getText();
    
    // Get the selected index (add 1 to match the database expectation)
    int majorIndex = cb_major.getSelectionModel().getSelectedIndex() + 1;
    int semesterIndex = cb_semester.getSelectionModel().getSelectedIndex() + 1;

    // Check if the name is not empty and both indices are valid
    if (name != null && !name.isEmpty() && majorIndex > 0 && semesterIndex > 0) {
        insertStudent(name, majorIndex, semesterIndex);
        loadStudents(); // Refresh the TableView
    }
}

@FXML
    private void handleViewStudentAction(ActionEvent event) {
        loadStudentNames(); // Load student names when the button is clicked
    }

   private void insertStudent(String name, int majorIndex, int semesterIndex) {
    String insertSQL = "INSERT INTO Students (Name, MajorID, SemesterID) VALUES (?, ?, ?)";

    try (Connection conn = DriverManager.getConnection(DB_URL);
         PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
         
        pstmt.setString(1, name);
        pstmt.setInt(2, majorIndex); // Use the index directly
        pstmt.setInt(3, semesterIndex); // Use the index directly
        pstmt.executeUpdate();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    
    private void loadMajors() {
        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT MajorName FROM Major")) {
             
            while (rs.next()) {
                cb_major.getItems().add(rs.getString("MajorName"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadSemesters() {
        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT SemesterName FROM Semester")) {
             
            while (rs.next()) {
                cb_semester.getItems().add(rs.getString("SemesterName"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
private void loadStudentNames() {
    int majorIndex = cb_major.getSelectionModel().getSelectedIndex() + 1; // Correct index
    int semesterIndex = cb_semester.getSelectionModel().getSelectedIndex() + 1; // Correct index
    
    cb_studentName.getItems().clear(); // Clear previous items

    if (majorIndex > 0 && semesterIndex > 0) { // Ensure valid indices
        String query = "SELECT Name FROM Students WHERE MajorID = ? AND SemesterID = ?";

        try (Connection conn = DriverManager.getConnection(DB_URL);
             PreparedStatement pstmt = conn.prepareStatement(query)) {
             
            pstmt.setInt(1, majorIndex);
            pstmt.setInt(2, semesterIndex);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                String studentName = rs.getString("Name");
                cb_studentName.getItems().add(studentName); // Add names to ComboBox
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         loadMajors();
        loadSemesters();
         loadStudents();
         
    table_name.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue()[0]));
    table_major.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue()[1]));
    table_semester.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue()[2]));
    }    
    
}
