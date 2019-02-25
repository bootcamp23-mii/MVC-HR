/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.CountryDAO;
import java.sql.Connection;
import models.Country;

/**
 *
 * @author gerydanu
 */
public class CountryController {
    
    private CountryDAO cdao;
    
    public CountryController(Connection connection) {
        cdao = new CountryDAO(connection);
    }
    
    /**
     * Fungsi untuk memasukkan data ke dalam tabel Countries.
     * @param country_id masukkan ID
     * @param country_name masukkan NAMA
     * @param region_id masukkan ID region nya
     * @return Akan tampil data baru di tabel Countries.
     */
    public String insert(String country_id, String country_name, String region_id){
        String result="";
        if (cdao.save(new Country(country_id, country_name, Integer.parseInt(region_id)), true)) {
            result="OK! Data berhasil disimpan.";
        } else {
            result="OOPS! data gagal disimpan.";
        }
        return result;
    }
    
    /**
     * Fungsi untuk menghapus data di tabel Countries berdasarkan country_id.
     * @param country_id masukkan ID yang akan di hapus
     * @return Data pada tabel Countries akan dihapus.
     */
    public String delete(String country_id){
        String result="";
          if (cdao.delete(country_id)) {
            result="OK! Data berhasil dihapus.";
        } else {
            result="OOPS! data gagal dihapus.";
        }
        return result;
    }
    
    /**
     * Fungsi yang digunakan untuk memperbarui data yang sudah ada pada tabel Countries. Data yang diperbarui dapat berupa country_id, country_name, atau region_id.
     * @param country_id masukkan ID
     * @param country_name masukkan NAMA
     * @param region_idmasukkan ID region nya
     * @return Data pada tabel Countries akan berubah.
     */
    public String update(String country_id, String country_name, String region_id){
        String result="";
        if (cdao.save(new Country(country_id, country_name, Integer.parseInt(region_id)), true)) {
            result="OK! Data berhasil disimpan.";
        } else {
            result="OOPS! data gagal disimpan.";
        }
        return result;
    }
    
}
