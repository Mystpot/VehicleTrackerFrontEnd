/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicletracker;

import java.util.List;

/**
 *
 * @author gemorgan
 */
public class Customer {
    
    private long customerId;
    private String name;
    private String surname;
    private String email;
    private int houseNumber;
    private String city;
    private String province;
    private int postalCode;
    private String complex;
    private String street;
    
    public Customer()
    {
        
    }
    
    public Customer(String name, String surname, String email, int houseNumber, 
            String city, String province, int postalCode,
            String complex, String street)
    {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.houseNumber = houseNumber;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
        this.complex = complex;
        this.street = street;
    }
    
    public Long getCustomerID() {
        return customerId;
    }
    
    public void setCustomerID(Long id) {
        customerId = id;
    }

    public String getName() 
    
    { return name; }
    
     public void setName(String nam) {
        name = nam;
    }


    public String getSurname() {
        return surname;
    }
    
     public void setSurname(String sn) {
        surname = sn;
    }


    public String getEmail() {
        return email;
    }
    
     public void setEmail(String em) {
        email = em;
    }


    public int getHouseNumber() {
        return houseNumber;
    }
    
     public void setHouseNumber(int hn) {
        houseNumber = hn;
    }


    public String getCity() {
        return city;
    }
    
     public void setCity(String cit) {
        city = cit;
    }
     
    public String getProvince() {
        return province;
    }
    
     public void setProvince(String prov) {
        province = prov;
    }

    public int getPostalCode() {
        return postalCode;
    }
    
     public void setPostalCode(int pc) {
        postalCode = pc;
    }
     
     public String getComplex() {
         return complex;
     }
     
     public void setComplex(String com) {
         complex = com;
     }
     
     public String getStreet() {
         return street;
     }
     
     public void setStreet(String stre) {
         street = stre;
     }
     
}
