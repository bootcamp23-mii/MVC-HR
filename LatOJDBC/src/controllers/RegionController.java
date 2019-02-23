package controllers;


import daos.RegionDAO;
import java.sql.Connection;
import models.Region;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author milhamafemi
 */
public class RegionController {

    private RegionDAO rdao;
    public RegionController(Connection connection) {
      rdao=new RegionDAO(connection);
    }
    
    public String insert(String id,String name){
        String result="";
        if (rdao.save(new Region(Integer.parseInt(id), name), true)) {
            result="Selamat data berhasil disimpan";
        }else{
            result="Maaf, data gagal disimpan";
        }
        return result;
    }
}
