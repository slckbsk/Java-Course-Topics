
import java.sql.*;


/**
 *
 * @author sb
 */
public class DbHelper {
    private String userName = "root";
    private String password = "********";
    private String dbUrl = "jdbc:mysql://localhost:3306/world";
    
    public Connection getConnection() throws SQLException{
        return  DriverManager.getConnection(dbUrl, userName, password);
    }
    
    public void showErrorMessage (SQLException e){
        System.out.println("Error : " + e.getMessage());
        System.out.println("Error Code : " + e.getErrorCode());
    }
}
