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
    private Connection connection;

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
    
    public String delete(String id){
        String result="";
        if (ddao.delete(Integer.parseInt(id))) {
            result="selamat data berhasil dihapus";
        } else {
            result="Maaf, data gagal dihapus";
        }
        return result;
    }
    
    public String update(String id, String department_name, String manager_id, String location_id){
        String result="";
        if (ddao.save(new Department(Integer.parseInt(id), department_name
                , Integer.parseInt(manager_id), Integer.parseInt(location_id)), false)){
            result="Selamat data berhasil disimpan";
        } else {
            result="maaf data gagal disimpan";
        }
        return result;
    }

    
    public String getData(String keyword, boolean isGetById){
        String result="";
        if (keyword.equals("") && !isGetById) {
            if (ddao.getData(keyword, isGetById).isEmpty())System.out.println("Data tidak ditemukan");
            else System.out.println("Data berhasil dilihat");
            
        } else if (!keyword.equals("") && !isGetById) {
            if (ddao.getData(keyword, isGetById).isEmpty())System.out.println("Data tidak ditemukan");
            else System.out.println("Data berhasil dilihat");
        } else if (!keyword.equals("") && isGetById) {
            if (ddao.getData(keyword, isGetById).isEmpty())System.out.println("Data tidak ditemukan");
            else System.out.println("Data berhasil dilihat");
        } else if (keyword.equals("") && isGetById) {
            if (ddao.getData(keyword, isGetById).isEmpty())System.out.println("Data tidak ditemukan");
            else System.out.println("Data berhasil dilihat");
        }
        return result;
    }
}


