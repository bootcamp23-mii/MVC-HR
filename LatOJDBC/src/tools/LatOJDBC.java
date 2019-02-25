package tools;

import controllers.EmployeeController;
import controllers.LocationController;
import daos.DepartmentDAO;
import daos.EmployeeDAO;
import daos.LocationDAO;
import daos.RegionDAO;
import models.Employee;
import models.Location;
import models.Region;
import tools.DBConnection;

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
        DepartmentDAO ddao = new DepartmentDAO(connection.getConnection());
        RegionDAO rdao = new RegionDAO(connection.getConnection());
        EmployeeDAO edao = new EmployeeDAO(connection.getConnection());
        LocationDAO ldao = new LocationDAO(connection.getConnection());

        //dengan constructor
        Region r = new Region();
        Employee e = new Employee();
        Location l = new Location();

        LocationController lc = new LocationController(connection.getConnection());
        EmployeeController ec = new EmployeeController(connection.getConnection());

//`       EMPLOYEE        
//        System.out.println(ec.getData("", false));
//        System.out.println(ec.getData("", false));
//        
//tanpa constructor
//        Region r= new Region();
//        r.setId(5);
//        r.setName("Jauh seklai");
//        rdao.insert(r);
//        System.out.println(rdao.update(r));
//        for (Region region : rdao.getAll()) {
//            System.out.println("ID      : " + region.getId());
//            System.out.println("Name    : " + region.getName());
//        } 
//        for (Employee employee : edao.getData("", false)) {
//            System.out.println("ID      : " + employee.getId());
//            System.out.println("Firs Name    : " + employee.getFirst_name());
//            System.out.println("Last Name    : " + employee.getLast_name());
//            System.out.println("Email    : " + employee.getEmail());
//            System.out.println("Phone number    : " + employee.getPhone_number());
//            System.out.println("Hire Date    : " + employee.getHire_date());
//            System.out.println("Job ID    : " + employee.getJob_id());
//            System.out.println("Salary    : " + employee.getSalary());
//            System.out.println("Commission pct    : " + employee.getCommission_pct());
//            System.out.println("Manager ID    : " + employee.getManager_id());
//            System.out.println("Department ID    : " + employee.getDepartment_id());
//        }

//      LOCATION CLASS
//      GET DATA
//        for (Location location : ldao.getData("", false)) {
//            System.out.println("============================================");
//            System.out.println("ID              : " + location.getId());
//            System.out.println("ADDRESS         : " + location.getAddress());
//            System.out.println("POSTAL CODE     : " + location.getPostal());
//            System.out.println("CITY            : " + location.getCity());
//            System.out.println("PROVINCE        : " + location.getProvince());
//            System.out.println("COUNTRY         : " + location.getCountry());
//        }
//      SAVE
        System.out.println(lc.insert("1001", "Jl. Kemanggisan Raya", "63572", "Jakarta brat", "Jakarta", "IN"));

//      DELETE
//      System.out.println(ldao.delete(1001));
    }
}
