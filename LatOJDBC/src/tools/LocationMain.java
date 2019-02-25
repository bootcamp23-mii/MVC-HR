/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import controllers.LocationController;
import daos.LocationDAO;
import models.Location;

/**
 *
 * @author Pandu
 */
public class LocationMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DBConnection connection = new DBConnection();
        System.out.println(connection.getConnection());

        LocationDAO ldao = new LocationDAO(connection.getConnection());

        LocationController lc = new LocationController(connection.getConnection());
        

//      GET DATA
        
        for (Location location : lc.getAll("")) {
            System.out.println("============================================");
            System.out.println("ID              : " + location.getId());
            System.out.println("ADDRESS         : " + location.getAddress());
            System.out.println("POSTAL CODE     : " + location.getPostal());
            System.out.println("CITY            : " + location.getCity());
            System.out.println("PROVINCE        : " + location.getProvince());
            System.out.println("COUNTRY         : " + location.getCountry());
        }
        
//      SAVE
        System.out.println(lc.insert("1001", "Jl. Kemanggisan Raya","63572","Jakarta brat","Jakarta","IN"));

//      DELETE
//      System.out.println(ldao.delete(1001));
  

    }
}
