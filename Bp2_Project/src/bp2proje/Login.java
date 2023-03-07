/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bp2proje;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Selin Sude ATALI
 */
public class Login extends javax.swing.JFrame {

    String username_l = "";
    int id_l = 0;
    String type = "";

    /*
    SetResizable(false) kullanarak panelimin olduğu boyutta kalmasını,maksimum hale getirilememesini sağlıyorum.
     */
    public Login() {
        initComponents();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        lbl_username = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        checkbox_show = new javax.swing.JCheckBox();
        radiobtn_client = new javax.swing.JRadioButton();
        radiobtn_estateagent = new javax.swing.JRadioButton();
        btn_login = new javax.swing.JButton();
        btn_sign = new javax.swing.JButton();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_forgot = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        label_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 450));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel1KeyPressed(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setMinimumSize(new java.awt.Dimension(700, 450));
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 450));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_username.setText("Username:");
        jPanel2.add(lbl_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 100, 30));

        lbl_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_password.setText("Password:");
        jPanel2.add(lbl_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 100, 30));

        checkbox_show.setText("Show Password");
        checkbox_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_showActionPerformed(evt);
            }
        });
        checkbox_show.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                radiobtn_clientKeyPressed(evt);
            }
        });
        jPanel2.add(checkbox_show, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 120, 30));

        buttonGroup1.add(radiobtn_client);
        radiobtn_client.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radiobtn_client.setText("Client");
        radiobtn_client.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                radiobtn_clientKeyPressed(evt);
            }
        });
        jPanel2.add(radiobtn_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 100, 30));

        buttonGroup1.add(radiobtn_estateagent);
        radiobtn_estateagent.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radiobtn_estateagent.setText("Estate Agent");
        radiobtn_estateagent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                radiobtn_clientKeyPressed(evt);
            }
        });
        jPanel2.add(radiobtn_estateagent, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 100, 30));

        btn_login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon_images/login.png"))); // NOI18N
        btn_login.setText("Login");
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_loginMouseClicked(evt);
            }
        });
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel2.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 130, 30));

        btn_sign.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_sign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon_images/sign-in.png"))); // NOI18N
        btn_sign.setText("Sign in");
        btn_sign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_signMouseClicked(evt);
            }
        });
        btn_sign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signActionPerformed(evt);
            }
        });
        jPanel2.add(btn_sign, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 120, 30));

        txt_username.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                radiobtn_clientKeyPressed(evt);
            }
        });
        jPanel2.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 140, 30));

        txt_password.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                radiobtn_clientKeyPressed(evt);
            }
        });
        jPanel2.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 140, 30));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 32, 31, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 255));
        jLabel5.setText("User Login Screen");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 30));

        lbl_forgot.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_forgot.setText("Forgot password?");
        lbl_forgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_forgotMouseClicked(evt);
            }
        });
        jPanel2.add(lbl_forgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 130, 20));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText(" Welcome To Real Estate Selin!\n");
        jScrollPane2.setViewportView(jTextArea2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 300, 270));

        label_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon_images/bluebacckground.jpg"))); // NOI18N
        label_background.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        label_background.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                radiobtn_clientKeyPressed(evt);
            }
        });
        jPanel2.add(label_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*
    Eğer show password seçildiyse kullanıcı şifresini bir textfield da olduğu gibi görebiliyor.Eğer seçili değilse
    her karakter * ile gizleniyor.
     */
    private void checkbox_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_showActionPerformed
        // TODO add your handling code here:
        if (checkbox_show.isSelected()) {
            txt_password.setEchoChar((char) 0);
        } else {
            txt_password.setEchoChar('*');
        }
    }//GEN-LAST:event_checkbox_showActionPerformed
    /*
    Kullanıcı client mı estate agent mı bunu seçmek zorunda ona göre home ekranım açılıyor.Eğer hiçbir şey seçmezse kullanıcıya bir uyarı
    veriyorum. ResultSet ile Records database'imi kontrol ediyorum ve eğer ilgili satırdaki type,kullanıcı adı ve şifre aynı anda eşleşiyorsa
    kullanıcının daha önceden belirlediğim boolean login'in değerini true yapıyorum. Eğer login==true ise kullanıcıya bir uyarı mesajı verip 
    kullanıcının type'ına göre home ekranımı açıyorum.Client ise home_client,estate agent ise home ekranımı açıyorum ve bazı belirlediğim değerleri
    vize sınavında da yaptığım gibi diğer frame bilgilerime aktarıyorum. Eğer login==false giriş başarısız olduğunu kullanıcıya uyarı ekranı ile
    bildiriyorum.
     */
    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        String url = "jdbc:derby://localhost:1527/Records";
        String user = "Selin";
        String password = "123";
        String type = "";
        String sifre = new String(txt_password.getPassword());
        boolean login = false;
        if (radiobtn_client.isSelected() == true) {
            type = "Client";
        } else if (radiobtn_estateagent.isSelected() == true) {
            type = "Estate Agent";
        } else {
            JOptionPane.showMessageDialog(null, "You have to choose a type", "Warning!", JOptionPane.INFORMATION_MESSAGE);
        }
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM RECORDS");
            while (rs.next()) {
                if ((rs.getString(4).equals(type)) && (rs.getString(5).equals(txt_username.getText())) && (rs.getString(7).equals(sifre))) {
                    id_l = rs.getInt(1);
                    username_l = rs.getString(5);
                    type = rs.getString(4);
                    login = true;
                }
            }
            if (login == true) {
                JOptionPane.showMessageDialog(null, "Login success", "Information", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                if (radiobtn_client.isSelected()) {
                    Home_client home_client = new Home_client();
                    home_client.username_h = username_l;
                    home_client.type = type;
                    home_client.setVisible(true);

                } else if (radiobtn_estateagent.isSelected() == true) {
                    Home home = new Home();
                    home.id = id_l;
                    home.username_h = username_l;
                    home.type = type;
                    home.setVisible(true);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Login Failed. Incompatible username, password or type", "Warning", JOptionPane.ERROR_MESSAGE);
            }

            st.close();
            conn.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Login Failed.", "Warning", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_loginActionPerformed
    /*
    Eğer kullanıcı sisteme kayıtlı değilse sign in butonuna bastığında Register ekranım açılıyor. Burada login ekranımı kapatmak istemiyorum 
    bu yüzden bir kod yazmadım ama eğer kayıt olursa kullanıcı Register ekranını yazdığım SetDefaultCloseOperation komutu ile sadece Register ekranını
    kapatıp login ekranımdan devam edebiliyorum. setLocationRelativeto komutu ile de açılan frame'in ekranımın ortasında açılmasını sağlıyorum.
     */
    private void btn_signActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signActionPerformed
        // TODO add your handling code here:
        Register register = new Register();
        register.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        register.setLocationRelativeTo(null);
        register.setVisible(true);

    }//GEN-LAST:event_btn_signActionPerformed
    /*
    Hangi butona tıkladığımı belirtmek için tıkladığım butonun rengini cyan diğerini ise white yapıyorum.
     */
    private void btn_signMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_signMouseClicked
        // TODO add your handling code here:
        btn_sign.setBackground(Color.CYAN);
        btn_login.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn_signMouseClicked

    private void btn_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseClicked
        // TODO add your handling code here:
        btn_login.setBackground(Color.CYAN);
        btn_sign.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn_loginMouseClicked
    /*
    Eğer kullanıcı şifresini unutursa şifresini çeşitli doğrulamaları yaparak değiştirmesini istiyorum. Bunun içinde primary key olan id 
    verimden yararlanıyorum. Kullanıcıdan JoptionPane aracılığı ile bir input alıyorum ve bunu bir text'e kaydediyorum. Burada kullanıcıdan
    input olarak id değerini alıyorum. boolean veri tipinde check adında bir variable atıyorum. Eğer id ve girilen username aynı anda eşitse
    kullanıcıdan tekrar showInputDialog sayesinde kullanıcıdan yeni şifresini alıyorum ve burada sql'in update komutundan yararlanıyorum.
    Database'de id'nin girdiğim id ile eşit olduğu anda kullanıcının şifresini değiştiriyorum ve bu işlem başarılıysa check'i true yapıyorum. 
    Bu check durumuna göre kullanıcıya bir mesaj gösteriyorum. 
     */
    private void lbl_forgotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_forgotMouseClicked
        // TODO add your handling code here:
        String url = "jdbc:derby://localhost:1527/Records";
        String user = "Selin";
        String password = "123";
        String sifre = new String(txt_password.getPassword());
        String text = JOptionPane.showInputDialog(rootPane, "Please enter id", "Change Password", JOptionPane.INFORMATION_MESSAGE);
        int value = Integer.parseInt(text);
        String newpassword = "";
        boolean check = false;

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM RECORDS");
            String query = "UPDATE records set password=? where id =" + value;
            PreparedStatement ps = conn.prepareStatement(query);
            while (rs.next()) {
                if ((rs.getString(5).equals(txt_username.getText())) && (rs.getInt(1) == value)) {
                    newpassword = JOptionPane.showInputDialog(rootPane, "Please enter password", "Change Password", JOptionPane.INFORMATION_MESSAGE);
                    ps.setString(1, newpassword);
                    ps.executeUpdate();
                    check = true;
                }
            }
            if (check == true) {
                JOptionPane.showMessageDialog(null, "Update correctly", "Information", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Wrong username or id", "Warning", JOptionPane.INFORMATION_MESSAGE);
            }
            ps.close();
            st.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_lbl_forgotMouseClicked

    private void jLabel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1KeyPressed
    /*
    Kullanıcı eğer bilgilerini girdiyse herhangi bir şeyin üzerinde enter tuşuna bastığında doclick metodu ile btn_login'e basıldığında olacak
    eylemleri çağırıyorum.
    
     */
    private void radiobtn_clientKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radiobtn_clientKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            btn_login.doClick();
            btn_login.setBackground(Color.CYAN);
            btn_sign.setBackground(Color.WHITE);
        }

    }//GEN-LAST:event_radiobtn_clientKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login login = new Login();
                login.setLocationRelativeTo(null);
                login.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_sign;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkbox_show;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel label_background;
    private javax.swing.JLabel lbl_forgot;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JRadioButton radiobtn_client;
    private javax.swing.JRadioButton radiobtn_estateagent;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
