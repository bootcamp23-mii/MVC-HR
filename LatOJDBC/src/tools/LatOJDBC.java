


import controllers.EmployeeController;
import daos.DepartmentDAO;
import daos.EmployeeDAO;
import daos.RegionDAO;
import models.Employee;
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
        DepartmentDAO ddao= new DepartmentDAO(connection.getConnection());
        RegionDAO rdao = new RegionDAO(connection.getConnection());
        //dengan constructor
        Region r= new Region();
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
//   for (Region region : rdao.getData(20, true)) {
//            System.out.println("ID      : " + region.getId());
//            System.out.println("Name    : " + region.getName());
//        }

        EmployeeController ec = new EmployeeController(connection.getConnection());
        EmployeeDAO edao = new EmployeeDAO(connection.getConnection());
        System.out.println(ec.insert("209", "a", "x", "sz", "123456789122", "12-12-2018", "IT_PROG", "5000", "0.3", "102", "60"));
//        edao.save(new Employee(208, "a", "x", "ss", "123456789122", "12-12-2018", "IT_PROG", 5000, 0.3, 102, 60),true);
    }
}


