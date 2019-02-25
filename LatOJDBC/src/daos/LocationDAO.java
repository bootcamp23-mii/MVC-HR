/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Location;

/**
 *
 * @author Firsta
 */
public class LocationDAO {
    private Connection connection;
    
    public LocationDAO(Connection connection){
        this.connection = connection;
    }
    
    /**
     * Method ini berfungsi untuk melakukan proses getById (mendapatkan data sesuai id yang dimasukkan),
     * proses getAll (untuk menampilkan seluruh data dalam tabel tersebut), dan untuk search (mencari data 
     * sesuai dengan kata kunci yang dimasukkan).
     * @param keyword berisi kata kunci yang bertipe data Object.
     * @param isGetById apabila inputan ("",true) maka akan memanggil fungsi getALL(), apabila ("12",true)
     * maka akan memanggil fungsi getByid (), dan yang terakhir apabila inputan ("%M",false) maka akan memanggil
     * fungsi search().
     * @return locations
     */
    public List<Location> getData(Object keyword, boolean isGetById) {
        String query = "";
        List<Location> locations = new ArrayList<>();
        if (isGetById) {
            query = "SELECT * FROM LOCATIONS WHERE LOCATION_ID =" + keyword;
        } else {
            query = "SELECT * FROM LOCATIONS WHERE LOCATION_ID LIKE '%" + keyword + "%' or STREET_ADDRESS like '%" + keyword + "%'";
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                locations.add(new Location(
                        resultSet.getInt(1), resultSet.getString(2),resultSet.getString(3), resultSet.getString(4),resultSet.getString(5), resultSet.getString(6)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return locations;
    }
    
    /**
     * Method ini digunakan untuk melakukan proses insert pada Tabel Location apabila (true),
     * dan apabila (false) maka akan melakukan proses update data yang terdapat pada tabel Locations.
     * @param l bertipe data Location
     * @param isInsert bertipe data boolean, dimana pada parameter ini yang menentukan proses mana yang akan dieksekusi.
     * @return result,
     */
    public boolean save(Location l, boolean isInsert) {
        boolean result = false;
        String query = "";
        if (isInsert) {
            query = "INSERT INTO LOCATIONS (street_address, postal_code, city, state_province, country_id, location_id) VAlUES (?,?,?,?,?,?)";
        } else {
            query = "UPDATE LOCATIONS SET street_address = ?, postal_code = ?, city = ?, state_province = ?, country_id = ? WHERE location_id = ?" ;
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, l.getAddress());
            preparedStatement.setString(2, l.getPostalCode());
            preparedStatement.setString(3, l.getCity());
            preparedStatement.setString(4, l.getState());
            preparedStatement.setString(5, l.getCountryId());
            preparedStatement.setInt(6, l.getId());
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    /**
     * Method ini berfungsi untuk melakukan proses delete pada tabel Locations.
     * @param id bertipe data integer yang digunakan sebagai variabel inputan untuk proses delete.
     * @return result
     */
    public boolean delete(int id) {
        boolean result = false;
        String query = "DELETE FROM LOCATIONS WHERE LOCATION_ID= ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}