/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicletracker;

/**
 *
 * @author gemorgan
 */
public class Category {
    
    private long id;
    private String name;
    private double price;
    
    public Category()
    {
        
    }
    
    public Category(String name, double price)
    {
        this.name = name;
        this.price = price;
    }
    
    public Long getID() {
        return id;
    }
    
    public void setID(Long cid) {
        id = cid;
    }

    public String getName() 
    
    { return name; }
    
     public void setName(String na) {
        name = na;
    }


    public double getPrice() {
        return price;
    }
    
     public void setPrice(double pric) {
        price = pric;
    }
}
