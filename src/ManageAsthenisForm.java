import javax.swing.*;
import java.sql.*;
import javax.swing.JFrame;

public class ManageAsthenisForm extends javax.swing.JFrame {

    /**
     * Creates new form ManageAsthenisForm
     */
    public ManageAsthenisForm() {
        initComponents();
        myconnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelMinimize = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonExitPage = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPatientID = new javax.swing.JTextField();
        jButtonResetManageAsthenis = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButtonUpdateFromAsthenis = new javax.swing.JButton();
        jButtonDeleteFromAsthenis = new javax.swing.JButton();
        jTextFieldPNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldSurname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxSex = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Διαχείριση Στοιχείων Ασθενή");

        jLabelMinimize.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMinimize.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMinimize.setText("-");
        jLabelMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                .addComponent(jLabelMinimize)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelMinimize))
                .addGap(22, 22, 22))
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setPreferredSize(new java.awt.Dimension(639, 600));

        jButtonExitPage.setBackground(new java.awt.Color(149, 165, 166));
        jButtonExitPage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonExitPage.setForeground(new java.awt.Color(242, 38, 19));
        jButtonExitPage.setText("Έξοδος απ' τη σελίδα");
        jButtonExitPage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonExitPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitPageActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(236, 240, 241));
        jLabel2.setText("ID Ασθενή:");

        jTextFieldPatientID.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldPatientID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldPatientID.setForeground(new java.awt.Color(228, 241, 254));

        jButtonResetManageAsthenis.setBackground(new java.awt.Color(242, 38, 19));
        jButtonResetManageAsthenis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonResetManageAsthenis.setForeground(new java.awt.Color(255, 255, 255));
        jButtonResetManageAsthenis.setText("Reset");
        jButtonResetManageAsthenis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonResetManageAsthenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetManageAsthenisActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("Τηλέφωνο:");

        jButtonUpdateFromAsthenis.setBackground(new java.awt.Color(34, 167, 240));
        jButtonUpdateFromAsthenis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonUpdateFromAsthenis.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdateFromAsthenis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update.png"))); // NOI18N
        jButtonUpdateFromAsthenis.setText("Ενημέρωση");
        jButtonUpdateFromAsthenis.setToolTipText("ΠΡΟΣΟΧΗ!!! Η Ενημέρωση γίνεται με βάση το ID Ασθενή!!!");
        jButtonUpdateFromAsthenis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonUpdateFromAsthenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateFromAsthenisActionPerformed(evt);
            }
        });

        jButtonDeleteFromAsthenis.setBackground(new java.awt.Color(34, 167, 240));
        jButtonDeleteFromAsthenis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDeleteFromAsthenis.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDeleteFromAsthenis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        jButtonDeleteFromAsthenis.setText("Διαγραφή");
        jButtonDeleteFromAsthenis.setToolTipText("ΠΡΟΣΟΧΗ!!! Χρειάζεται να βάλετε μόνο το ID Ασθενή!!!");
        jButtonDeleteFromAsthenis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeleteFromAsthenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteFromAsthenisActionPerformed(evt);
            }
        });

        jTextFieldPNumber.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldPNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldPNumber.setForeground(new java.awt.Color(228, 241, 254));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(236, 240, 241));
        jLabel6.setText("Επώνυμο:");

        jTextFieldSurname.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldSurname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldSurname.setForeground(new java.awt.Color(228, 241, 254));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(236, 240, 241));
        jLabel7.setText("Φύλο:");

        jComboBoxSex.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxSex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Άνδρας", "Γυναίκα" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(236, 240, 241));
        jLabel8.setText("Όνομα:");

        jTextFieldName.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldName.setForeground(new java.awt.Color(228, 241, 254));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldPNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(22, 22, 22)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBoxSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jButtonDeleteFromAsthenis)
                            .addComponent(jButtonExitPage))
                        .addGap(70, 70, 70)
                        .addComponent(jButtonResetManageAsthenis, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonUpdateFromAsthenis))
                .addGap(75, 75, 75))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldPNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonResetManageAsthenis, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonUpdateFromAsthenis, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeleteFromAsthenis, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(jButtonExitPage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizeMouseClicked

    private void jButtonResetManageAsthenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetManageAsthenisActionPerformed
        jTextFieldPatientID.setText("");
        jTextFieldSurname.setText("");
        jTextFieldName.setText("");
        jTextFieldPNumber.setText("");
    }//GEN-LAST:event_jButtonResetManageAsthenisActionPerformed

    private void jButtonUpdateFromAsthenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateFromAsthenisActionPerformed
        int patientID = Integer.valueOf(jTextFieldPatientID.getText());
        String surname = jTextFieldSurname.getText();
        String name = jTextFieldName.getText();
        String pnumber = jTextFieldPNumber.getText();
        String sex = jComboBoxSex.getSelectedItem().toString();

        try {
            String updateString = "UPDATE Asthenis SET Epwnymo=?, Onoma=?, " +
            "Thlefwno=?, Fylo=? WHERE IDAstheni=?";
            pst = dbConnection.prepareStatement(updateString);
            pst.setInt(5, patientID);
            pst.setString(1, surname);
            pst.setString(2, name);
            pst.setString(3, pnumber);
            pst.setString(4, sex);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Updated Successfully!!!");
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while(ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
    }//GEN-LAST:event_jButtonUpdateFromAsthenisActionPerformed

    private void jButtonDeleteFromAsthenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteFromAsthenisActionPerformed
        int patientID = Integer.valueOf(jTextFieldPatientID.getText());

        try {
            String deleteString = "DELETE FROM Asthenis WHERE IDAstheni=?";
            pst = dbConnection.prepareStatement(deleteString);
            pst.setInt(1, patientID);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Deleted Successfully!!!");
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while(ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
    }//GEN-LAST:event_jButtonDeleteFromAsthenisActionPerformed

    private void jButtonExitPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitPageActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonExitPageActionPerformed

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
            java.util.logging.Logger.getLogger(AccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageAsthenisForm().setVisible(true);
            }
        });
    }
    
    static String     driverClassName = "oracle.jdbc.OracleDriver" ;
    static String     url = "jdbc:oracle:thin:@192.168.6.21:1521:dblabs" ;
    static Connection dbConnection = null;
    static String     username = "it144172";
    static String     passwd = "j@3teJi3";
    static PreparedStatement  pst = null;
    // static ResultSet rs = null;
    
    void myconnection() {
        try { 
             Class.forName (driverClassName);
        } catch (ClassNotFoundException ex) { }
        try {    
            dbConnection = DriverManager.getConnection (url, username, passwd);
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while(ex != null) {
		System.out.println("Message: " + ex.getMessage());
		ex = ex.getNextException();
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeleteFromAsthenis;
    private javax.swing.JButton jButtonExitPage;
    private javax.swing.JButton jButtonResetManageAsthenis;
    private javax.swing.JButton jButtonUpdateFromAsthenis;
    private javax.swing.JComboBox jComboBoxSex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPNumber;
    private javax.swing.JTextField jTextFieldPatientID;
    private javax.swing.JTextField jTextFieldSurname;
    // End of variables declaration//GEN-END:variables
}