/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import controllers.RegionController;
import daos.RegionDAO;
import models.Region;

/**
 *
 * @author Pandu
 */
public class RegionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DBConnection connection = new DBConnection();
        System.out.println(connection.getConnection());

        RegionDAO rdao = new RegionDAO(connection.getConnection());
//        Region r = new Region(6, "Malaysia");
//        Region r = new Region();
//        r.setId(5);
//        r.setName("INDONESIA");
//        rdao.insert(r);

        RegionController rc = new RegionController(connection.getConnection());
        

//      GET DATA
//        for (Region region : rdao.getData("", false)) {
//            System.out.println("ID      : " + region.getId());
//            System.out.println("NAME    : " + region.getName());
//        }
        
//      SAVE
        System.out.println(rc.insert("7", "NIggeria"));
        
//      INSERT
//        System.out.println(rc.insert("7", "NIggeria"));
//        System.out.println(rdao.insert(new Region(6, "Malaysia")));
//        System.out.println(rdao.update(new Region(4, "Irian Jaya")));

//     GETALL
//        for (Region region : rdao.getCall()){
//            System.out.println("ID      : "+region.getId());
//            System.out.println("NAME    : "+region.getName());
//        }

//      UPDATE
//        System.out.println(rdao.update(new Region(4, "Irian Jaya")));
//        System.out.println(rdao.update(2));
//        System.out.println(rdao.getById(2));

//      GET BY ID
//        for (Region region : rdao.getById(2)) {
//            System.out.println("ID      : " + region.getId());
//            System.out.println("NAME    : " + region.getName());
//        }

//      DELETE
//        System.out.println(rdao.delete(6));
//        System.out.println(rdao.getSearch("a"));

//      GET SEARCH
//        for (Region region : rdao.getSearch("s")) {
//            System.out.println("ID      : " + region.getId());
//            System.out.println("NAME    : " + region.getName());
//        }
    }
}
