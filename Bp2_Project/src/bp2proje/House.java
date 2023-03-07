/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bp2proje;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Selin Sude ATALI
 */
public class House {

    int id;
    int usernameid;
    String username;
    String type;
    String city;
    int rooms;
    boolean balcony;
    int square;
    boolean furnished;
    String forhouse;
    double cost;
    byte[] image;
    byte[] image2;
    byte[] image3;

    public House() {
    }

    public House(int id, int usernameid, String username, String type, String city, int rooms, boolean balcony, int square, boolean furnished, String forhouse, double cost, byte[] image, byte[] image2, byte[] image3) {
        this.id = id;
        this.usernameid = usernameid;
        this.username = username;
        this.type = type;
        this.city = city;
        this.rooms = rooms;
        this.balcony = balcony;
        this.square = square;
        this.furnished = furnished;
        this.forhouse = forhouse;
        this.cost = cost;
        this.image = image;
        this.image2 = image2;
        this.image3 = image3;
    }

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
                house = new House(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getBoolean(7), rs.getInt(8), rs.getBoolean(9), rs.getString(10), rs.getDouble(11), rs.getBytes(12), rs.getBytes(13), rs.getBytes(14));
                houseList.add(house);

            }
        } catch (SQLException ex) {
            Logger.getLogger(List_buy.class.getName()).log(Level.SEVERE, null, ex);
        }
        return houseList;
    }

}
