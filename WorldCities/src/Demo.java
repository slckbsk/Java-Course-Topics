
import java.util.ArrayList;
import java.sql.*;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author sb
 */
public class Demo extends javax.swing.JFrame {

    DefaultTableModel model;

    public Demo() {
        initComponents();

        PopulateTable();
    }

    public void PopulateTable() {
        model = (DefaultTableModel) tblCities.getModel();
        model.setRowCount(0);
        
        try {
            ArrayList<City> cities = getCities();

            for (City city : cities) {

                Object[] rowData = {
                    city.getId(),
                    city.getName(),
                    city.getCountryCode(),
                    city.getDistrict(),
                    city.getPopulation()
                };

                model.addRow(rowData);

            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ArrayList<City> getCities() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<City> cities = null;

        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("Select * From  City");
            cities = new ArrayList<City>();

            while (resultSet.next()) {
                cities.add(new City(
                        resultSet.getInt("ID"),
                        resultSet.getString("Name"),
                        resultSet.getString("CountryCode"),
                        resultSet.getString("District"),
                        resultSet.getInt("Population")
                ));
            }

        } catch (SQLException e) {
            dbHelper.showErrorMessage(e);
        } finally {
            statement.cancel();
            connection.close();
        }

        return cities;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCities = new javax.swing.JTable();
        lblName = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        btnEkle = new javax.swing.JButton();
        textSearch = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        textCountry = new javax.swing.JTextField();
        lblCountry = new javax.swing.JLabel();
        textDistrict = new javax.swing.JTextField();
        textPopulation = new javax.swing.JTextField();
        lblPopulation = new javax.swing.JLabel();
        lblDistrict = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(753, 500));
        setMinimumSize(new java.awt.Dimension(753, 500));
        setPreferredSize(new java.awt.Dimension(753, 500));
        setResizable(false);

        tblCities.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Conutry", "District", "Population"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCities);
        if (tblCities.getColumnModel().getColumnCount() > 0) {
            tblCities.getColumnModel().getColumn(0).setResizable(false);
            tblCities.getColumnModel().getColumn(1).setResizable(false);
            tblCities.getColumnModel().getColumn(2).setResizable(false);
            tblCities.getColumnModel().getColumn(3).setResizable(false);
            tblCities.getColumnModel().getColumn(4).setResizable(false);
        }

        lblName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(204, 0, 0));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Name");
        lblName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblName.setInheritsPopupMenu(false);
        lblName.setMaximumSize(new java.awt.Dimension(100, 25));
        lblName.setMinimumSize(new java.awt.Dimension(100, 25));
        lblName.setPreferredSize(new java.awt.Dimension(100, 25));

        textName.setMaximumSize(new java.awt.Dimension(300, 25));
        textName.setMinimumSize(new java.awt.Dimension(300, 25));
        textName.setPreferredSize(new java.awt.Dimension(300, 25));

        btnEkle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEkle.setForeground(new java.awt.Color(204, 0, 51));
        btnEkle.setText("EKLE");
        btnEkle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 3, true));
        btnEkle.setMaximumSize(new java.awt.Dimension(75, 75));
        btnEkle.setMinimumSize(new java.awt.Dimension(75, 75));
        btnEkle.setPreferredSize(new java.awt.Dimension(75, 75));
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
            }
        });

        textSearch.setMaximumSize(new java.awt.Dimension(300, 25));
        textSearch.setMinimumSize(new java.awt.Dimension(300, 25));
        textSearch.setPreferredSize(new java.awt.Dimension(300, 25));
        textSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textSearchKeyReleased(evt);
            }
        });

        lblSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSearch.setText("Arama");
        lblSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblSearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblSearch.setInheritsPopupMenu(false);
        lblSearch.setMaximumSize(new java.awt.Dimension(100, 25));
        lblSearch.setMinimumSize(new java.awt.Dimension(100, 25));
        lblSearch.setPreferredSize(new java.awt.Dimension(100, 25));

        textCountry.setMaximumSize(new java.awt.Dimension(300, 25));
        textCountry.setMinimumSize(new java.awt.Dimension(300, 25));
        textCountry.setPreferredSize(new java.awt.Dimension(300, 25));

        lblCountry.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCountry.setForeground(new java.awt.Color(204, 0, 0));
        lblCountry.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCountry.setText("Country");
        lblCountry.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblCountry.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCountry.setInheritsPopupMenu(false);
        lblCountry.setMaximumSize(new java.awt.Dimension(100, 25));
        lblCountry.setMinimumSize(new java.awt.Dimension(100, 25));
        lblCountry.setPreferredSize(new java.awt.Dimension(100, 25));

        textDistrict.setMaximumSize(new java.awt.Dimension(300, 25));
        textDistrict.setMinimumSize(new java.awt.Dimension(300, 25));
        textDistrict.setPreferredSize(new java.awt.Dimension(300, 25));

        textPopulation.setMaximumSize(new java.awt.Dimension(300, 25));
        textPopulation.setMinimumSize(new java.awt.Dimension(300, 25));
        textPopulation.setPreferredSize(new java.awt.Dimension(300, 25));

        lblPopulation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPopulation.setForeground(new java.awt.Color(204, 0, 0));
        lblPopulation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPopulation.setText("Population");
        lblPopulation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblPopulation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblPopulation.setInheritsPopupMenu(false);
        lblPopulation.setMaximumSize(new java.awt.Dimension(100, 25));
        lblPopulation.setMinimumSize(new java.awt.Dimension(100, 25));
        lblPopulation.setPreferredSize(new java.awt.Dimension(100, 25));

        lblDistrict.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDistrict.setForeground(new java.awt.Color(204, 0, 0));
        lblDistrict.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDistrict.setText("District");
        lblDistrict.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblDistrict.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblDistrict.setInheritsPopupMenu(false);
        lblDistrict.setMaximumSize(new java.awt.Dimension(100, 25));
        lblDistrict.setMinimumSize(new java.awt.Dimension(100, 25));
        lblDistrict.setPreferredSize(new java.awt.Dimension(100, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(11, 11, 11)
                                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(11, 11, 11)
                                    .addComponent(textCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(textDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPopulation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(textPopulation, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPopulation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textPopulation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSearchKeyReleased
        String searchKey = textSearch.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(model);
        tblCities.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(searchKey));
    }//GEN-LAST:event_textSearchKeyReleased

    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed

        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;

        String Name = textName.getText();
        String CountryCode = textCountry.getText();
        String District = textDistrict.getText();
        int Population = Integer.valueOf(textPopulation.getText());

        String sql = "insert into city (Name, CountryCode, District, Population) values (?, ?, ?, ?)";

        try {

            connection = dbHelper.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1, Name);
            statement.setString(2, CountryCode);
            statement.setString(3, District);
            statement.setInt(4, Population);

            int result = statement.executeUpdate();
            System.out.println(result + " Kayıt eklendi");
            PopulateTable();
            
        } catch (SQLException e) {
            dbHelper.showErrorMessage(e);
        } finally {

            try {
                statement.cancel();
                connection.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }//GEN-LAST:event_btnEkleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Demo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEkle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblDistrict;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPopulation;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTable tblCities;
    private javax.swing.JTextField textCountry;
    private javax.swing.JTextField textDistrict;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textPopulation;
    private javax.swing.JTextField textSearch;
    // End of variables declaration//GEN-END:variables
}
