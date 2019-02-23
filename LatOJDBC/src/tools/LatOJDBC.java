/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import daos.RegionDAO;
import models.Region;

/**
 *
 * @author milhamafemi
 */
public class LatOJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DBConnection connection = new DBConnection();
        //System.out.println(connection.getConnection());

        RegionDAO rdao = new RegionDAO(connection.getConnection());
        //dengan constructor
        Region r= new Region(6,"bobo");
        //tanpa constructor
//        Region r= new Region();
//        r.setId(5);
//        r.setName("Jauh seklai");
//        rdao.insert(r);
        System.out.println(rdao.update(r));
//        for (Region region : rdao.getAll()) {
//            System.out.println("ID      : " + region.getId());
//            System.out.println("Name    : " + region.getName());
//        }
    }
}
