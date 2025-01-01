/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moviewaves;

/**
 *
 * @author Raneem
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends User {
    
    Scanner input = new Scanner(System.in);
    //  List to store the history of booking IDs
    private ArrayList<Integer> bookingHistory;
    // Object of Booking class to handle ticket-related operations
    Booking toTheCinema = new Booking();
 /**
     * Parameterized constructor for Customer.
     * Initializes the user credentials and creates an empty booking history.
     * */    
    public Customer ( String userName, String password, int phoneNumber){
        super(userName, password, phoneNumber);
        this.bookingHistory = new ArrayList<>();
    }
    // Default constructor    
    public Customer(){}

/**
     * Allows the customer to book a ticket.
     * The booking ID is generated and added to the booking history.
     */
    public void bookTicket(){    
        while(true){
        System.out.print("Would you like to book in advance? (yes/no)");
        String answer = input.nextLine().trim();
        if(answer.toUpperCase().equals("YES")){
            AdvanceBookings booking = new AdvanceBookings(); //Object from the AdvanceBookings subclass
            booking.bookTicket(); // Perform the booking operation
            bookingHistory.add(Integer.valueOf(booking.generateBookingID()));// Add the generated booking ID to the history
            System.out.print("Do you know the secret promotion disscount? Type it of you do, and type \"no\" if you don't: ");
            String promotionDisscount = input.nextLine().trim();
            System.out.print("The price of your ticket will be: "+ booking.calculatePrice(promotionDisscount.toUpperCase()));
            break;
        } else if(answer.toUpperCase().equals("NO")){
            SameDayBookings booking = new SameDayBookings(); //Object from class SameDayBookings
            booking.bookTicket(); // Perform the booking operation
            bookingHistory.add(Integer.valueOf(booking.generateBookingID()));// Add the generated booking ID to the history
            System.out.print("The price of your ticket will be: "+ booking.calculatePrice()+" SAR ");
            break;
        }
        else{
            System.out.println("Sorry, invalid entry!, try again!");
        }
        }
    }
    /**
     * Allows the customer to cancel a ticket.
     * Removes the booking ID from the booking history.
     */
    public void cancelTicket(){
        System.out.print("Have you booked in advance? (yes/no)");
        String answer= input.nextLine();
        if(answer.toUpperCase().equals("YES")){
         toTheCinema.cancelBooking();// Perform the cancellation operation
         bookingHistory.remove(Integer.valueOf(toTheCinema.generateBookingID()));// Remove the generated booking ID from the history   
        } else if(answer.toUpperCase().equals("NO")) {
            System.out.println("Sorry, we can't cancel same day tickets.");
        } else{
            System.out.println("Invalid entry!");
        }
        

    }
    //Allows the customer to modify an existing ticket.
    public void modifyTicket(){
        toTheCinema.modifyTicket();
    }
    
}
