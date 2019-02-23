
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.DepartmentDAO;
import java.sql.Connection;
import models.Department;

/**
 *
 * @author milhamafemi
 */
public class DepartmentController {
    private DepartmentDAO ddao;

    public DepartmentController(Connection connection) {
      ddao=new DepartmentDAO(connection);
    }
    public String insert(String id, String name,String manager_id, String location_id){
        String result="";
        if (ddao.save(new Department(Integer.parseInt(id),name , Integer.parseInt(manager_id),
                Integer.parseInt(location_id)), true)) {
            result="selamat data berhasil disimpan";
        } else {
            result="maaf, data tidak berhasil disimpan";
        }
        return result;
    }
    
}

