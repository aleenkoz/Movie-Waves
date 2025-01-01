/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moviewaves;

/**
 *
 * @author Raneem, Daniah, and Najaf
 */
import java.util.Scanner;
public class User {
    Scanner input= new Scanner(System.in);
    
    // Fields for storing user information
    protected String userName;
    protected String password;
    protected int phoneNumber;
    // Default constructor    
    public User(){}
    // Parameterized constructor for initializing the User object
    public User(String userName, String password, int phoneNumber){
        this.userName= userName;
        this.password= password;
        this.phoneNumber= phoneNumber;        
    }
    // this method checks if the provided username and password match the stored credentials.
    public boolean login(String userName, String password){
        if (this.userName.equals(userName) && this.password.equals(password)) {
            System.out.println("Login successful for user: " + userName);
            return true;
        } else {
            System.out.println("Login failed for user: " + userName);
            return false;
        }
    }
   // Validates a username based on predefined rules
    public static boolean validUsername(String userName) {
        
        boolean containUppercase = false ;
        boolean containNumber = false ;
        boolean noSymbol = false;
     // Iterate through each character in the username   
        for (int i = 0; i < userName.length(); i++) {
        char ch = userName.charAt(i);
        if (Character.isUpperCase(ch)) {
           containUppercase = true;   
        }
        if (Character.isDigit(ch)) {
            containNumber = true;  
        } 
        if (Character.isLetterOrDigit(ch)) {
            noSymbol= true; 
        }
      
    }
        // Return true only if all conditions are met
        return containUppercase && containNumber && noSymbol;
    }
    // Validates a password based on predefined rules
    public static boolean validPassword(String password) {
        
        boolean containUppercase = false ;
        boolean containNumber = false ;
        boolean containSymbol =false;
        // Return false immediately if the password is too short        
        if (password.length()< 8)
            return false;
        else{
         // Iterate through each character in the password   
        for (int i = 0; i < password.length(); i++)
        {
            
        char ch = password.charAt(i);
        
        if (Character.isUpperCase(ch)) {
            containUppercase = true;
            
        }

        if (Character.isDigit(ch)) {
            containNumber = true;  
        }
        
        if (!Character.isLetterOrDigit(ch)) { // Checks for a symbol
            containSymbol= true; 
        }
    }   
        // Return true only if all conditions are met
        return containUppercase && containNumber && containSymbol;
    }
    }
    // Guides the user through the sign-up process, enforcing username and password rules.
    public void signUp() {
        Scanner input = new Scanner(System.in);

        String userName;
        String password;
        int phoneNumber;
    
    // Loop until the user provides a valid username    
     while (true) {
            System.out.println("Username Rules");
            System.out.println("- at least one capital letter");
            System.out.println("- at least one number");
            System.out.println("- no symbols");
            System.out.println("Enter Your Username:");
            userName = input.next();
            if (validUsername(userName)) {
              break;
            } else {
                System.out.println("Invalid Username");
            }
        }
     // Loop until the user provides a valid password
     while (true) {
            System.out.println("Password Rules");
            System.out.println("- must be 8 characters at least ");
            System.out.println("- at least one capital letter");
            System.out.println("- at least one number");
            System.out.println("- at least one symbol");
            System.out.println("Enter Your Password:");
            password = input.next();
            if (validPassword(password)) {
              break;
            } else {
                System.out.println("Invalid Password");
            }
        }
        // Prompt the user to enter their phone number
        System.out.println("Enter Your Phone Number:");
        phoneNumber = input.nextInt();
        // Create a new Customer object with the entered details
        Customer aCustomer= new Customer(userName, password, phoneNumber);
    }
    
    // Gets the user's username.
    public String getUserName(){
        return userName;
        
    }
     // Gets the user's phone number.
    public int getPhoneNumber() {
        return phoneNumber;
    }
    
}
