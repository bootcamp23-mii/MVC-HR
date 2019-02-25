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
    
    public String insert(String region_id, String region_name) {
        String result = "";
        if (cdao.save(new Country(country_id, country_name), true)) {
            result = "YES! Data berhasil disimpan.";
        }
        else {
            result = "OOPS! Data gagal disimpan.";
        }
        
        return result;
    }
    
}
