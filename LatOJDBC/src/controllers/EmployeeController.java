/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.EmployeeDAO;
import java.sql.Connection;
import models.Employee;

/**
 *
 * @author Panji Sadewo
 */
public class EmployeeController {
    
    private Connection connection;
    private EmployeeDAO edao;
    public EmployeeController(Connection connection) {
        EmployeeDAO employeeDAO = new EmployeeDAO(connection);
    }
    
    public String getDataController(int id, String first_name, String last_name, String email, String phone_number, String hire_date, String job_id, int salary, int commission_pict, int manager_id, int department_id){
        String result ="";
        if (edao.getData(new Employee(Integer.parseInt(id), first_name, last_name, email, phone_number, hire_date, job_id, Integer.parseInt(salary), Integer.parseInt(commission_pict), Integer.parseInt(manager_id), Integer.parseInt(department_id)), true)) {
            result ="Data berhasil di lihat";
        }
        else
        {
            result="Maaf data gagal dilihat";
        }
        return result;
    }
    
    
    
    
}
