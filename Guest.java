/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moviewaves;

/**
 *
 * @author Daniah
 */
import java.util.Scanner;

public class Guest extends User {
    // Variable to specify the access period for guests(10 minutes)    
    protected int accessPeriod = 10;
    // Default constructor
    public Guest(){}
    //Parameterized constructor for Guest 
    public Guest(int userID, String userName, String password, int phoneNumber){
        super(userName, password, phoneNumber);
    }
    //Override the signUp method to offer guest users the option to sign up
    @Override
    public void signUp(){
        String ansUp;
        Scanner input = new Scanner(System.in);
         // Inform the guests about their limited access and offer to sign up
        System.out.println("You don't have full access, with "+ accessPeriod+" minutes "
                + "before the session ends.\nSign up now to have a full access to our movie booking system.");
        System.out.println("Would you like to Sign up?");
        String ans =input.next();
        ansUp=ans.toUpperCase();
        if("NO".equals(ansUp)){
        System.out.println("Welcome Guest!");
       }
        // Call the superclass(user)signUp method for full access
        else if("YES".equals(ansUp)){
        super.signUp();   
        }else{
            System.out.println("Invalid entry!");
        }
    }
    //A method to display the movies currently showing in the theatre
    public void guestMovieInfo(){
        System.out.println("We have a great collection of movies to entertain you!\n"
                + "1. Wicked\n2. Piece by piece\n3.Venom \n4.Wild Robot \n"
                + "5. Interstaller \n6. Moana \n7. Despicable Me 4");
  }
    
}
