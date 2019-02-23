/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author USER
 */
public class Country {
    private String id;
    private String name;
    private int regoinId;

    public Country() {
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegoinId() {
        return regoinId;
    }

    public void setRegoinId(int regoinId) {
        this.regoinId = regoinId;
    }
    
    
}
