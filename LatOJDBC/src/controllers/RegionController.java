/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.RegionDAO;
import java.util.List;
import java.sql.Connection;
import models.Region;

/**
 *
 * @author AdhityaWP
 */
public class RegionController {
    private RegionDAO rdao;
    public RegionController(Connection connection) {
        rdao = new RegionDAO(connection);
    }
    
    public String insert(String id, String nama) {
        String result = "";
        if (rdao.save(new Region(Integer.parseInt(id), nama), true)){
            result = "Data berhasil disimpan";            
        }else{
            result = "Maaf data gagal disimpan";
        }
        return result;
    }
    
    public String update(String id, String nama) {
        String result = "";
        if (rdao.save(new Region(Integer.parseInt(id), nama), false)){
            result = "Data berhasil diubah";            
        }else{
            result = "Maaf data gagal diubah";
        }
        return result;
    }
    
    public List<Region> getById(String key){
        List result;
        result = rdao.getData(key, true);
        return result;        
    }
    
    public List<Region> searchBy(String key){
        List result;
        result = rdao.getData(key, false);
        return result;        
    }
}
