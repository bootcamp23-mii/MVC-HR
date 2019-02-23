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
    
}
