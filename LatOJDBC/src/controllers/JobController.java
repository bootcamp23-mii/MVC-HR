/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.JobDAO;
import java.sql.Connection;
import java.util.List;
import models.Job;

/**
 *
 * @author Lusiana
 */
public class JobController {

    private JobDAO rdao;

    public JobController(Connection connection) {
        rdao = new JobDAO(connection);
    }

    /**
     * Controller insert data
     *
     * @param id berisi job id
     * @param name = job title
     * @param min_salary = minimum salary
     * @param max_salary = maximum salary
     * @return String
     */
    public String insert(String id, String name, String min_salary, String max_salary) {
        String result = "";
        if (rdao.save(new Job(id, name, Integer.parseInt(min_salary), Integer.parseInt(max_salary)), true)) {
            result = "Data berhasil disimpan";
        } else {
            result = "Maaf, data gagal disimpan";
        }
        return result;
    }

    /**
     * Controller update data
     *
     * @param id berisi job id
     * @param name = job title
     * @param min_salary = minimum salary
     * @param max_salary = maximum salary
     * @return String
     */
    public String update(String id, String name, String min_salary, String max_salary) {
        String result = "";
        if (rdao.save(new Job(id, name, Integer.parseInt(min_salary), Integer.parseInt(max_salary)), false)) {
            result = "Data berhasil disimpan";
        } else {
            result = "Maaf, data gagal disimpan";
        }
        return result;
    }

    /**
     * Controller delete data
     *
     * @param id merupakan job id yang akan dihapus datanya
     * @return
     */
    public String delete(String id) {
        String result = "";
        if (rdao.delete(id)) {
            result = "Selamat data berhasil dihapus";
        } else {
            result = "Maaf, data gagal dihapus";
        }
        return result;
    }

    /**
     * controller untuk menampilkan data berdasarkan id
     *
     * @param key id yang ingin dilihat detail datanya
     * @return List
     */
    public List<Job> getById(String key) {
        List result;
        result = rdao.getData(key, true);
        return result;
    }

    /**
     * Controller untuk menampilkan semua data atau data yang mengandung
     * karakter tertentu
     *
     * @param key karakter atau kata kunci yang ingin dicari datanya
     * @return List
     */
    public List<Job> searchBy(String key) {
        List result;
        result = rdao.getData(key, false);
        return result;
    }

}
