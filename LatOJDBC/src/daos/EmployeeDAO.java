/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Employee;

/**
 *
 * @author Panji Sadewo
 */
public class EmployeeDAO {

    private Connection connection;
    
    public EmployeeDAO(Connection connection) {
        this.connection = connection;
    }
    
    public List<Employee> getData(Object keyword, boolean isGetById) {
        List<Employee> listEmployee = new ArrayList<Employee>();
        String query = "";
        if (isGetById) {
            query = "SELECT * FROM Employees WHERE EMPLOYEE_ID = " + keyword;
        } else {
            query = "SELECT * FROM Employees WHERE EMPLOYEE_ID like '%" + keyword + "%' or FIRST_NAME like '%" + keyword + "%'";
        }

        try {
            PreparedStatement prepareStatment = connection.prepareStatement(query);
            ResultSet resultSet = prepareStatment.executeQuery();
            while (resultSet.next()) {
                listEmployee.add(new Employee(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7), resultSet.getInt(8), resultSet.getInt(9), resultSet.getInt(10), resultSet.getInt(11)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listEmployee;
    }
  
    /**
     * Method yang berfungsi untuk melakukan insert dan update data dari table EMPLOYEES
     * @param e Berisi data dari object Employee
     * @param isInsert <p>True: method akan digunakan untuk insert data.<p>False: method akan digunakan untuk update data.
     * @return <p>True: method berhasil dijalankan.<p>False: method gagal dijalankan.
     */
    public boolean save(Employee e, boolean isInsert) {
        boolean result = false;
        String query = "";
        if (isInsert) {
            query = "INSERT INTO EMPLOYEES(ID,FIRST_NAME,LAST_NAME,EMAIL,PHONE_NUMBER,HIRE_DATE,JOB_ID,SALARY,COMMISSION_PCT,MANAGER_ID,DEPARTMENT_ID) VALUES("+e.getId()+","+ e.getFirst_name()+","+ e.getLast_name()+","+ e.getEmail()+","+e.getPhone_number()+","+e.getHire_date()+","+e.getJob_id()+","+e.getSalary()+","+e.getCommission_pct()+","+e.getManager_id()+","+e.getDepartment_id()+")";
        } else {
            query = "UPDATE EMPLOYEES SET FIRST_NAME="+e.getFirst_name()+",LAST_NAME="+e.getLast_name()+
                    ",EMAIL="+e.getEmail()+",PHONE_NUMBER="+e.getPhone_number()+",HIRE_DATE="+e.getHire_date()+",JOB_ID="+e.getJob_id()+
            ",SALARY="+e.getSalary()+",COMMISSION_PCT="+e.getCommission_pct()+",MANAGER_ID="+e.getManager_id()+",DEPARTMENT_ID="+e.getDepartment_id()+" WHERE ID="+e.getId();
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
    
    /**
     * Method yang berfungsi untuk melakukan delete data dari table EMPLOYEES
     * @param id ID employee yang akan dihapus
     * @return <p>True: method berhasil dijalankan.<p>False: method gagal dijalankan.
     */
    public boolean delete(int id){
        boolean result = false;
        String query = "DELETE FROM EMPLOYEES WHERE ID = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);            
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.getStackTrace();
        }
        
        return result;
    }
    
}
