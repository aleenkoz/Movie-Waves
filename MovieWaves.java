/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moviewaves;

/**
 *
 * @author Aleen
 */
import java.util.Scanner;
public class MovieWaves {

    public static void main(String[] args) {
        
        boolean exit = true;
        Scanner input = new Scanner(System.in);
        User user = new User();
        Guest randomGuest = new Guest();
        Admin admin = new Admin();
        
        /* System.out.print("⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⣤⣤⡄\n" +
        "⢀⢀⢀⢸⣷⣤⡀⢀⢀⢀⢀⢀⢀⢀⣠⣶⣿⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⠛⠛⠃\n" +
        "⢀⢀⢀⢸⣿⣿⣿⣷⣤⡀⢀⣠⣶⣿⣿⣿⣿⢀⢀⣠⣴⣶⣶⣶⣦⣄⢀⢀⠰⣶⣶⣦⢀⢀⢀⢀⣴⣶⣶⠆⢀⣶⣶⡆⢀⢀⣠⣴⣶⣶⣶⣦⣄\n" +
        "⢀⢀⢀⢸⣿⣿⡿⣿⣿⣿⣿⣿⣿⠿⣿⣿⣿⢀⣼⣿⡿⠛⠛⠛⢿⣿⣷⡀⢀⠹⣿⣿⣧⢀⢀⣸⣿⣿⠏⢀⢀⣿⣿⡇⢀⣾⣿⡿⠛⠛⠻⣿⣿⣧\n" +
        "⢀⢀⢀⢸⣿⣿⡇⢀⠙⠻⠟⠋⢀⢀⣿⣿⣿⢸⣿⣿⠁⢀⢀⢀⠈⣿⣿⡇⢀⢀⠹⣿⣿⣧⣰⣿⣿⠏⢀⢀⢀⣿⣿⡇⢸⣿⣿⣷⣶⣶⣶⣾⣿⣿⡆\n" +
        "⢀⢀⢀⢸⣿⣿⡇⢀⢀⢀⢀⢀⢀⢀⣿⣿⣿⠈⣿⣿⣧⣀⣀⣀⣴⣿⣿⠃⢀⢀⢀⠹⣿⣿⣿⣿⡟⢀⢀⢀⢀⣿⣿⡇⠘⣿⣿⣧⣀⣀⣀⣤⣄⡀\n" +
        "⢀⢀⢀⢸⣿⣿⡇⢀⢀⢀⢀⢀⢀⢀⣿⣿⣿⢀⠈⠻⢿⣿⣿⣿⡿⠟⠁⢀⢀⢀⢀⢀⠹⣿⣿⡟⢀⢀⢀⢀⢀⣿⣿⡇⢀⠈⠻⣿⣿⣿⣿⡿⠟⠁\n" +
        "⢀⢀⢀⠈⠉⠉⠁⢀⢀⢀⢀⢀⢀⢀⠉⠉⠁⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⠈⠉⢀⢀⢀⢀⢀⢀⠉⠉⠁⢀⢀⢀⢀⢀⠁\n" +
        "⠹⣿⣿⡌⢿⣿⣧⢀⢀⢀⢀⣾⣿⡟⢀⢀⣠⣶⣿⣿⣿⣦⣿⣿⣿⢀⠹⣿⣿⣆⢀⢀⢀⢀⣿⣿⡿⠁⢀⢀⣴⣶⣿⣿⣷⣦⣄⢀⢀⣠⣾⣿⣿⣿⣿⣶⡄\n" +
        "⢀⠹⣿⣿⣌⢿⣿⣧⡀⢀⣾⣿⠟⢀⢀⣾⣿⡿⠋⠉⠙⢿⣿⣿⣿⢀⢀⢻⣿⣿⣆⢀⢀⣾⣿⡿⠁⢀⢰⣿⣿⠟⠋⠉⠛⣿⣿⣧⢀⣿⣿⣏⣀⠈⠹⠿⠿\n" +
        "⢀⢀⠘⣿⣿⣾⣿⣿⣷⣿⣿⠏⢀⢀⢸⣿⣿⢀⢀⢀⢀⢀⣿⣿⣿⢀⢀⢀⢻⣿⣿⣆⣾⣿⣿⠃⢀⢀⢾⣿⣿⣿⣿⣿⣿⣿⣿⣿⢀⠙⠿⣿⣿⣿⣿⣶⡄\n" +
        "⢀⢀⢀⠘⣿⣿⡿⢻⣿⣿⠏⢀⢀⢀⠈⢿⣿⣷⣄⣀⣠⣾⣿⣿⣿⢀⢀⢀⢀⢻⣿⣿⣿⣿⠃⢀⢀⢀⠸⣿⣿⣦⣀⣀⣤⣦⣤⡀⢀⣿⣿⣆⣀⣈⣹⣿⣿\n" +
        "⢀⢀⢀⢀⠘⠿⠁⢀⢻⠏⢀⢀⢀⢀⢀⢀⠙⠿⣿⣿⣿⠟⣿⣿⣿⢀⢀⢀⢀⢀⢻⣿⣿⠃⢀⢀⢀⢀⢀⠈⠻⢿⣿⣿⣿⠿⠋⢀⢀⠘⠻⣿⣿⣿⣿⠿⠃\n" +
        "\n" +
        "⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⣀⣀⠤⣤⠤⡤⢤⣀⡀\n" +
        "⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⣀⡤⣲⣬⣽⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⢄\n" +
        "⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⡠⣲⣯⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣦⡀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⡀\n" +
        "⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⠘⢷⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⢿⡿⣿⣿⣿⣦⣀⢀⢀⢀⢀⢀⢀⢀⣴⣿⣿⣦⣄\n" +
        "⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⠙⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢛⣯⠼⠓⠉⠉⠉⠉⠑⠻⣿⣿⣵⣦⣤⣤⣤⣶⣿⣿⣿⣿⣿⣿⣷⣦\n" +
        "⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⠈⠛⢿⣿⣿⣿⣿⡿⢿⡥⠟⠉⢀⢀⢀⢀⢀⢀⢀⢀⢀⠈⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⠁\n" +
        "⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⠙⠻⣿⣩⠗⠉⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⠙⢿⣿⣿⣿⣿⣿⣿⣿⠟⠋\n" +
        "⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⠈⠁⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⠙⠚⠯⠛⠚⠉\n"); */

        //first thing the user would do is choose thier position
        System.out.println("Welcome to Movie Waves! Are you:\n" +
                "1. Customer \n2. Guest\n3. Admin" +
                "\nPlease enter the number that corresponds with your position:");
        
        int position = input.nextInt();
        input.nextLine();
        
        //A loop to repeat the process if the situation reqires
        while (exit) {
            switch (position) {
                case 2:
                    //Case : guest
                    while (true) {
                        System.out.print("What would you like to do today?\n" +
                                "1. Sign up \n2. Browse the currently-showing movies \n");
                        int guestDecision = input.nextInt();
                        input.nextLine();
                        
                        if (guestDecision == 2) {
                            randomGuest.guestMovieInfo();
                            System.out.println("Please return to the main page to sign up.");
                            break;
                        } exit=false; 
                        if (guestDecision == 1) {
                            randomGuest.signUp();
                            System.out.println("Please return to the main page to log in\\signUp.");
                            break;
                        }if(guestDecision!=1 && guestDecision != 2) {
                            System.out.print("Sorry! Incorrect entry! Try again.");
                        }
                    }
                    break;
                    //Case: Customer
                case 1:
                    while (true) {
                        System.out.println("Welcome back! To access the system, please enter:" +
                                "\nYour username: ");
                        String customerUserName = input.nextLine();
                        System.out.println("Your password: ");
                        String customerPassword = input.nextLine();
                        System.out.print("Your phone number: ");
                        int customerPhoneNumber = input.nextInt();
                        input.nextLine();

                        Customer actualCustomer = new Customer(customerUserName, customerPassword, customerPhoneNumber);
                        boolean customerEntering = actualCustomer.login(customerUserName, customerPassword);
                        
                        if (customerEntering) {
                            System.out.println("What would you like to do today?" +
                                    "\n1. Book a ticket\n2. Cancel a ticket\n3. Modify a booking\n");
                            int customerAnswer = input.nextInt();
                            input.nextLine();  // Consume newline
                            if(customerAnswer>0 && customerAnswer<4){
                            switch (customerAnswer) {
                                case 1:
                                    actualCustomer.bookTicket();
                                    break;
                                case 2:
                                    actualCustomer.cancelTicket();
                                    break;
                                case 3:
                                    actualCustomer.modifyTicket();
                                    break;
                                default:
                                    System.out.println("Invalid entry! Try again!");
                            }
                            exit= false;
                        } else {
                            System.out.println("Invalid entry. Try again.");
                        }
                    }
                    break;
                    }
                    break;
                //Case: Admin 
                case 3:
                    while (true) {
                        boolean isRealAdmin = admin.verify();
                        if(isRealAdmin){
                            System.out.println("What would you like to do today? " +
                                    "1. Add an employee \n2. Remove an employee");
                            int adminChoice = input.nextInt();
                            input.nextLine();

                            switch (adminChoice) {
                                case 1:
                                    System.out.print("Enter the full name of the employee: ");
                                    String employee = input.nextLine();
                                    admin.addEmployee(employee);
                                    break;
                                case 2:
                                    System.out.print("Enter the full name of the employee: ");
                                    String removedEmployee = input.nextLine();
                                    admin.removeEmployee(removedEmployee);
                                    break;
                                default:
                                    System.out.println("Invalid entry, try again!");
                            }
                            break;
                        }
                        break;
                    }
                    break;
                default:
                    System.out.println("Invalid entry! Try again please.");
                    exit = false;
            }
        } 
        input.close();
    }         
}
