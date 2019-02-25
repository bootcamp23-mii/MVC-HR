/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.LocationDAO;
import java.sql.Connection;
import java.util.List;
import models.Location;

/**
 *
 * @author Firsta
 */
public class LocationController {
    private Connection connection;
    private LocationDAO ldao;
    
    public LocationController(Connection connection){
        ldao = new LocationDAO(connection);
    }
    
    /**
     * 
     * @param keyword
     * @param isGetById
     * @return 
     */
    public String getData(String keyword, boolean isGetById){
        String result ="";
        if (keyword.equals("")&&!isGetById)
        {
            if (ldao.getData(keyword, isGetById).isEmpty())System.out.println("Data tidak ditemukan");
            else System.out.println("Data berhasil dilihat");
        }
        else if (!keyword.equals("")&&!isGetById)
        {
            if (ldao.getData(keyword, isGetById).isEmpty())System.out.println("Data tidak ditemukan");
            else System.out.println("Data berhasil dilihat");
        }
        else if (!keyword.equals("")&&isGetById)
        {
            if (ldao.getData(keyword, isGetById).isEmpty())System.out.println("Data tidak ditemukan");
            else System.out.println("Data berhasil dilihat");
        }
        else if (keyword.equals("")&&isGetById)
        {
            if (ldao.getData(keyword, isGetById).isEmpty())System.out.println("Data tidak ditemukan");
            else System.out.println("Data berhasil dilihat");
        }
        return result;
    }
    
    /**
     * Method yang digunakan untuk memvalidasi fungsi insert data dari LOCATIONS
     * @param id, merupakan Id dari Locations
     * @param address, merupakan street_address dari Locations
     * @param postalCode, merupakan postal_code dari Locations
     * @param city, merupakan city dari Locations
     * @param state, merupakan state_province dari Locations
     * @param countryId, merupakan country_id dari Locations
     * @return result
     */
    public String insert(String id, String address, String postalCode, String city, String state, String countryId){
        String result ="";
        if (ldao.save(new Location(Integer.parseInt(id), address, postalCode, city, state, countryId), true)) {
            result = "Selamat data berhasil disimpan";
        } else {
            result = "Maaf data gagal disimpan";
        }
        return result;
    }
    
    /**
     * Method yang digunakan untuk memvalidasi fungsi update data dari LOCATIONS
     * param id, merupakan Location_id dari Locations
     * @param address, merupakan street_address dari Locations
     * @param postalCode, merupakan postal_code dari Locations
     * @param city, merupakan city dari Locations
     * @param state, merupakan state_province dari Locations
     * @param countryId, merupakan country_id dari Locations
     * @return result
     */
    public String update (String id, String address, String postalCode, String city, String state, String countryId){
        String result ="";
        if (ldao.save(new Location(Integer.parseInt(id), address, postalCode, city, state, countryId), false)) {
            result = "Selamat data berhasill diupdate";
        } else {
            result = "Maaf data gagal diupdate";
        }
        return result;
    }
    
    /**
     * Method yang digunakan untuk memvalidasi fungsi delete dari LOCATIONS
     * @param id
     * @return result
     */
    public String delete(String id){
        String result ="";
        if (ldao.delete(Integer.parseInt(id))) {
            result = "Selamat data berhasil dihapus";
        } else {
            result = "Maaf data gagal dihapus";
        }
        return result;
    }
    
    public List<Location> getDataAll(){
        return ldao.getData("", false);
    }
    
    public List<Location> searchData(Object keyword, boolean isById){
        return  ldao.getData(keyword, isById);
    }
}   

