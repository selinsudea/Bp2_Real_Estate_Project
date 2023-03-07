/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bp2proje;

import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Selin Sude ATALI
 */
public class List extends javax.swing.JFrame {

    String username_list = "";

    public List() {
        initComponents();

    }

    /*
    Normalde House sınıfımda bir houseList metodum var ama ben bu List frame'imde emlakçının sadece sisteme eklediği kendi evlerini görmesini istiyorum.
    Bunun içinde eğer Home'dan bana gelen username(bunu kullanıcıya sormuyorum login ekranından beri elimde tutuyorum) House databasesimde 3.sütunundaki
    username eşitse table da göstereceğim. Veritipi House sınıfım olan bir Arraylist oluşturuyorum.Yani sadece uygun formda veritipi kabul edebilir.
    House'dan bir nesne üreterek bunu house sınıfında belirlediğim variable'larıma atıyorum ve oluşturduğum houseList'e bunu add fonksiyonu ile ekliyorum.
    Return olarak houseList döndürüyorum. Bu Arraylist'i showhouse metodumda kullanacağım.
     */
    public ArrayList<House> houseList() {
        ArrayList<House> houseList = new ArrayList<>();
        String url = "jdbc:derby://localhost:1527/Records";
        String user = "Selin";
        String password = "123";
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            String query = "SELECT *FROM house";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            House house;
            while (rs.next()) {
                if (rs.getString(3).equals(username_list)) {
                    house = new House(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getBoolean(7), rs.getInt(8), rs.getBoolean(9), rs.getString(10), rs.getDouble(11), rs.getBytes(12), rs.getBytes(13), rs.getBytes(14));
                    houseList.add(house);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(List.class.getName()).log(Level.SEVERE, null, ex);
        }
        return houseList;
    }

    /*
    Öncelikle houseList metodumu çağırıyorum ve bana oradan kullanıcının evlerinin bilgisi geliyor.Bunları oluşturduğum Table eklemek için bir 
    for döngüsünden yararlanıyorum ama evin bütün bilgilerinin sisteme eklenmesini istemediğim için sadece 9 sütunluk bir table oluşturuyorum ve eğer
    kullanıcı hangi eve tıkladıysa onun bütün özelliklerini o zaman görecek.  Burada önceden gelen evin fotoğraflarını direkt label'a aktarıyordum ama
    araştırmalarım sonucunda Java'nın DefaultTableCellRenderer özelliğinden yararlanıyorum.Burada kullandığım setDefaultRenderer eğer herhangi bir renderer ayarlanmamışsa
    kullanılacak varsayılan default cell renderer oluşturucuyu ayarlar. İlk parametre columnClass = bu columnClass için 
    set default cell renderer ayarlar. 2.parametre renderer bu columnClass için default cell renderer.
     */
    public void show_house() {

        ArrayList<House> list = houseList();
        jTable_Display_User.setDefaultRenderer(Object.class, new TablaImagen());
        DefaultTableModel model = (DefaultTableModel) jTable_Display_User.getModel();
        Object[] row = new Object[9];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).id;
            row[1] = list.get(i).username;
            row[2] = list.get(i).type;
            row[3] = list.get(i).city;
            row[4] = list.get(i).rooms;
            row[5] = list.get(i).square;
            row[6] = list.get(i).forhouse;
            row[7] = list.get(i).cost;
            if (list.get(i).image != null) {
                ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).image).getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH));
                row[8] = new JLabel(image);
            }
            model.addRow(row);
            jTable_Display_User.setModel(model);
            jTable_Display_User.setRowHeight(150);
        }
    }

    /*
    TableCellRenderer Jtable hücresini görünteleyen bir bileşen oluşturur. Her tablo hücresinin değerini görüntülemek için JLabel'i kullanır.
     */
    public class TablaImagen extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if (value instanceof JLabel) {
                JLabel lbl = (JLabel) value;
                return lbl;
            }

            return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_User = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 500));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jTable_Display_User.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Username", "Type", "City", "Rooms", "Square", "Forhouse", "Cost", "Photo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Display_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_UserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display_User);

        getContentPane().add(jScrollPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*
    Jtable da seçtiğim rowun değerini bir variable kaydediyorum.O satırdaki id değerini id 0.indeximde bulunuyor bunun bir değişkene kaydediyorum 
    Image_show frame'ime aktarıyorum.Burada bu id numarası sayesinde database'imden eğer kullanıcı evi silmek isterse kolayca silebilir ve list metodunu çağırıyorum
    list metodu ile seçilen rowun indexinin houseListte karşılık gelen evin özellikleri ekranda gösteriliyor.
    */
    private void jTable_Display_UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Display_UserMouseClicked
        // TODO add your handling code here:
        int i = jTable_Display_User.getSelectedRow();
        int value = (int) jTable_Display_User.getValueAt(i, 0);
        Image_showestate show_estate = new Image_showestate();
        show_estate.i = i;
        show_estate.index = value;
        show_estate.username_i = username_list;
        show_estate.setLocationRelativeTo(null);
        show_estate.list();
        show_estate.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jTable_Display_UserMouseClicked

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
            java.util.logging.Logger.getLogger(List.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(List.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(List.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(List.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new List().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_User;
    // End of variables declaration//GEN-END:variables
}
