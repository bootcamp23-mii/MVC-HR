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
import java.util.Scanner;
import models.Location;

/**
 *
 * @author Pandu
 */
public class LocationDAO {

    private Connection connection;

    public LocationDAO(Connection connection) {
        this.connection = connection;
    }

    public boolean delete(int id) {
        boolean result = false;
        String query = "DELETE FROM LOCATIONS WHERE LOCATION_ID=" + id;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<Location> getData(Object keyword, boolean isGetById) {
        String query = "";
        List<Location> listRegion = new ArrayList<>();
        if (isGetById) {
            query = "SELECT * FROM LOCATIONS WHERE LOCATION_ID =" + keyword;
        } else {
            query = "SELECT * FROM LOCATIONS WHERE LOCATION_ID LIKE ? OR STREET_ADDRESS LIKE ?";
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "%" + keyword + "%");
            preparedStatement.setString(2, "%" + keyword + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                listRegion.add(new Location(
                        resultSet.getInt(1), resultSet.getString(2),
                        resultSet.getString(3), resultSet.getString(4),
                        resultSet.getString(5), resultSet.getString(6)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listRegion;
    }

    public boolean save(Location l, boolean isInsert) {
        boolean result = false;
        String query = "";
        if (isInsert) {
            query = "INSERT INTO LOCATIONS(street_address, location_id, postal_code, city, state_province, country_id)"
                    + "VALUES (?,?,?,?,?,?)";
        } else {
            System.out.println("UPDATE HARUSNYA MAH");
//            query = update() + "=?";
            query = "UPDATE LOCATIONS SET STREET_ADDRESS = ? WHERE LOCATION_ID = ?";
        }

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, l.getAddress());
            preparedStatement.setInt(2, l.getId());
            preparedStatement.setString(3, l.getPostal());
            preparedStatement.setString(4, l.getCity());
            preparedStatement.setString(5, l.getProvince());
            preparedStatement.setString(6, l.getCountry());
            preparedStatement.executeQuery();
            result = true;

            System.out.println(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public String update() {
        System.out.println("THEN, WHAT YOU LIKE TO UPDATE");
        System.out.println("1. Address \n 2. Postal \n 3. City \n 4. Province \n 5. Country");
        String Snull = "";
        Scanner mys = new Scanner(System.in);
        String inputku = mys.nextLine();
//        int x = mys.nextInt();
        switch (inputku) {
            case "satu":
                System.out.println("Input Your Destination Address");
                String add = mys.nextLine();
                Snull = "UPDATE LOCATIONS SET STREET_ADDRESS = '" + add + "' WHERE LOCATION_ID";
                break;
            case "2":
                System.out.println("Input Your Destination Postal Code");
                String post = mys.nextLine();
                Snull = "UPDATE LOCATIONS SET POSTAL_CODE = '" + post + "' WHERE LOCATION_ID";
                break;
            case "3":
                System.out.println("Input Your Destination City");
                String cit = mys.nextLine();
                Snull = "UPDATE LOCATIONS SET CITY = '" + cit + "' WHERE LOCATION_ID";
                break;
            case "4":
                System.out.println("Input Your Destination Province");
                String prov = mys.nextLine();
                Snull = "UPDATE LOCATIONS SET STATE_PROVINCE = '" + prov + "' WHERE LOCATION_ID";
                break;
            case "5":
                System.out.println("Input Your Destination Country");
                String coun = mys.nextLine();
                Snull = "UPDATE LOCATIONS SET COUNTRY_ID = '" + coun + "' WHERE LOCATION_ID";
                break;
            default:
                System.out.println("kok kuraaaang");
        }
        return Snull;
    }

}
