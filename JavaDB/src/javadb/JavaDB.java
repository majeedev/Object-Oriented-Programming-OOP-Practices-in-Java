
package javadb;


public class JavaDB {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    
    {
        // TODO code application logic here
      
        try (Connection con = DriverManager.getConnection("jdbc:derby:G:\\advancedDB\\majeed;","",""))
        {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM APP.TEST");
            
            while (rs.next()) {
                System.out.printf("%d : %s %n", rs.getInt("id"), rs.getString("name"));
            }
            con.close();
        }
        
    }
    
}
