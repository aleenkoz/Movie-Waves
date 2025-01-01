/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moviewaves;

/**
 *
 * @author Aleen
 */
public class AdvanceBookings extends Booking {
    protected double advanceFee=0.05;
    //The default constructor that calls the superclass constructor.
    public AdvanceBookings(){
        super();
    }
    
    //The overloaded method that calcultes the price of the ticket booked in advance
    public double calculatePrice(String promotionDiscount){
        double initialPrice= super.calculatePrice();
        double newPrice= initialPrice+(initialPrice*advanceFee);
        if("ARRDN".equals(promotionDiscount)){
            newPrice= newPrice-(newPrice*0.15);
            
            return newPrice;
        }
        else{
            return newPrice;
        }
        
    }
    
}
