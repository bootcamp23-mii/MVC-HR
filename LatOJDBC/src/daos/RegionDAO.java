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
import models.Region;
import tools.DBConnection;

/**
 *
 * @author AdhityaWP
 */
public class RegionDAO {

    private Connection connection;

//    public RegionDAO() {
//        DBConnection con = new DBConnection();
//        connection = con.getConnection();
//    }
    
    //disarankan pakai untuk mengambil koneksi :
    public RegionDAO(Connection connection) {
        this.connection = connection;
    }
    /**
     * Method yang digunakan untuk menyeleksi semua isi tabel database.
     * @return list isi database
     */
    private List<Region> getAll() {
        List<Region> listRegion = new ArrayList<Region>();
        String query = "SELECT * FROM REGIONS";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
//                Region r = new Region(resultSet.getInt(1),resultSet.getString(2));
//                r.setId(resultSet.getInt(1));
//                r.setName(resultSet.getString(2));
//disingkat dari atas jadi :
                listRegion.add(new Region(resultSet.getInt(1), resultSet.getString(2)));
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
        return listRegion;
    }
    /**
     * Method yang digunakan untuk memasukkan data ke dalam tabel database.
     * Parameter r adalah objek yang merujuk ke attribut tabel.
     * @param r
     * @return true apabila data berhasil melalui query, false apabila gagal
     */
    private boolean insert(Region r) {
        boolean result = false;
        String query = "INSERT INTO REGIONS(region_name, region_id) VALUES (?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, r.getName());
            preparedStatement.setInt(2, r.getId());
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    /**
     * Method yang digunakan untuk mengganti nilai data di dalam tabel database sesuai id.
     * Parameter r adalah objek yang merujuk ke attribut tabel.
     * @param r
     * @return true apabila query berhasil dieksekusi, false apabila gagal.
     */
    private boolean update(Region r) {
        boolean result = false;
        String query = "UPDATE REGIONS SET region_name = ? WHERE region_id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, r.getName());
            preparedStatement.setInt(2, r.getId());
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
    /**
     * Method ini digunakan untuk melakukan insert atau update data. Apabila
     * parameter isInsert = true maka fungsi ini akan melakukan insert data,
     * apabila false maka update data
     * @param r
     * @param isInsert
     * @return true jika query dapat dieksekusi, false jika query gagal
     * dieksekusi
     */
    public boolean save(Region r, boolean isInsert) {
        boolean result = false;
        String query = "";
        if (isInsert) {
            query = "INSERT INTO REGIONS(region_name, region_id) VALUES (?,?)";
        } else {
            query = "UPDATE REGIONS SET region_name = ? WHERE region_id = ?";
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, r.getName());
            preparedStatement.setInt(2, r.getId());
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    /**
     * Method yang digunakan untuk menghapus satu baris data sesuai id masukan.
     * @param id
     * @return true apabila berhasil, false apabila gagal
     */
    public boolean delete(int id) {
        boolean isdelete = false;
        String query = "DELETE FROM REGIONS WHERE region_id = " + id;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            isdelete = true;
        } catch (Exception e) {
            e.getStackTrace();
        }
        return isdelete;
    }
    /**
     * Method yang digunakan untuk menyaring dan menyeleksi data dari tabel sesuai parameter id masukan
     * @param id
     * @return list data yang sesuai dengan id
     */
    private List<Region> getById(int id) {
        List<Region> listRegion = new ArrayList<Region>();
        String query = "SELECT * FROM REGIONS WHERE region_id =" + id;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
//                Region r = new Region(resultSet.getInt(1),resultSet.getString(2));
//                r.setId(resultSet.getInt(1));
//                r.setName(resultSet.getString(2));
//disingkat dari atas jadi :
                listRegion.add(new Region(resultSet.getInt(1), resultSet.getString(2)));
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
        return listRegion;
    }
    
    /**
     * Method yang digunakan untuk menyaring dan menyeleksi data dari tabel sesuai String parameter masukan.
     * @param key
     * @return list data yang memenuhi parameter masukan
     */
    private List<Region> searchById(String key) {
        List<Region> listRegion = new ArrayList<Region>();
        String query = "SELECT * FROM REGIONS WHERE region_id LIKE'%" + key + "%' or region_name LIKE'%" + key + "%'";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                listRegion.add(new Region(resultSet.getInt(1), resultSet.getString(2)));
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
        return listRegion;
    }
    
    /**
     * Method ini digunakan untuk melakukan insert atau update data. Apabila
     * parameter keyword = String kosong  dan isGetById = false maka fungsi getAll yang akan berjalan,
     * apabila keyword = berisi karakter dan isGetById = false maka fungsi searchById berjalan,
     * apabila keyword = berisi karakter dan isGetById = true maka fungsi getById berjalan,
     * apabila keyword = String kosong dan isGetById = true maka fungsi getById searchById berjalan dengan nilai kembalian NULL,
     * @param keyword
     * @param isGetById
     * @return listRegion sesuai dengan fungsi yang dijalankan
     */
    public List<Region> getData(Object keyword, boolean isGetById) {
        List<Region> listRegion = new ArrayList<Region>();
        String query = "";
        if (isGetById) {
            query = "SELECT * FROM REGIONS WHERE region_id =" + keyword;
        } else {
            query = "SELECT * FROM REGIONS WHERE region_id LIKE'%" + keyword + "%' or region_name LIKE'%" + keyword + "%'";
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
//                Region r = new Region(resultSet.getInt(1),resultSet.getString(2));
//                r.setId(resultSet.getInt(1));
//                r.setName(resultSet.getString(2));
//disingkat dari atas jadi :
                listRegion.add(new Region(resultSet.getInt(1), resultSet.getString(2)));
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
        return listRegion;
    }

}
