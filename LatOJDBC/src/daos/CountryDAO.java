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
import models.Country;

/**
 *
 * @author gerydanu
 */
public class CountryDAO {
    
    private Connection connection;
    
    public CountryDAO(Connection connection) {
        this.connection = connection;
    }
    
    /**
     * Fungsi untuk mencari data dalam tabel Countries. data yang dicari dapat berupa country_id, country_name, atau region_id.
     * @param keyword data yang ingin dicari, dapat berupa Integer atau String
     * @param isGetById jika TRUE maka mencari data berdasarkan ID, jika FALSE maka mencari data berdasarkan country_id, country_name, atau region_id.
     * @return Menampilkan data yang dicari.
     */
    public List<Country> getData(Object keyword, boolean isGetById) {
        List<Country> listCountry = new ArrayList<Country>();
        String query = "";
        if (isGetById) {
            query = "SELECT * FROM COUNTRIES WHERE COUNTRY_ID = " + keyword;
        } else {
            query = "SELECT * FROM COUNTRIES WHERE COUNTRY_ID like '%" + keyword + "%' or COUNTRY_NAME like '%" + keyword + "%'" + "%' or REGION_ID like '%" + keyword + "%'";
        }

        try {
            PreparedStatement prepareStatment = connection.prepareStatement(query);
            ResultSet resultSet = prepareStatment.executeQuery();
            while (resultSet.next()) {
                listCountry.add(new Country(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listCountry;
    }
    
    /**
     * Fungsi yang dugunakan untuk menambahkan data baru atau memodifikasi data yang sudah ada di tabel Countries.
     * @param c 
     * @param isInsert untuk mengetahui apakah menggunakan fungsi insert atau tidak
     * @return data pada tabel Countries bertambah atau berubah
     */
    public boolean save(Country c, boolean isInsert) {
        boolean result = false;
        String query = "";
        if (isInsert) {
            query = "INSERT INTO COUNTRY (COUNTRY_ID,COUNTRY_NAME) VALUES(" +c.getCountry_id()+ "," + c.getCountry_name()+")";
        } else {
            query = "UPDATE EMPLOYEES SET COUNTRY_ID=" + c.getCountry_id()+ ",COUNTRY_NAME=" + c.getCountry_name()+ " WHERE COUNTRY_ID=" + c.getCountry_id();
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
  
    /**
     * Fungsi untuk menghapus data pada tabel Countries berdasarkan ID country.
     * @param country_id masukkan id country
     * @return data pada tabel Countries terhapus.
     */
    public boolean delete(String country_id){
        boolean result = false;
        String query = "DELETE FROM COUNTRIES WHERE COUNTRY_ID = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);            
            preparedStatement.setString(1, country_id);
            ResultSet resultSet = preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.getStackTrace();
        }
        
        return result;
    }
    
}
