/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.RegionDAO;
import java.sql.Connection;
import models.Region;

/**
 *
 * @author Panji Sadewo
 */
public class RegionController {
    
    private Connection connection;
    private RegionDAO rdao;
    public RegionController(Connection connection) {
        RegionDAO regiondao = new RegionDAO(connection);
    }
    
    public String insert(String id, String name){
        String result ="";
        if (rdao.save(new Region(Integer.parseInt(id),name), true)) {
            result ="Data berhasil diinput";
        }
        else
        {
            result="Maaf data gagal diinput";
        }
        return result;
    }
    
}
