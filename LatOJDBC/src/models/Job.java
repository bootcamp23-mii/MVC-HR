/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/** model yang digunakan untuk mendapatkan dan melakukan set nilai id, nama, min dan max salary
 *
 * @author Lusiana
 */
public class Job {
    private String id;
    private String name;
    private int max_salary;
    private int min_salary;
    
    public Job(){};

    public Job(String id, String name, int min_salary, int max_salary) {
        this.id = id;
        this.name = name;
        this.min_salary = min_salary;
        this.max_salary = max_salary;
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
    
    public int getMin_salary() {
        return min_salary;
    }

    public void setMin_salary(int min_salary) {
        this.min_salary = min_salary;
    }

    public int getMax_salary() {
        return max_salary;
    }

    public void setMax_salary(int max_salary) {
        this.max_salary = max_salary;
    }
    
}
