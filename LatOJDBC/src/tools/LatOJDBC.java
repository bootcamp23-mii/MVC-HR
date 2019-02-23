

import daos.DepartmentDAO;
import daos.RegionDAO;
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
   for (Region region : rdao.getData(r, true)) {
            System.out.println("ID      : " + region.getId());
            System.out.println("Name    : " + region.getName());
        }
    }
}

