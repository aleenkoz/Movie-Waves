/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moviewaves;

/**
 *
 * @author Ruqayah
 */
// The subclass of the superclass Booking
public class SameDayBookings extends Booking {
    // A data field with value of addtional price for rushed booking
    protected double sameDayPrice=0.10;
    
    // The constructor of the class    
    public SameDayBookings(){
        super(); // Calling the constructor of the superclass Booking
    }
    
    // The overrided method that calculate the price for same day booking
    @Override
    public double calculatePrice(){
        double initialPrice = super.calculatePrice();
        double finalDayPrice = initialPrice + (initialPrice * sameDayPrice);

        return finalDayPrice;
        
    }
    
}
