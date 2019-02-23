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
 * @author USER
 */
public class CountryDAO {
    
    private Connection connection;
    
    public CountryDAO(Connection connection) {
        this.connection = connection;
    }
    
    public List<Country> getData(Object keyword, boolean isGetById) {
        List<Country> listCountry = new ArrayList<Country>();
        String query = "";
        if (isGetById) {
            query = "SELECT * FROM COUNTRIES WHERE COUNTRY_ID = " + keyword;
        } else {
            query = "SELECT * FROM COUNTRIES WHERE COUNTRY_ID like '%" + keyword + "%' or COUNTRY_NAME like '%" + keyword + "%'";
        }

        try {
            PreparedStatement prepareStatment = connection.prepareStatement(query);
            ResultSet resultSet = prepareStatment.executeQuery();
            while (resultSet.next()) {
                listCountry.add(new Country(resultSet.getString(1), resultSet.getString(2)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listCountry;
    }
  
    
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
    
    
    public boolean delete(int id){
        boolean result = false;
        String query = "DELETE FROM COUNTRIES WHERE COUNTRY_ID = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);            
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.getStackTrace();
        }
        
        return result;
    }
}
