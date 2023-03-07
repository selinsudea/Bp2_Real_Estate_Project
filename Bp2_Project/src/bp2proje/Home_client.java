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
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author Selin Sude ATALI
 */
public class Home_client extends javax.swing.JFrame {

    String type = "";
    String username_h = "";
    int id = 0;

    /*
    SetResizable(false) kullanarak panelimin olduğu boyutta kalmasını,maksimum hale getirilememesini sağlıyorum.
     */
    public Home_client() {
        initComponents();
        setResizable(false);
    }

    /*
    paint metodunu override ediyorum ve Jpanel2'e paintComponents ile graphics2D'yi tanımlıyorum.
    İlk olarak graphics'in BasicStroke ile kalınlığını belirliyorum ve bunu ilgili graphics'ime ekliyorum. Daha sonra drawRoundRect ile 
    şeklimi oluşturuyorum. İkinci bir şekil olarak ise oluşturduğum RoundRect'in içine yazı eklemek istiyorum bunun içinde drawString metodundan
    yararlanıyorum.
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        jPanel2.paintComponents(g2d);
        BasicStroke stroke = new BasicStroke(5, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
        g2d.setStroke(stroke);
        g2d.drawRoundRect(175, 70, 270, 80, 20, 40);
        g2d.setFont(new Font(Font.SANS_SERIF, Font.BOLD | Font.ITALIC, 27));
        g2d.setStroke(stroke);
        g2d.drawString("Real Estate Selin", 200, 120);
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
        jPanel2 = new javax.swing.JPanel();
        lbl_text = new javax.swing.JLabel();
        btn_buy = new javax.swing.JButton();
        btn_settings = new javax.swing.JButton();
        btn_quit = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 450));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 450));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        lbl_text.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(lbl_text, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lbl_text, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 110));

        btn_buy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_buy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon_images/shopping-cart.png"))); // NOI18N
        btn_buy.setText("Buy");
        btn_buy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_buyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_buyMouseExited(evt);
            }
        });
        btn_buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buyActionPerformed(evt);
            }
        });
        jPanel1.add(btn_buy, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 120, 60));

        btn_settings.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon_images/settings.png"))); // NOI18N
        btn_settings.setText("Settings");
        btn_settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_settingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_settingsMouseExited(evt);
            }
        });
        btn_settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_settingsActionPerformed(evt);
            }
        });
        jPanel1.add(btn_settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 140, 60));

        btn_quit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_quit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon_images/log-out.png"))); // NOI18N
        btn_quit.setText("Quit");
        btn_quit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_quitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_quitMouseExited(evt);
            }
        });
        btn_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quitActionPerformed(evt);
            }
        });
        jPanel1.add(btn_quit, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 120, 60));

        getContentPane().add(jPanel1);

        jMenu1.setText("File");

        jCheckBoxMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jCheckBoxMenuItem1.setText("Change Color");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jCheckBoxMenuItem2.setText("Dark Thema");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem2);

        jCheckBoxMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("White Thema");
        jCheckBoxMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/*
    Quit butonuna basıldığında kullanıcıya JoptionPane ile Yes No option olarak iki seçenk sunuyorum.Eğer kullanıcı "yes" seçerse geriye 0 değeri
    dönüyor ve Home ekranını kapatıp Login ekranına geri yönlendiriyorum.Eğer "no" option seçerse geriye 1 değeri döndüğünden eğer value==1 ise 
    Home ekranında kalmaya devam ediyor.
     */
    private void btn_quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quitActionPerformed
        // TODO add your handling code here:
        int value = JOptionPane.showConfirmDialog(null, "Are you sure to quit?", "Warning!", JOptionPane.YES_NO_OPTION);
        if (value == 0) {
            this.dispose();
            Login login = new Login();
            login.setLocationRelativeTo(null);
            login.setVisible(true);
        } else if (value == 1) {
            JOptionPane.showMessageDialog(null, "Okey you are here.", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_quitActionPerformed
    /*
    Eğer btn_settings'e basılırsa Setting frame'imi açıyorum.setLocationRelativeTo ile ekranımın ortasında açılmasını sağlıyorum.
    dispose()ile ise Home ekranımı kapatıyorum.Kullanıcının id'sini ve username'ini login ekranından beri kullanıcıya sormadan bazı işlemlerin
    doğruluğu için alıyorum.
     */
    private void btn_settingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_settingsActionPerformed
        // TODO add your handling code here:
        Settings settings = new Settings();
        settings.setLocationRelativeTo(null);
        settings.id = id;
        settings.username = username_h;
        settings.type = type;
        this.dispose();
        settings.setVisible(true);

    }//GEN-LAST:event_btn_settingsActionPerformed
    /*
      Kullanıcı hangi butonunun üzerindeyse butonun arkaplanının rengini pink, butondan çıktığında ise light gray yapıyorum.
     
     */
    private void btn_settingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_settingsMouseEntered
        // TODO add your handling code here:
        btn_settings.setBackground(Color.PINK);
    }//GEN-LAST:event_btn_settingsMouseEntered

    private void btn_settingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_settingsMouseExited
        // TODO add your handling code here:
        btn_settings.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btn_settingsMouseExited

    private void btn_buyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buyMouseExited
        // TODO add your handling code here:
        btn_buy.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btn_buyMouseExited

    private void btn_quitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_quitMouseEntered
        // TODO add your handling code here:
        btn_quit.setBackground(Color.PINK);
    }//GEN-LAST:event_btn_quitMouseEntered

    private void btn_quitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_quitMouseExited
        // TODO add your handling code here:
        btn_quit.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btn_quitMouseExited

    private void btn_buyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buyMouseEntered
        // TODO add your handling code here:
        btn_buy.setBackground(Color.PINK);
    }//GEN-LAST:event_btn_buyMouseEntered
    /*
    Eğer menu de Change color'ı seçerse ilk olarak hangi renk seçili olarak gelecek ise initialcolor da onu belirtiyorum.Daha sonra kullanıcının
    seçtiği rengi panellerimde setbackground() metodu ile değiştiriyorum. Checkbox menu kullandığımdan dolayı diğer menulerin seçilme durumunu false
    yapıyorum.Bu olayda Real Estate Selin bölümününde de rengini değiştiriyorum.
     */
    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        // TODO add your handling code here:
        Color initialcolor = Color.MAGENTA;
        Color color = JColorChooser.showDialog(this, "Select a color", initialcolor);
        jPanel1.setBackground(color);
        jPanel2.setBackground(color);
        jCheckBoxMenuItem2.setSelected(false);
        jCheckBoxMenuItem3.setSelected(false);
        lbl_text.setText("Real Estate Selin");


    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed
    /*
    Eğer kullanıcı koyu modda kullanmak istiyorsa  jPanel1'in arkaplanını gray yapıyorum. Ama yine de Real Estate Selin yazımın olduğu bölümün 
    rengini ilk belirlediğim renk olarak kalmasını istediğimden onu da setBackground ile düzeltiyorum.Checkbox menu kullandığımdan dolayı diğer menulerin seçilme durumunu false
    yapıyorum.
     */
    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        // TODO add your handling code here:
        jPanel1.setBackground(Color.GRAY);
        Color color = new Color(255, 0, 153);
        jPanel2.setBackground(color);
        jCheckBoxMenuItem3.setSelected(false);
        jCheckBoxMenuItem1.setSelected(false);
        lbl_text.setText("Real Estate Selin");

    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed
    /*
    Eğer kullanıcı ilk modda kullanmak istiyorsa  jPanel1'in arkaplanını white yapıyorum. Ama yine de Real Estate Selin yazımın olduğu bölümün 
    rengini ilk belirlediğim renk olarak kalmasını istediğimden onu da setBackground ile düzeltiyorum.Checkbox menu kullandığımdan dolayı diğer menulerin seçilme durumunu false
    yapıyorum.
     */
    private void jCheckBoxMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem3ActionPerformed
        // TODO add your handling code here:
        jPanel1.setBackground(Color.WHITE);
        Color color = new Color(255, 0, 153);
        jPanel2.setBackground(color);
        jCheckBoxMenuItem2.setSelected(false);
        jCheckBoxMenuItem1.setSelected(false);
        lbl_text.setText("Real Estate Selin");
    }//GEN-LAST:event_jCheckBoxMenuItem3ActionPerformed
    /*
    Kullanıcı buy  butonuna bastığında List_buy frame'ini çağırıyorum ve yine diğer framelerimde yaptığım gibi loginden aldığım id ve username
    değerlerini list_buy frame'ine de aktarıyorum.Ekranımın ortasında açılmasını istediğimden dolayı setLocationRelativeTo özelliğini kullanıyorum.
     */
    private void btn_buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buyActionPerformed
        // TODO add your handling code here:
        List_buy list = new List_buy();
        list.show_house();
        list.username_list = username_h;
        list.setLocationRelativeTo(null);
        list.setVisible(true);

    }//GEN-LAST:event_btn_buyActionPerformed

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
            java.util.logging.Logger.getLogger(Home_client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buy;
    private javax.swing.JButton btn_quit;
    private javax.swing.JButton btn_settings;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_text;
    // End of variables declaration//GEN-END:variables
}
