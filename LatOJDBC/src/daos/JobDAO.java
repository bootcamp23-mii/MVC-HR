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
import models.Job;
import tools.DBConnection;

/**
 *
 * @author Lusiana
 */
public class JobDAO {

    private Connection connection;

    public JobDAO(Connection connection) {
        this.connection = connection;
    }

    /**
     * DAO untuk menampilkan data
     *
     * @param keyword kata kunci untuk pencarian data, bisa dikosongkan apabila
     * ingin menampilkan keseluruhan data
     * @param isGetById menentukan jenis getData true = by id, false = search by
     * key atau getAll
     * @return List
     */
    public List<Job> getData(Object keyword, boolean isGetById) {
        List<Job> listJob = new ArrayList<Job>();
        String query = "";
        if (isGetById) {
            query = "SELECT * FROM JOBS WHERE job_id like'%" + keyword + "%'";
        } else {
            query = "SELECT * FROM JOBS WHERE job_id like'%" + keyword + "%' or job_title like'%" + keyword + "%' "
                    + "or min_salary like'%" + keyword + "%'or max_salary like'%" + keyword + "%'";
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                listJob.add(new Job(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3), resultSet.getInt(4)));
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
        return listJob;
    }

    /**
     * Fungsi ini digunakan untuk melakukan insert atau update data. Apabila
     * parameter isInsert = true, maka fungsi ini akan melakukan insert data,
     * apabila false, maka update data
     *
     * @param r
     * @param isInsert
     * @return
     */
    public boolean save(Job r, boolean isInsert) {
        boolean result = false;
        String query = "";
        if (isInsert) {
            query = "INSERT INTO jobs(job_title, min_salary, max_salary, job_id) VALUES(?,?,?,?)";
        } else {
            query = "UPDATE Jobs SET job_title = ?, min_salary = ?, max_salary=? WHERE job_id=? ";
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, r.getName());
            preparedStatement.setInt(2, r.getMin_salary());
            preparedStatement.setInt(3, r.getMax_salary());
            preparedStatement.setString(4, r.getId());
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * fungsi untuk melakukan delete data
     *
     * @param id id yang akan dihapus datanya
     * @return
     */
    public boolean delete(String id) {
        boolean result = false;
        String query = "DELETE FROM JOBS WHERE JOB_ID ='" + id + "'";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
