/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JdbcIntro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sb
 */
public class DbHelper {

    private String userName = "root";
    private String password = "mysql1234.";
    private String dbUrl = "jdbc:mysql://localhost:3306/world";
    
    public Connection geConnnection() throws SQLException{
        return DriverManager.getConnection(dbUrl, userName, password);
    }
    
    public void showErrorMassage(SQLException e){
        System.out.println("Error : " + e.getMessage());
        System.out.println("Error  code: " + e.getErrorCode());
    }
}
