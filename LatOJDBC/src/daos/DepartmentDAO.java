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
import models.Department;

/**
 *
 * @author milhamafemi
 */
public class DepartmentDAO {

    private Connection connection;

    public DepartmentDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Department> getData(Object keyword, boolean isGetById) {
        List<Department> listDepartment = new ArrayList<Department>();
        String query = "";
        if (isGetById) {
            query = "SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_ID= "+keyword;
        } else {
            query = "SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_ID LIKE '%" + keyword+ 
                    "%' OR DEPARTMENT_NAME like '%" + keyword + "%' OR MANAGER_ID LIKE '%"+keyword+
                    "%' OR LOCATION_ID LIKE '%"+keyword+"%'";
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                listDepartment.add(new Department(resultSet.getInt(1), resultSet.getString(2),
                        resultSet.getInt(3), resultSet.getInt(4)));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listDepartment;
    }

    public boolean save(Department d, boolean isInsert) {
        boolean result = false;
        String query = "";
        if (isInsert) {
            query = "INSERT INTO DEPARTMENTS(DEPARTMENT_ID,DEPARTMENT_NAME,MANAGER_ID,LOCATION_ID) VALUES("+d.getId()+",'"
                    +d.getName()+"',"+d.getManager_id()+","+d.getLocation_id()+")";
        } else {
            query = "UPDATE DEPARTMENTS SET DEPARTMENT_NAME='"+d.getName()+"',MANAGER_ID="+d.getManager_id()+
                    ",LOCATION_ID="+d.getLocation_id()+"WHERE ID="+d.getId();
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public boolean delete(int id){
        boolean isDelete=false;
        String query="DELETE FROM DEPARTMENTS WHERE DEPARTMENT_ID = ?";
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet=preparedStatement.executeQuery();
            isDelete=true;
        } catch (Exception e) {
            e.getStackTrace();
        }
        return isDelete;
    }

}