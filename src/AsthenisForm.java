import javax.swing.JFrame;
import java.sql.*;

public class AsthenisForm extends javax.swing.JFrame {

    /**
     * Creates new form AsthenisForm
     */
    public AsthenisForm(String uname) {
        initComponents();
        myconnection();
        jLabel1.setText("Welcome " +jLabel1.getText() + uname);
        /*
        1. Type &nbsp; to add one space.
        2. Type &ensp; to add two spaces.
        3. Type &emsp; to add four spaces.
        */
        jLabel2.setText("<html>ΚΑΝΤΕ ΚΛΙΚ ΓΙΑ ΕΚΤΕΛΕΣΗ ΣΤΑΤΙΚΩΝ/ΔΥΝΑΜΙΚΩΝ" +
                "<br>&emsp;&emsp;&emsp;&emsp;" +
                "&emsp;&emsp;&emsp;&emsp;ΕΡΩΤΗΜΑΤΩΝ SQL</html>");
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
        jButtonLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonFirstDynamicQuery = new javax.swing.JButton();
        jButtonThirdDynamicQuery = new javax.swing.JButton();
        jButtonSecondDynamicQuery = new javax.swing.JButton();
        jButtonFirstStaticQuery = new javax.swing.JButton();
        jButtonFourthDynamicQuery = new javax.swing.JButton();
        jButtonSecondStaticQuery = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ασθενής: ");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 402, Short.MAX_VALUE)
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
        jPanel2.setPreferredSize(new java.awt.Dimension(486, 420));

        jButtonLogout.setBackground(new java.awt.Color(242, 38, 19));
        jButtonLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonLogout.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogout.setText("Logout");
        jButtonLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ΕΠΙΚΕΦΑΛΙΔΑ");

        jButtonFirstDynamicQuery.setBackground(new java.awt.Color(0, 84, 118));
        jButtonFirstDynamicQuery.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonFirstDynamicQuery.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFirstDynamicQuery.setText("1o ΔΥΝΑΜΙΚΟ ΕΡΩΤΗΜΑ");
        jButtonFirstDynamicQuery.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonFirstDynamicQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFirstDynamicQueryActionPerformed(evt);
            }
        });

        jButtonThirdDynamicQuery.setBackground(new java.awt.Color(0, 84, 118));
        jButtonThirdDynamicQuery.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonThirdDynamicQuery.setForeground(new java.awt.Color(255, 255, 255));
        jButtonThirdDynamicQuery.setText("3ο ΔΥΝΑΜΙΚΟ ΕΡΩΤΗΜΑ");
        jButtonThirdDynamicQuery.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonThirdDynamicQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThirdDynamicQueryActionPerformed(evt);
            }
        });

        jButtonSecondDynamicQuery.setBackground(new java.awt.Color(0, 84, 118));
        jButtonSecondDynamicQuery.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSecondDynamicQuery.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSecondDynamicQuery.setText("2ο ΔΥΝΑΜΙΚΟ ΕΡΩΤΗΜΑ");
        jButtonSecondDynamicQuery.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSecondDynamicQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSecondDynamicQueryActionPerformed(evt);
            }
        });

        jButtonFirstStaticQuery.setBackground(new java.awt.Color(38, 166, 91));
        jButtonFirstStaticQuery.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonFirstStaticQuery.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFirstStaticQuery.setText("1ο ΣΤΑΤΙΚΟ ΕΡΩΤΗΜΑ");
        jButtonFirstStaticQuery.setToolTipText("Βρες τα ονοματεπώνυμα και τις ώρες κράτησης των Ασθενών που έχουν κάνει κράτηση από τις 10:00 μέχρι τις 15:00");
        jButtonFirstStaticQuery.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonFirstStaticQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFirstStaticQueryActionPerformed(evt);
            }
        });

        jButtonFourthDynamicQuery.setBackground(new java.awt.Color(0, 84, 118));
        jButtonFourthDynamicQuery.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonFourthDynamicQuery.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFourthDynamicQuery.setText("4ο ΔΥΝΑΜΙΚΟ ΕΡΩΤΗΜΑ");
        jButtonFourthDynamicQuery.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonFourthDynamicQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFourthDynamicQueryActionPerformed(evt);
            }
        });

        jButtonSecondStaticQuery.setBackground(new java.awt.Color(38, 166, 91));
        jButtonSecondStaticQuery.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSecondStaticQuery.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSecondStaticQuery.setText("2ο ΣΤΑΤΙΚΟ ΕΡΩΤΗΜΑ");
        jButtonSecondStaticQuery.setToolTipText("Βρες τα ονοματεπώνυμα των Ασθενών που έχουν κάνει κράτηση σε ημερομηνία από τις 08/05/18 μέχρι τη 01/06/18");
        jButtonSecondStaticQuery.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSecondStaticQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSecondStaticQueryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonFirstDynamicQuery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSecondDynamicQuery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonThirdDynamicQuery, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonFirstStaticQuery, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                        .addComponent(jButtonSecondStaticQuery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButtonFourthDynamicQuery, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(63, 63, 63))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFirstDynamicQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFourthDynamicQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSecondDynamicQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFirstStaticQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSecondStaticQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonThirdDynamicQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jButtonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
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

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed
        LoginForm lf = new LoginForm();
        // Κλείνω τελείως όλο το παράθυρό μου (το frame που βρίσκομαι αυτή τη στιγμή)
        dispose();
        lf.main(null); // Το βάζω για να σβήνονται αυτά που έχω γράψει
                       // στο username και password και να εμφανιστεί το LoginForm
                       // Αν το σβήσω, τρέχει ακόμα το πρόγραμμα και
                       // δε με εμφανίζει τίποτα
        
    }//GEN-LAST:event_jButtonLogoutActionPerformed

    private void jButtonFirstDynamicQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFirstDynamicQueryActionPerformed
        Asthenis_First_Dynamic_Query afdq = new Asthenis_First_Dynamic_Query();
        // Λέω στο καινούργιο μου jFrame να εμφανιστεί στην οθόνη
        afdq.setVisible(true);
        // Φτιάχνω το μέγεθος του frame μου ώστε να με χωράει ανεξαρτήτως
        // (στο μικρότερο δυνατό μέγεθος) τα δεδομένα που θα του έχω βάλει
        afdq.pack();
        // Το κανω για να μου εμφανίζει το frame που μεταφέρομαι στη μέση
        // ανεξαρτήτως (το βάζω έτσι κι αλλιώς)
        afdq.setLocationRelativeTo(null);
        // ΜΕ ΤΟ ΠΟΥ ΠΑΤΗΣΩ ΤΟ ΚΟΚΚΙΝΟ " Χ " ΣΤΗΝ ΕΦΑΡΜΟΓΗ ΜΟΥ ΝΑ ΣΤΑΜΑΤΗΣΕΙ
        // ΝΑ ΤΡΕΧΕΙ ΤΟ ΠΡΟΓΡΑΜΜΑ ΣΤΟ ΚΑΙΝΟΥΡΓΙΟ ΜΟΥ FRAME!!!!!
        afdq.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.dispose();
    }//GEN-LAST:event_jButtonFirstDynamicQueryActionPerformed

    private void jButtonSecondDynamicQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSecondDynamicQueryActionPerformed
        Asthenis_Second_Dynamic_Query asdq = new Asthenis_Second_Dynamic_Query();
        asdq.setVisible(true);
        asdq.pack();
        asdq.setLocationRelativeTo(null);
        asdq.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButtonSecondDynamicQueryActionPerformed

    private void jButtonThirdDynamicQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThirdDynamicQueryActionPerformed
        Asthenis_Third_Dynamic_Query atdq = new Asthenis_Third_Dynamic_Query();
        atdq.setVisible(true);
        atdq.pack();
        atdq.setLocationRelativeTo(null);
        atdq.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButtonThirdDynamicQueryActionPerformed

    private void jButtonFourthDynamicQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFourthDynamicQueryActionPerformed
        Asthenis_Fourth_Dynamic_Query afdq = new Asthenis_Fourth_Dynamic_Query();
        afdq.setVisible(true);
        afdq.pack();
        afdq.setLocationRelativeTo(null);
        afdq.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButtonFourthDynamicQueryActionPerformed

    private void jButtonFirstStaticQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFirstStaticQueryActionPerformed
        try {
            // Δημιουργία αντικειμένου Statement
            stmt = dbConnection.createStatement();
            String selectQuery = "SELECT A.Onoma, A.Epwnymo, K.OraKratisis\n" +
                                 "FROM Kratisi K INNER JOIN Asthenis A ON K.IDAstheni=A.IDAstheni\n" +
                                 "WHERE K.OraKratisis >= '10:00' AND K.OraKratisis <= '15:00'\n" +
                                 "ORDER BY K.OraKratisis";
            rs = stmt.executeQuery(selectQuery);
            System.out.println("ΟΝΟΜΑ ΑΣΘΕΝΗ       ΕΠΩΝΥΜΟ ΑΣΘΕΝΗ      ΩΡΑ ΚΡΑΤΗΣΗΣ" );
            while(rs.next()) {
                String aname = rs.getString("Onoma");
                String asurname = rs.getString("Epwnymo");
                String time = rs.getString("OraKratisis");
                System.out.println(aname + "            " + asurname + "             " + time);
            }
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while(ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
    }//GEN-LAST:event_jButtonFirstStaticQueryActionPerformed

    private void jButtonSecondStaticQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSecondStaticQueryActionPerformed
        try {
            // Δημιουργία αντικειμένου Statement
            stmt = dbConnection.createStatement();
            String selectQuery = "SELECT A.Onoma, A.Epwnymo, K.HmeromhniaKratisis\n" +
                                 "FROM Kratisi K INNER JOIN Asthenis A ON K.IDAstheni=A.IDAstheni\n" +
                                 "WHERE K.HmeromhniaKratisis>='08/05/18'\n" +
                                 "AND K.HmeromhniaKratisis<='01/06/18'\n" +
                                 "ORDER BY K.HmeromhniaKratisis";
            rs = stmt.executeQuery(selectQuery);
            System.out.println("ΟΝΟΜΑ ΑΣΘΕΝΗ        ΕΠΩΝΥΜΟ ΑΣΘΕΝΗ       ΗΜΕΡΟΜΗΝΙΑ ΚΡΑΤΗΣΗΣ" );
            while(rs.next()) {
                String aname = rs.getString("Onoma");
                String asurname = rs.getString("Epwnymo");
                String date = rs.getString("HmeromhniaKratisis");
                System.out.println(aname + "             " + asurname + "                " + date);
            }
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while(ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
    }//GEN-LAST:event_jButtonSecondStaticQueryActionPerformed

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
                new LoginForm().setVisible(true);
            }
        });
    }
    
    static String     driverClassName = "oracle.jdbc.OracleDriver" ;
    static String     url = "jdbc:oracle:thin:@192.168.6.21:1521:dblabs" ;
    static Connection dbConnection = null;
    static String     username = "it144172";
    static String     passwd = "j@3teJi3";
    static Statement  stmt = null;
    static ResultSet rs = null;
    
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
    private javax.swing.JButton jButtonFirstDynamicQuery;
    private javax.swing.JButton jButtonFirstStaticQuery;
    private javax.swing.JButton jButtonFourthDynamicQuery;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonSecondDynamicQuery;
    private javax.swing.JButton jButtonSecondStaticQuery;
    private javax.swing.JButton jButtonThirdDynamicQuery;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
