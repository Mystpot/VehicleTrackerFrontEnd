/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicletracker;

import java.math.BigDecimal;

/**
 *
 * @author gemorgan
 */
public class Rent {
    
    private Long id;
    private String rentDate;
    private String returntDate;
    private BigDecimal totalPrice;
    private int rentalDays;
    private boolean outstanding;
    private String carMake;
    private int carYear;
    private String carModel;
    private String carNumberPlate;
    private int customerId;
    private int orderNum;
    
     public Rent()
    {
        
    }
    
    public Rent(String rentDate, String returnDate,
            BigDecimal totalPrice, int rentalDays, boolean outstanding,
            String carMake, int carYear, String carModel, String numberPlate, int customerId,
            int orderNum)
    {
        this.carMake = carMake;
        this.carYear = carYear;
        this.carModel = carModel;
        this.carNumberPlate = carNumberPlate;
        this.rentDate = rentDate;
        this.returntDate = returnDate;
        this.totalPrice = totalPrice;
        this.rentalDays = rentalDays;
        this.outstanding = outstanding;
        this.customerId = customerId;
        this.orderNum = orderNum;
    }
    
    public Long getID() {
        return id;
    }
    
    public void setID(Long rid) {
        id = rid;
    }
    
    public int getOrderNum() {
        return orderNum;
    }
    
    public void setOrderNum(int oN)
    {
        orderNum = oN;
    }
    
    public int getCustomerID() {
        return customerId;
    }
    
    public void setCustomerID(int cusID)
    {
        customerId = cusID;
    }

    public int getCarYear() 
    
    { return carYear; }
    
     public void setCarYear(int cY) {
        carYear = cY;
    }


    public String getCarMake() {
        return carMake;
    }
    
     public void setCarMake(String cM) {
        carMake = cM;
    }
     
     public String getCarModel() {
         return carModel;
     }
     
     public void setCarModel(String cMM) {
         carModel = cMM;
     }
     
     public String getCarNumberPlate() {
         return carNumberPlate;
     }
     
     public void setCarNumberPlate(String cNP)
     {
         carNumberPlate = cNP;
     }

    /**
     * @return the rentDate
     */
    public String getRentDate() {
        return rentDate;
    }

    /**
     * @param rentDate the rentDate to set
     */
    public void setRentDate(String rD) {
        rentDate = rD;
    }

    /**
     * @return the returntDate
     */
    public String getReturnDate() {
        return returntDate;
    }

    /**
     * @param returntDate the returntDate to set
     */
    public void setReturnDate(String rDD) {
        returntDate = rDD;
    }

    /**
     * @return the totalPrice
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * @param totalPrice the totalPrice to set
     */
    public void setTotalPrice(BigDecimal tP) {
        totalPrice = tP;
    }

    /**
     * @return the rentalDays
     */
    public int getRentalDays() {
        return rentalDays;
    }

    /**
     * @param rentalDays the rentalDays to set
     */
    public void setRentalDays(int rDa) {
        rentalDays = rDa;
    }

    /**
     * @return the outstanding
     */
    public boolean isOutstanding() {
        return outstanding;
    }

    /**
     * @param outstanding the outstanding to set
     */
    public void setOutstanding(boolean outst) {
        outstanding = outst;
    }
     
     
    
}
