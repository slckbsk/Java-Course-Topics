/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JdbcIntro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author sb
 */
public class Main {

    public static void main(String[] args) {
//        connectAndRead();
 //       insertFirstWay();
//        insertSecondWay();
//        update(); 
//        delete();



    }
    
    
        public static void delete() {

        Connection conn = null;
        DbHelper dbhelper = new DbHelper();
        PreparedStatement statement = null;

        String sql = "delete from city where ID = 4088";
//   String sql1 = "delete from city  where ID = ?";

        try {

            conn = dbhelper.geConnnection();
            statement = conn.prepareStatement(sql);

            //    statement.setInt(1, 4082); // String sql1 ile alakalı ? sırası na göre = parametreindex
            int result = statement.executeUpdate();
            System.out.println(result + " Kayıt Silindi");

        } catch (SQLException e) {
            dbhelper.showErrorMassage(e);

        } finally {
            try {
                statement.close();
                conn.close();
            } catch (SQLException ex) {
                dbhelper.showErrorMassage(ex);
            }
        }
    }

    public static void update() {

        Connection conn = null;
        DbHelper dbhelper = new DbHelper();
        PreparedStatement statement = null;

        String sql = "update city set population = 33333, district = 'Düzce' where ID = 4084";
        //     String sql1 = "update city set population = 33333, district = 'Düzce' where ID = ?";

        try {

            conn = dbhelper.geConnnection();
            statement = conn.prepareStatement(sql);

            //    statement.setInt(1, 4082); // String sql1 ile alakalı ? sırası na göre = parametreindex
            int result = statement.executeUpdate();
            System.out.println(result + " Kayıt Güncellendi");

        } catch (SQLException e) {
            dbhelper.showErrorMassage(e);

        } finally {
            try {
                statement.close();
                conn.close();
            } catch (SQLException ex) {
                dbhelper.showErrorMassage(ex);
            }
        }
    }

    
    
    public static void insertSecondWay() {

        Connection conn = null;
        DbHelper dbhelper = new DbHelper();
        PreparedStatement statement = null;

        String sql = "insert into city (Name, CountryCode, District, Population) values (?, ?, ?, ?)";

        try {

            conn = dbhelper.geConnnection();
            statement = conn.prepareStatement(sql);

            statement.setString(1, "Düzce 1");
            statement.setString(2, "Tur");
            statement.setString(3, "Düzce 1");
            statement.setInt(4, 45001);

            int result = statement.executeUpdate();
            System.out.println(result + " Kayıt eklendi");

        } catch (SQLException e) {
            dbhelper.showErrorMassage(e);

        } finally {
            try {
                statement.close();
                conn.close();
            } catch (SQLException ex) {
                dbhelper.showErrorMassage(ex);
            }
        }
    }

    public static void insertFirstWay() {

        Connection conn = null;
        DbHelper dbhelper = new DbHelper();
        PreparedStatement statement = null;

        try {

            conn = dbhelper.geConnnection();
            statement = conn.prepareStatement(
                    "insert into city (Name, CountryCode, District, Population) values ('Düzce','Tur','Düzce',50000)");
            int result = statement.executeUpdate();
            System.out.println(result + " Kayıt eklendi");

        } catch (SQLException e) {
            dbhelper.showErrorMassage(e);

        } finally {
            try {
                statement.close();
                conn.close();
            } catch (SQLException ex) {
                dbhelper.showErrorMassage(ex);
            }
        }
    }

    public static void connectAndRead() {

        Connection conn = null;
        DbHelper dbhelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;

        try {

            conn = dbhelper.geConnnection();

            statement = conn.createStatement();
            resultSet = statement.executeQuery("Select * From country");

            ArrayList<Country> countries = new ArrayList<>();

            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));

                countries.add(new Country(
                        resultSet.getString("code"),
                        resultSet.getString("name"),
                        resultSet.getString("continent"),
                        resultSet.getString("region")));
            }

            System.out.println(countries.size());

        } catch (SQLException e) {
            dbhelper.showErrorMassage(e);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                dbhelper.showErrorMassage(ex);
            }
        }
    }

}
