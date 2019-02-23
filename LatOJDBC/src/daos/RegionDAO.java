package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Region;
import tools.DBConnection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author milhamafemi
 */
public class RegionDAO {

    private Connection connection;
//    cara yang tidak disarankan
//    public RegionDAO() {
//        DBConnection con=new DBConnection();
//        connection = con.getConnection();
//    }

//cara yang disarankan
    public RegionDAO(Connection connection) {
        this.connection = connection;
    }

    private List<Region> getAll() {
        List<Region> listRegion = new ArrayList<Region>();
        String query = "SELECT * FROM REGIONS";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resulSet = preparedStatement.executeQuery();
            while (resulSet.next()) {
                //Region r = new Region();
//                r.setId(resulSet.getInt(1));
//                r.setName(resulSet.getString(2));
                listRegion.add(new Region(resulSet.getInt(1), resulSet.getString(2)));
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
        return listRegion;
    }

    private List<Region> getById(int id) {
        List<Region> listRegion = new ArrayList<Region>();
        String query = "SELECT * FROM REGIONS WHERE REGION_ID=" + id;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resulSet = preparedStatement.executeQuery();
            while (resulSet.next()) {
                //Region r = new Region();
//                r.setId(resulSet.getInt(1));
//                r.setName(resulSet.getString(2));
                listRegion.add(new Region(resulSet.getInt(1), resulSet.getString(2)));
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
        return listRegion;
    }

    public List<Region> getData(Object keyword, boolean isGetById) {
        List<Region> listRegion = new ArrayList<Region>();
        String query = "";
        if (isGetById) {
            query = "SELECT * FROM REGIONS WHERE REGION_ID=";
        } else {
            query = "select * from regions where region_id like'%" + keyword + "%' or region_name like'%" + keyword + "'%";
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resulSet = preparedStatement.executeQuery();
            while (resulSet.next()) {
                //Region r = new Region();
//                r.setId(resulSet.getInt(1));
//                r.setName(resulSet.getString(2));
                listRegion.add(new Region(resulSet.getInt(1), resulSet.getString(2)));
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
        return listRegion;
    }

    private boolean insert(Region r) {
        boolean result = false;
        String query = "INSERT INTO REGIONS(region_name,region_id) VALUES(?,?)";
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

    private boolean update(Region r) {
        boolean result = false;
        String query = "UPDATE REGIONS set region_name=? where region_id=?";
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

    private boolean search(String id) {
        boolean result = false;
        String query = "select * from regions where region_id like'%" + id + "%' or region_name like'%" + id + "'%";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet
                    = //            preparedStatement.setString(1, r.getName());
                    //            preparedStatement.setInt(2, r.getId());
                    //            preparedStatement.executeQuery();
                    result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean delete(int id) {
        boolean isDelete=false;
        String query = "DELETE from REGIONS WHERE region_id="+id;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet=preparedStatement.executeQuery();
            isDelete = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isDelete;
    }

    public boolean save(Region r, boolean isInsert) {
        boolean result = false;
        String query = "";
        if (isInsert) {
            query = "INSERT INTO REGIONS(region_name,region_id) VALUES(?,?)";
        } else {
            query = "UPDATE REGIONS region_name=? region_id=?";
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
 * 1.lengkapi controller 
 * 2.dokumentasi untuk setiap method
 * 3.buatlah gui CRUD, search
 * pelajari tentang JInternal Frame
 * Job history ga usah
 * validasi kondisi disaat tabel kosong ga bisa input
 */
}
