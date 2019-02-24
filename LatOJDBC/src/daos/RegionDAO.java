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
 * @author Pandu
 */
public class RegionDAO {

    private Connection connection;

    // The bad way u using connection
//    public RegionDAO() {
//        DBConnection con =  new DBConnection();
//        connection = con.getConnection();
//    }
    public RegionDAO(Connection connection) {
        this.connection = connection;
    }

//     private List<Region> getCall() {
//         List<Region> listRegion = new ArrayList<Region>();
//         String query = "SELECT * FROM REGIONS";
//         try {
//             PreparedStatement preparedStatement = connection.prepareStatement(query);
//             ResultSet resultSet = preparedStatement.executeQuery();
//             while (resultSet.next()) {
// //                Region r = new Region(resultSet.getInt(1), resultSet.getString(2));
// //                r.setId(resultSet.getInt(1));
// //                r.setName(resultSet.getString(2));
//                 listRegion.add(new Region(resultSet.getInt(1), resultSet.getString(2)));
//             }
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//         return listRegion;
//     }
//     private boolean insert(Region r) {
//         boolean result = false;
//         String query = "INSERT INTO REGIONS(region_name, region_id) VALUES (?,?)";
//         try {
//             PreparedStatement preparedStatement = connection.prepareStatement(query);
//             preparedStatement.setString(1, r.getName());
//             preparedStatement.setInt(2, r.getId());
//             preparedStatement.executeQuery();
//             result = true;
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//         return result;
//     }
//     private boolean update(Region r) {
//         boolean result = false;
//         String query = "UPDATE REGIONS SET REGION_NAME = ? WHERE REGION_ID = ?";
//         try {
//             PreparedStatement preparedStatement = connection.prepareStatement(query);
//             preparedStatement.setString(1, r.getName());
//             preparedStatement.setInt(2, r.getId());
//             preparedStatement.executeQuery();
//             result = true;
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//         return result;
//     }
//     private List<Region> getById(int id) {
//         List<Region> listRegion = new ArrayList<Region>();
//         String query = "SELECT * FROM REGIONS WHERE REGION_ID =" + id;
//         try {
//             PreparedStatement preparedStatement = connection.prepareStatement(query);
//             ResultSet resultSet = preparedStatement.executeQuery();
//             while (resultSet.next()) {
//                 listRegion.add(new Region(resultSet.getInt(1), resultSet.getString(2)));
//             }
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//         return listRegion;
//     }
//     private List<Region> getSearch(String key) {
//         List<Region> listRegion = new ArrayList<Region>();
//         String query = "SELECT * FROM REGIONS WHERE REGION_ID LIKE ? OR REGION_NAME LIKE ?";
//         try {
//             PreparedStatement preparedStatement = connection.prepareStatement(query);
//             preparedStatement.setString(1, "%" + key + "%");
//             preparedStatement.setString(2, "%" + key + "%");
//             ResultSet resultSet = preparedStatement.executeQuery();
//             while (resultSet.next()) {
//                 listRegion.add(new Region(resultSet.getInt(1), resultSet.getString(2)));
//             }
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//         return listRegion;
//     }
    public boolean delete(int id) {
        boolean result = false;
        String query = "DELETE FROM REGIONS WHERE REGION_ID=" + id;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<Region> getData(Object keyword, boolean isGetById) {
        String query = "";
        List<Region> listRegion = new ArrayList<Region>();
        if (isGetById) {
            query = "SELECT * FROM REGIONS WHERE REGION_ID =" + keyword;
        } else {
            query = "SELECT * FROM REGIONS WHERE REGION_ID LIKE ? OR REGION_NAME LIKE ?";
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "%" + keyword + "%");
            preparedStatement.setString(2, "%" + keyword + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                listRegion.add(new Region(resultSet.getInt(1), resultSet.getString(2)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listRegion;
    }

    public boolean save(Region r, boolean isInsert) {
        boolean result = false;
        String query = "";
        if (isInsert) {
            query = "INSERT INTO REGIONS(region_name, region_id) VALUES (?,?)";
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

}
