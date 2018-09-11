
import java.awt.Frame;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import java.sql.*;
import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    
    public LoginForm() {
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
        jLabelClose = new javax.swing.JLabel();
        jLabelMinimize = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jUsernameTextField = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jButtonCancelLogin = new javax.swing.JButton();
        jLabelRegisterAsAsthenis = new javax.swing.JLabel();
        jLabelRegisterAsProswpiko = new javax.swing.JLabel();
        jLabelCreateAccount = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxUser = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ΙΔΙΩΤΙΚΗ ΚΛΙΝΙΚΗ \"ΠΟΛΥΚΡΑΤΗΣ\"");

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login Form");

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelClose)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelClose)
                    .addComponent(jLabelMinimize))
                .addGap(22, 22, 22))
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("Username:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setText("Password:");

        jUsernameTextField.setBackground(new java.awt.Color(108, 122, 137));
        jUsernameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jUsernameTextField.setForeground(new java.awt.Color(228, 241, 254));

        jPasswordField.setBackground(new java.awt.Color(108, 122, 137));
        jPasswordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField.setForeground(new java.awt.Color(228, 241, 254));
        jPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldKeyPressed(evt);
            }
        });

        jButtonLogin.setBackground(new java.awt.Color(34, 167, 240));
        jButtonLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin.setText("Login");
        jButtonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jButtonCancelLogin.setBackground(new java.awt.Color(242, 38, 19));
        jButtonCancelLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCancelLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelLogin.setText("Cancel");
        jButtonCancelLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelLoginActionPerformed(evt);
            }
        });

        jLabelRegisterAsAsthenis.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegisterAsAsthenis.setText("εισαγωγή στοιχείων Ασθενή");
        jLabelRegisterAsAsthenis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegisterAsAsthenis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegisterAsAsthenisMouseClicked(evt);
            }
        });

        jLabelRegisterAsProswpiko.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegisterAsProswpiko.setText("εισαγωγή στοιχείων Προσωπικού");
        jLabelRegisterAsProswpiko.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegisterAsProswpiko.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegisterAsProswpikoMouseClicked(evt);
            }
        });

        jLabelCreateAccount.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCreateAccount.setText("*** ΠΡΟΑΠΑΙΤΕΙΤΑΙ δημιουργία λογαριασμού ***");
        jLabelCreateAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCreateAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCreateAccountMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(236, 240, 241));
        jLabel6.setText("Επιλογή Χρήστη:");

        jComboBoxUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxUser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ασθενής", "Προσωπικό" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxUser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(293, 293, 293))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabelCreateAccount)
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelRegisterAsAsthenis)
                        .addGap(48, 48, 48)
                        .addComponent(jLabelRegisterAsProswpiko)
                        .addGap(215, 215, 215))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonCancelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(308, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCreateAccount))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRegisterAsAsthenis)
                    .addComponent(jLabelRegisterAsProswpiko))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizeMouseClicked

    private void jLabelRegisterAsAsthenisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegisterAsAsthenisMouseClicked
        RegisterFormAsAsthenis rfa = new RegisterFormAsAsthenis();
        // Λέω στο καινούργιο μου jFrame να εμφανιστεί στην οθόνη
        rfa.setVisible(true);
        // Φτιάχνω το μέγεθος του frame μου ώστε να με χωράει ανεξαρτήτως
        // (στο μικρότερο δυνατό μέγεθος) τα δεδομένα που θα του έχω βάλει
        rfa.pack();
        // Το κανω για να μου εμφανίζει το frame που μεταφέρομαι στη μέση
        // ανεξαρτήτως (το βάζω έτσι κι αλλιώς)
        rfa.setLocationRelativeTo(null);
        // ΜΕ ΤΟ ΠΟΥ ΠΑΤΗΣΩ ΤΟ ΚΟΚΚΙΝΟ " Χ " ΣΤΗΝ ΕΦΑΡΜΟΓΗ ΜΟΥ ΝΑ ΣΤΑΜΑΤΗΣΕΙ
        // ΝΑ ΤΡΕΧΕΙ ΤΟ ΠΡΟΓΡΑΜΜΑ ΣΤΟ ΚΑΙΝΟΥΡΓΙΟ ΜΟΥ FRAME!!!!!
        rfa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Κλείνω τελείως όλο το παράθυρό μου (το frame που βρίσκομαι αυτή τη στιγμή)
        this.dispose();
    }//GEN-LAST:event_jLabelRegisterAsAsthenisMouseClicked

    private void jLabelRegisterAsProswpikoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegisterAsProswpikoMouseClicked
        RegisterFormAsProswpiko rfp = new RegisterFormAsProswpiko();
        rfp.setVisible(true);
        rfp.pack();
        rfp.setLocationRelativeTo(null);
        rfp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelRegisterAsProswpikoMouseClicked

    private void jLabelCreateAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCreateAccountMouseClicked
        AccountForm af = new AccountForm();
        af.setVisible(true);
        af.pack();
        af.setLocationRelativeTo(null);
        af.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelCreateAccountMouseClicked

    private void jButtonCancelLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelLoginActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonCancelLoginActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        String uname = jUsernameTextField.getText();
        String pword = jPasswordField.getText();
        String option = jComboBoxUser.getSelectedItem().toString();
        
        if(uname.equals("") || pword.equals("")) {
            // 1. rootPane :  καταλαμβάνει το άδειο τμήμα του jFrame,
            // δηλ. είναι το jFrame στο οποίο βρίσκομαι (περιλαμβάνει όλα
            // τα περιεχόμενα του jFrame μου)
            // 2. 2η παράμετρος : το μήνυμα στην οθόνη
            // 3. 3η παράμετρος : ο τίτλος του παραθύρου
            // 4. Στην 4η παράμετρο το 1 είναι INFORMATION_MESSAGE
            JOptionPane.showMessageDialog(rootPane, "Some Fields Are Empty!!!", "ERROR", 1);
        } else {
            try {
                pst.setString(1, uname);
                pst.setString(2, pword);
                rs = pst.executeQuery();
                
                // Μεταφέρω το δρομέα κατά 1 θέση με τη next()
                if (rs.next()) {
                    // Παίρνω σαν 3η παράμετρο τον τύπο
                    String s1 = rs.getString("typos");
                    // Ξαναπαίρνω σαν παράμετρο το username (γιατί θα το βάλω
                    // στη νέα φόρμα για να εμφανίζεται στον τίτλο)
                    String un = rs.getString("username");
                    // Ελέγχω αν η επιλογή στο ComboBox είναι μία από αυτές
                    // που έχω στη στήλη Typos του πίνακα Login
                    if (option.equalsIgnoreCase("Ασθενής") && s1.equalsIgnoreCase("Ασθενής")) {
                        AsthenisForm af = new AsthenisForm(un);
                        // Μέθοδος που θα εμφανίζει μήνυμα "Login Successfully!!!"
                        // 1. Η 1η παράμετρος δείχνει τον υποδοχέα (container) που ανήκει το παράθυρο jOptionPane
                        // που με την τιμή null δείχνει ότι ανήκει στο jFrame
                        // 2. Η παράμετρος "Login Successfully!!!" είναι το κείμενο που θα εμφανίζεται στο παράθυρο
                        JOptionPane.showMessageDialog(null, "Login Successfully!!!");
                        af.setVisible(true);
                        setVisible(false);
                    }
                    if (option.equalsIgnoreCase("Προσωπικό") && s1.equalsIgnoreCase("Προσωπικό")) {
                        ProswpikoForm pf = new ProswpikoForm(un);
                        JOptionPane.showMessageDialog(null, "Login Successfully!!!");
                        pf.setVisible(true);
                        setVisible(false);
                    }
                } else {
                    // 1. rootPane :  καταλαμβάνει το άδειο τμήμα του jFrame,
                    // δηλ. είναι το jFrame στο οποίο βρίσκομαι (περιλαμβάνει όλα
                    // τα περιεχόμενα του jFrame μου)
                    // 2. 2η παράμετρος : το μήνυμα στην οθόνη
                    // 3. 3η παράμετρος : ο τίτλος του παραθύρου
                    // 4. Στην 4η παράμετρο το 1 είναι INFORMATION_MESSAGE
                    JOptionPane.showMessageDialog(rootPane, "Username or Password not matched!!!", "Login Error", 1);
                    jUsernameTextField.setText("");
                    jPasswordField.setText("");
                }
             } catch(SQLException ex) {
                 System.out.println("\n -- SQL Exception --- \n");
                 while(ex != null) {
                     System.out.println("Message: " + ex.getMessage());
                     ex = ex.getNextException();
                 }
             }
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String uname = jUsernameTextField.getText();
            String pword = jPasswordField.getText();
            String option = jComboBoxUser.getSelectedItem().toString();
            if(uname.equals("") || pword.equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Some Fields Are Empty!!!", "ERROR", 1);
            } else {
                try {
                    pst.setString(1, uname);
                    pst.setString(2, pword);
                    rs = pst.executeQuery();
                    
                    // Μεταφέρω το δρομέα κατά 1 θέση με τη next()
                    if (rs.next()) {
                        String s1 = rs.getString("typos");
                        String un = rs.getString("username");
                        if (option.equalsIgnoreCase("Ασθενής") && s1.equalsIgnoreCase("Ασθενής")) {
                            AsthenisForm af = new AsthenisForm(un);
                            JOptionPane.showMessageDialog(null, "Login Successfully!!!");
                            af.setVisible(true);
                            setVisible(false);
                        }
                        if (option.equalsIgnoreCase("Προσωπικό") && s1.equalsIgnoreCase("Προσωπικό")) {
                            ProswpikoForm pf = new ProswpikoForm(un);
                            JOptionPane.showMessageDialog(null, "Login Successfully!!!");
                            pf.setVisible(true);
                            setVisible(false);
                        }
                        // JOptionPane.showMessageDialog(null, "Login Successfully!!!");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Username or Password not matched!!!", "Login Error", 1);
                        jUsernameTextField.setText("");
                        jPasswordField.setText("");
                    }
                } catch(SQLException ex) {
                    System.out.println("\n -- SQL Exception --- \n");
                    while(ex != null) {
                        System.out.println("Message: " + ex.getMessage());
                        ex = ex.getNextException();
                    }
                }
            }
        }
    }//GEN-LAST:event_jPasswordFieldKeyPressed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }
    
    // Φόρτωμα του προγράμματος οδήγησης JDBC με χρήση της μεθόδου Class.forName
    // (ορίζω τον οδηγό για να το φορτώσω αργότερα => στην προκειμένη περίπτωση
    // για να συνδεθώ στην Oracle)
    static String     driverClassName = "oracle.jdbc.OracleDriver" ;
    // Ορισμός του URL για τη σύνδεση στη ΒΔ
    // url => πού βρίσκεται η βάση, ποιά είναι η θύρα, ποιό ειναι το ονομα;
    static String     url = "jdbc:oracle:thin:@192.168.6.21:1521:dblabs" ;
    // Ορίζω τη δικτυακή σύνδεση με τη ΒΔ
    static Connection dbConnection = null;
    static String     username = "it144172";
    static String     passwd = "j@3teJi3";
    // Ορίζω το PreparedStatement για να συμπληρώσω δυναμικά το SQL ερώτημά μου
    static PreparedStatement  pst = null;
    // Ορίζω το ResultSet όπου επιστρέφονται τα αποτελέσματα από ένα SELECT αίτημα
    static ResultSet rs = null;
    
    void myconnection() {
        try {
             Class.forName (driverClassName);
        } catch (ClassNotFoundException ex) { }
        try {
            // Δημιουργία της δικτυακής σύνδεσης με τη ΒΔ με χρήση url, username, password
            dbConnection = DriverManager.getConnection (url, username, passwd);
            String selectString = "SELECT * FROM Login WHERE username=? AND password=?";
            pst = dbConnection.prepareStatement(selectString);
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while(ex != null) {
		System.out.println("Message: " + ex.getMessage());
		ex = ex.getNextException();
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelLogin;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JComboBox jComboBoxUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelCreateAccount;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLabel jLabelRegisterAsAsthenis;
    private javax.swing.JLabel jLabelRegisterAsProswpiko;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jUsernameTextField;
    // End of variables declaration//GEN-END:variables
}