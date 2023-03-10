/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bp2proje;

import java.awt.BasicStroke;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Selin Sude ATALI
 */
public class Image_show extends javax.swing.JFrame {

    int id_user = 0;
    String username_image = "";
    int index = 0;
    int i = 0;
    int choose = 1;
    DefaultListModel model = new DefaultListModel();

    /*
    SetResizable(false) kullanarak panelimin olduğu boyutta kalmasını,maksimum hale getirilememesini sağlıyorum.
     */
    public Image_show() {
        initComponents();
        setResizable(false);
        list_house.setModel(model);
    }

    /*
    Öncelikle House sınıfından bir nesne oluşturuyorum ve house sınıfındaki houseList metodumu çağırıyorum ve oradan House database'imde bulunan 
    tüm evlerin bilgisi bir arrayliste kaydolarak geliyor.i dediğim değer kullanıcın kaçıncı evi seçtiği kaçıncı evi seçtiyse houseList'imde o indexteki
    elemanın özelliklerini DefaultListModel'e kaydediyorum ve ekranda istediğim formda görünmesini sağlıyorum.
     */
    public void list() {
        House house = new House();
        ArrayList<House> list = house.houseList();
        ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).image).getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH));
        lbl_image.setIcon(image);
        String furnished = "";
        String balcony = "";
        if (list.get(i).furnished == true) {
            furnished = "Furnished";
        } else {
            furnished = "Unfurnished";
        }
        if (list.get(i).balcony == true) {
            balcony = "Yes";
        } else {
            balcony = "No";
        }
        model.addElement("Id: " + list.get(i).id);
        model.addElement("Estate Agent: " + list.get(i).username);
        model.addElement("Type: " + list.get(i).type);
        model.addElement("City: " + list.get(i).city);
        model.addElement("Rooms: " + list.get(i).rooms);
        model.addElement("Balcony: " + balcony);
        model.addElement("Square: " + list.get(i).square);
        model.addElement("Furnished: " + furnished);
        model.addElement("Forhouse: " + list.get(i).forhouse);
        model.addElement("Cost: " + list.get(i).cost);

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
        lbl_image = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_house = new javax.swing.JList<>();
        btn_next = new javax.swing.JButton();
        btn_before = new javax.swing.JButton();
        btn_buy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 500));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(750, 500));

        lbl_image.setMaximumSize(new java.awt.Dimension(300, 300));
        lbl_image.setMinimumSize(new java.awt.Dimension(300, 300));
        lbl_image.setPreferredSize(new java.awt.Dimension(300, 300));

        jScrollPane1.setViewportView(list_house);

        btn_next.setBackground(new java.awt.Color(240, 65, 119));
        btn_next.setText("Next");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        btn_before.setBackground(new java.awt.Color(240, 65, 119));
        btn_before.setText("Before");
        btn_before.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_beforeActionPerformed(evt);
            }
        });

        btn_buy.setBackground(new java.awt.Color(240, 65, 119));
        btn_buy.setText("Buy");
        btn_buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_before, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_buy, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_image, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_before, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buy, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*
    Burada choose adında bir variable tanımlamıştım bu choose başta 1 olarak geliyor eğer kullanıcı before butonuna basarsa ilgili evin bir önceki yani 
    listteki 0.indexteki fotoğrafını gösteriyor.Eğer next butonuna basmışsa 2.indextekini gösteriyor.Bu şekilde hangi sayıdaysa ona göre choose güncelleniyor
    ve buna göre görseller geliyor.
     */
    private void btn_beforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_beforeActionPerformed
        // TODO add your handling code here:
        House house = new House();
        ArrayList<House> list = house.houseList();

        if (choose == 2) {
            ImageIcon image2 = new ImageIcon(new ImageIcon(list.get(i).image2).getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH));
            lbl_image.setIcon(image2);
            choose--;
        } else if (choose == 1) {
            ImageIcon image1 = new ImageIcon(new ImageIcon(list.get(i).image).getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH));
            lbl_image.setIcon(image1);
        }
    }//GEN-LAST:event_btn_beforeActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        // TODO add your handling code here:
        House house = new House();
        ArrayList<House> list = house.houseList();

        if (choose == 1) {
            ImageIcon image2 = new ImageIcon(new ImageIcon(list.get(i).image2).getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH));
            lbl_image.setIcon(image2);
            choose++;
        } else if (choose == 2) {
            ImageIcon image3 = new ImageIcon(new ImageIcon(list.get(i).image3).getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH));
            lbl_image.setIcon(image3);
        }
    }//GEN-LAST:event_btn_nextActionPerformed
    /*
    Eğer kullanıcı buy butonuna basarsa öncelikle showConfirmDialog ile Are you sure to buy diye soruyorum eğer Yes option seçerse 
    List'den aldığım index yani id değerinin database bulunduğu yerdeki evi sildiriyorum ve database'i güncelliyorum.
     */
    private void btn_buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buyActionPerformed
        // TODO add your handling code here:
        {
            ArrayList<House> houseList = new ArrayList<>();
            String url = "jdbc:derby://localhost:1527/Records";
            String user = "Selin";
            String password = "123";

            boolean check = false;

            if (username_image != ("")) {
                int value = JOptionPane.showConfirmDialog(null, "Are you sure to buy?", "Warning", JOptionPane.YES_NO_OPTION);
                if (value == JOptionPane.YES_OPTION) {
                    try {
                        Connection conn = DriverManager.getConnection(url, user, password);
                        String query = "DELETE FROM house WHERE id=?";
                        PreparedStatement ps = conn.prepareStatement(query);
                        ps.setInt(1, index);
                        ps.executeUpdate();
                        ps.close();
                        conn.close();
                        JOptionPane.showMessageDialog(null, "You bought this house.", "Warning", JOptionPane.INFORMATION_MESSAGE);
                    } catch (SQLException ex) {
                        Logger.getLogger(Image_show.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You didnt buy this house.", "Warning", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        }
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
            java.util.logging.Logger.getLogger(Image_show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Image_show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Image_show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Image_show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Image_show().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_before;
    private javax.swing.JButton btn_buy;
    private javax.swing.JButton btn_next;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JList<String> list_house;
    // End of variables declaration//GEN-END:variables
}
