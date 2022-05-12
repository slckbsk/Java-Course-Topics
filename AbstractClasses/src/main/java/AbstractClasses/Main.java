/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClasses;

/**
 *
 * @author sb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CustomerManager cm = new CustomerManager();
        cm.bdm = new OracleDatabaseManager();
        cm.getCustomer();

        EmployeeManager em = new EmployeeManager();
        em.bdm = new MySqlDatabaseManager();
        em.getEmployee();
    }

}
