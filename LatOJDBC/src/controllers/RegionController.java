/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.RegionDAO;
import java.sql.Connection;
import models.Region;

/**
 *
 * @author Pandu
 */
public class RegionController {

    private Connection connection;
    private RegionDAO rdao;

    public RegionController(Connection connection) {
        rdao = new RegionDAO(connection);
    }

    public String insert(String id, String name) {
        String result = "";
        if (rdao.save(new Region(Integer.parseInt(id), name), true)) {
            result = "YEAY";
        } else {
            result = "OUCH";
        }
        return result;
    }

}
