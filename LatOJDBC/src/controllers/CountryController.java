/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.CountryDAO;
import java.sql.Connection;
import models.Country;

/**
 *
 * @author gerydanu
 */
public class CountryController {
    
    private CountryDAO cdao;
    
    public CountryController(Connection connection) {
        cdao = new CountryDAO(connection);
    }
    
    public String insert(String country_id, String country_name, String region_id){
        String result="";
        if (cdao.save(new Country(country_id, country_name, Integer.parseInt(region_id)), true)) {
            result="OK! Data berhasil disimpan.";
        } else {
            result="OOPS! data gagal disimpan.";
        }
        return result;
    }
    
    public String delete(String country_id){
        String result="";
          if (cdao.delete(country_id)) {
            result="OK! Data berhasil dihapus.";
        } else {
            result="OOPS! data gagal dihapus.";
        }
        return result;
    }
    
    public String update(String country_id, String country_name, String region_id){
        String result="";
        if (cdao.save(new Country(country_id, country_name, Integer.parseInt(region_id)), true)) {
            result="OK! Data berhasil disimpan.";
        } else {
            result="OOPS! data gagal disimpan.";
        }
        return result;
    }
    
}
