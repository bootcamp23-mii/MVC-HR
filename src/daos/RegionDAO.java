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

/**
 *
 * @author Panji Sadewo
 */
public class RegionDAO {

    private Connection connection;

    //Cara yang tidak disarankan
//    public RegionDAO() {
//        DBConnection con = new DBConnection();
//        connection = con.getConnection();
//    }
    //Cara yang disarankan
    public RegionDAO(Connection connection) {
        this.connection = connection;
    }

    private List<Region> getAll() {
        List<Region> listRegion = new ArrayList<Region>();
        String query = "SELECT * FROM REGIONS";
        try {
            PreparedStatement prepareStatment = connection.prepareStatement(query);
            ResultSet resultSet = prepareStatment.executeQuery();
            while (resultSet.next()) {
//                Region r = new Region(resultSet.getInt(1), resultSet.getString(2));
//                r.setId(resultSet.getInt(1));
//                r.setName(resultSet.getString(2));
//              Kalau mau di langsung
                listRegion.add(new Region(resultSet.getInt(1), resultSet.getString(2)));
//                Kalau mau di tampung dulu
//                listRegion.add(r);
            }
        } catch (Exception e) {
        }
        return listRegion;
    }

    private List<Region> getById(int id) {
        List<Region> listRegion = new ArrayList<Region>();
        String query = "SELECT * FROM REGIONS WHERE region_id = " + id;
        try {
            PreparedStatement prepareStatment = connection.prepareStatement(query);
            ResultSet resultSet = prepareStatment.executeQuery();
            while (resultSet.next()) {
//                Region r = new Region(resultSet.getInt(1), resultSet.getString(2));
//                r.setId(resultSet.getInt(1));
//                r.setName(resultSet.getString(2));
//              Kalau mau di langsung
                listRegion.add(new Region(resultSet.getInt(1), resultSet.getString(2)));
//                Kalau mau di tampung dulu
//                listRegion.add(r);
            }
        } catch (Exception e) {
        }
        return listRegion;
    }

    private List<Region> searchBy(String id) {
        List<Region> listRegion = new ArrayList<Region>();
        String query = "SELECT * FROM REGIONS WHERE region_id like '%" + id + "%' or region_name like '%" + id + "%'";
        try {
            PreparedStatement prepareStatment = connection.prepareStatement(query);
            ResultSet resultSet = prepareStatment.executeQuery();
            while (resultSet.next()) {
//                Region r = new Region(resultSet.getInt(1), resultSet.getString(2));
//                r.setId(resultSet.getInt(1));
//                r.setName(resultSet.getString(2));
//              Kalau mau di langsung
                listRegion.add(new Region(resultSet.getInt(1), resultSet.getString(2)));
//                Kalau mau di tampung dulu
//                listRegion.add(r);
            }
        } catch (Exception e) {
        }
        return listRegion;
    }

    public List<Region> getData(Object keyword, boolean isGetById) {
        List<Region> listRegion = new ArrayList<Region>();
        String query = "";
        if (isGetById) {
            query = "SELECT * FROM REGIONS WHERE region_id = " + keyword;
        } else {
            query = "SELECT * FROM REGIONS WHERE region_id like '%" + keyword + "%' or region_name like '%" + keyword + "%'";
        }

        try {
            PreparedStatement prepareStatment = connection.prepareStatement(query);
            ResultSet resultSet = prepareStatment.executeQuery();
            while (resultSet.next()) {
//                Region r = new Region(resultSet.getInt(1), resultSet.getString(2));
//                r.setId(resultSet.getInt(1));
//                r.setName(resultSet.getString(2));
//              Kalau mau di langsung
                listRegion.add(new Region(resultSet.getInt(1), resultSet.getString(2)));
//                Kalau mau di tampung dulu
//                listRegion.add(r);
            }
        } catch (Exception e) {
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
        String query = "UPDATE REGIONS SET REGION_NAME = ? WHERE REGION_ID = ?";
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

    public boolean save(Region r, boolean isInsert) {
        boolean result = false;
        String query = "";
        if (isInsert) {
            query = "INSERT INTO REGIONS(region_name,region_id) VALUES(?,?)";
        } else {
            query = "UPDATE REGIONS SET REGION_NAME = ? WHERE REGION_ID = ?";
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

    public boolean delete(int id) {
        boolean result = false;
        String query = "DELETE FROM REGIONS WHERE REGION_ID =" + id;
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
