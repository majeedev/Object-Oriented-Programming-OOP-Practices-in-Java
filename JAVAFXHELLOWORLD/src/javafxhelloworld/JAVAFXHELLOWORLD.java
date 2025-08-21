package javafxhelloworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;


public class JAVAFXHELLOWORLD extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception 
    {
        Label lable = new Label("Hello World'");
        
        StackPane root = new StackPane();
        root.getChildren().add(lable);
       // root.setRotate(45);
        
        Scene scene = new Scene(root, 300, 150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("My Frist JavaFX Application");
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
