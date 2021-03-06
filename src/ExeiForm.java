import javax.swing.JFrame;

public class ExeiForm extends javax.swing.JFrame {

    /**
     * Creates new form ExeiForm
     */
    public ExeiForm() {
        initComponents();
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
        jButtonShowPatients = new javax.swing.JButton();
        jButtonShowDoctors = new javax.swing.JButton();
        jButtoniManageKratisi = new javax.swing.JButton();
        jButtonShowExei = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Διαχείριση του Πίνακα Έχει");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jButtonShowPatients.setBackground(new java.awt.Color(108, 199, 249));
        jButtonShowPatients.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonShowPatients.setForeground(new java.awt.Color(255, 255, 255));
        jButtonShowPatients.setText("ΕΜΦΑΝΙΣΗ ΠΙΝΑΚΑ ΠΡΟΣΩΠΙΚΟΥ");
        jButtonShowPatients.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonShowPatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowPatientsActionPerformed(evt);
            }
        });

        jButtonShowDoctors.setBackground(new java.awt.Color(65, 131, 215));
        jButtonShowDoctors.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonShowDoctors.setForeground(new java.awt.Color(255, 255, 255));
        jButtonShowDoctors.setText("ΕΜΦΑΝΙΣΗ ΠΙΝΑΚΑ ΓΙΑΤΡΩΝ");
        jButtonShowDoctors.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonShowDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowDoctorsActionPerformed(evt);
            }
        });

        jButtoniManageKratisi.setBackground(new java.awt.Color(38, 166, 91));
        jButtoniManageKratisi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtoniManageKratisi.setForeground(new java.awt.Color(255, 255, 255));
        jButtoniManageKratisi.setText("ΔΙΑΧΕΙΡΙΣΗ ΣΤΟΙΧΕΙΩΝ ΕΧΕΙ");
        jButtoniManageKratisi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtoniManageKratisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoniManageKratisiActionPerformed(evt);
            }
        });

        jButtonShowExei.setBackground(new java.awt.Color(148, 124, 176));
        jButtonShowExei.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonShowExei.setForeground(new java.awt.Color(255, 255, 255));
        jButtonShowExei.setText("ΕΜΦΑΝΙΣΗ ΣΤΟΙΧΕΙΩΝ ΠΙΝΑΚΑ ΕΧΕΙ");
        jButtonShowExei.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonShowExei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowExeiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonShowDoctors, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonShowPatients)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jButtonExitPage))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonShowExei, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtoniManageKratisi, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(203, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jButtonShowPatients, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButtonShowDoctors, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButtonShowExei, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButtoniManageKratisi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButtonExitPage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jButtonExitPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitPageActionPerformed
        this.dispose();

    }//GEN-LAST:event_jButtonExitPageActionPerformed

    private void jButtonShowPatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowPatientsActionPerformed
        ProswpikoTable pt = new ProswpikoTable();
        pt.setVisible(true);
        pt.pack();
        pt.setLocationRelativeTo(null);
        pt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButtonShowPatientsActionPerformed

    private void jButtonShowDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowDoctorsActionPerformed
        GiatrosTable gt = new GiatrosTable();
        gt.setVisible(true);
        gt.pack();
        gt.setLocationRelativeTo(null);
        gt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButtonShowDoctorsActionPerformed

    private void jButtoniManageKratisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoniManageKratisiActionPerformed
        ManageExeiForm mef = new ManageExeiForm();
        mef.setVisible(true);
        mef.pack();
        mef.setLocationRelativeTo(null);
        mef.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtoniManageKratisiActionPerformed

    private void jButtonShowExeiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowExeiActionPerformed
        ExeiDataTable edt = new ExeiDataTable();
        edt.setVisible(true);
        edt.pack();
        edt.setLocationRelativeTo(null);
        edt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButtonShowExeiActionPerformed

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
                new ExeiForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExitPage;
    private javax.swing.JButton jButtonShowDoctors;
    private javax.swing.JButton jButtonShowExei;
    private javax.swing.JButton jButtonShowPatients;
    private javax.swing.JButton jButtoniManageKratisi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
