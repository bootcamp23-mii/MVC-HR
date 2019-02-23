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
            query = "SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_ID=";
        } else {
            query = "SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_ID LIKE '%" + keyword
                    + "%' OR DEPARTMENT_NAME '%" + keyword + "%'";
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                listDepartment.add(new Department(resultSet.getInt(1), resultSet.getString(2),
                        resultSet.getInt(3), resultSet.getInt(4)));

            }
        } catch (Exception e) {
            e.getStackTrace();
        }
        return listDepartment;
    }

    public boolean save(Department d, boolean isInsert) {
        boolean result = false;
        String query = "";
        if (isInsert) {
            query = "INSERT INTO DEPARTMENTS VALUES(?,?)";
        } else {
            query = "UPDATE DEPARTMENTS DEPARTMENT_NAME=? DEPARTMENT_ID=?";
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, d.getName());
            preparedStatement.setInt(2, d.getId());
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.getStackTrace();
        }
        return result;

    }

}
