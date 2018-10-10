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
public class Car {
     
    private long id;
    private String make;
    private String model;
    private int year;
    private String numberPlate;
    private Category category;
    private boolean status;
    
    public Car()
    {
        
    }
    
    public Car(String make, String model, int year, 
            String numberPlate, Category category, boolean status)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.numberPlate = numberPlate;
        this.category = category;
        this.status = status;
    }
    
    public Long getID() {
        return id;
    }
    
    public void setID(Long cid) {
        id = cid;
    }

    public String getMake() 
    
    { return make; }
    
     public void setMake(String ma) {
        make = ma;
    }


    public String getModel() {
        return model;
    }
    
     public void setModel(String mod) {
        model = mod;
    }


    public int getYear() {
        return year;
    }
    
     public void setYear (int ye) {
        year = ye;
    }


    public String getNumberPlate() {
        return numberPlate;
    }
    
     public void setNumberPlate(String np) {
        numberPlate = np;
    }
     
     public Category getCategory()
     {
         return category;
     }
     
     public void setCategory(Category cat)
     {
         category = cat;
     }

    public boolean getStatus() {
        return status;
    }
    
     public void setStatus(boolean stat) {
        status = stat;
    }  
}
