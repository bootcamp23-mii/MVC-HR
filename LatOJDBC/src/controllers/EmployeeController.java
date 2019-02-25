/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.EmployeeDAO;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import models.Employee;

/**
 *
 * @author Panji Sadewo
 */
public class EmployeeController {
    
    private Connection connection;
    private EmployeeDAO edao;
    public EmployeeController(Connection connection) {
        edao = new EmployeeDAO(connection);
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
            if (edao.getData(keyword, isGetById).isEmpty())System.out.println("Data tidak ditemukan");
            else System.out.println("Data berhasil dilihat");
        }
        else if (!keyword.equals("")&&!isGetById)
        {
            if (edao.getData(keyword, isGetById).isEmpty())System.out.println("Data tidak ditemukan");
            else System.out.println("Data berhasil dilihat");
        }
        else if (!keyword.equals("")&&isGetById)
        {
            if (edao.getData(keyword, isGetById).isEmpty())System.out.println("Data tidak ditemukan");
            else System.out.println("Data berhasil dilihat");
        }
        else if (keyword.equals("")&&isGetById)
        {
            if (edao.getData(keyword, isGetById).isEmpty())System.out.println("Data tidak ditemukan");
            else System.out.println("Data berhasil dilihat");
        }
        return result;
    }
    
    /**
     * Method yang digunakan untuk memvalidasi fungsi insert data dari EMPLOYEES
     * @param id ID Employee
     * @param first_name Nama depan Employee
     * @param last_name Nama belakang Employee
     * @param email Email Employee
     * @param phone_number Nomor telepon Employee
     * @param hire_date Tanggal hire Employee
     * @param job_id ID job dari Employee
     * @param salary Gaji Employee
     * @param commission_pict commision pict Employee
     * @param manager_id ID manager dari Employee
     * @param department_id ID department dari Employee
     * @return <p>Berhasil: akan mengeluarkan hasil "Selamat data berhasil disimpan".
     * <p>Gagal: akan mengeluarkan hasil "Maaf, data gagal disimpan".
     */
    public String insert(String id, String first_name, String last_name, String email, String phone_number, String hire_date, String job_id, String salary, String commission_pict, String manager_id, String department_id){
        String result="";
        if (edao.save(new Employee(Integer.parseInt(id), first_name, last_name, 
                email, phone_number, hire_date, job_id, Integer.parseInt(salary), 
                Double.parseDouble(commission_pict), Integer.parseInt(manager_id), 
                Integer.parseInt(department_id)),true)) {
            result="Selamat data berhasil disimpan";
        }else{
            result="Maaf, data gagal disimpan";
        }
        return result;
    }
    
    /**
     * Method yang digunakan untuk memvalidasi fungsi update data dari EMPLOYEES
     * @param id ID Employee
     * @param first_name Nama depan Employee
     * @param last_name Nama belakang Employee
     * @param email Email Employee
     * @param phone_number Nomor telepon Employee
     * @param hire_date Tanggal hire Employee
     * @param job_id ID job dari Employee
     * @param salary Gaji Employee
     * @param commission_pict commision pict Employee
     * @param manager_id ID manager dari Employee
     * @param department_id ID department dari Employee
     * @return <p>Berhasil: akan mengeluarkan hasil "Selamat data berhasil diupdate".
     * <p>Gagal: akan mengeluarkan hasil "Maaf, data gagal diupdate".
     */
    public String update(String id, String first_name, String last_name, String email, String phone_number, String hire_date, String job_id, String salary, String commission_pict, String manager_id, String department_id){
        String result="";
        if (edao.save(new Employee(Integer.parseInt(id), first_name, last_name, 
                email, phone_number, hire_date, job_id, Integer.parseInt(salary), 
                Integer.parseInt(commission_pict), Integer.parseInt(manager_id), 
                Integer.parseInt(department_id)),false)) {
            result="Selamat data berhasil diupdate";
        }else{
            result="Maaf, data gagal diupdate";
        }
        return result;
    }
    
    /**
     * Method yang digunakan untuk memvalidasi fungsi delete data dari EMPLOYEES
     * @param id ID Employee yang akan dihapus
     * @return <p>Berhasil: akan mengeluarkan hasil "Selamat data berhasil dihapus".
     * <p>Gagal: akan mengeluarkan hasil "Maaf, data gagal dihapus". 
     */
    public String delete(String id){
        String result="";
        if (edao.delete(Integer.parseInt(id))) {
            result="Selamat data berhasil dihapus";
        }else{
            result="Maaf, data gagal dihapus";
        }
        return result;
    }
    
    public List<Employee> getAllData(){
        return edao.getData("", false);
    }
    public List<Employee> searchData(Object keyword, boolean isById){
        return edao.getData(keyword, isById);
    }
    
}
