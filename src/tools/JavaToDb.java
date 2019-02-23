/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import controllers.RegionController;
import daos.EmployeeDAO;
import daos.RegionDAO;
import models.Employee;
import models.Region;

/**
 *
 * @author Panji Sadewo
 */
public class JavaToDb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DBConnection connection = new DBConnection();
        System.out.println(connection.getConnection());
        
        RegionDAO rdao = new RegionDAO(connection.getConnection());
        EmployeeDAO edao = new EmployeeDAO(connection.getConnection());
            
        //menggunakan contructor
//        Region r = new Region(6, "Jauh sekali");
          //Tanpa Constructor
//        Region r = new Region();
//        r.setId(5);
//        r.setName("Jauh Sekali");
//        rdao.insert(r);
          //jika mau dilangsung
//          System.out.println(rdao.update(new Region(1,"Panji Region")));
//          System.out.println(rdao.delete(5));
          //Tidak di langsung harus di tampung
//        System.out.println(rdao.insert(r));
//        for (Region region : rdao.getAll()) {
//            System.out.println(""+region.getId());
//            System.out.println(""+region.getName());
//            
//        }
//        for (Region region : rdao.getData("", false)) {
//            System.out.println(""+region.getId());
//            System.out.println(""+region.getName());
//        }
        for (Employee employee : edao.getData("", false)) {
            System.out.println(""+employee.getId());
            System.out.println(""+employee.getFirst_name());
            System.out.println(""+employee.getLast_name());
            System.out.println(""+employee.getEmail());
            System.out.println(""+employee.getPhone_number());
            System.out.println(""+employee.getHire_date());
            System.out.println(""+employee.getJob_id());
            System.out.println(""+employee.getSalary());
            System.out.println(""+employee.getCommission_pct());
            System.out.println(""+employee.getManager_id());
            System.out.println(""+employee.getDepartment_id());
        }

//          Coba controller
//
//          RegionController rc = new RegionController(connection.getConnection());
//          System.out.println(rc.insert("11", "Antartika"));

    }
    
}
