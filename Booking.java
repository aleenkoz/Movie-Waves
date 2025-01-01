/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moviewaves;

/**
 *
 * @author Aleen & Ruqayah
 */
import java.util.Scanner;
public class Booking {
    protected int bookingID;
    private static int numberOfBookings;
    protected Movie movie;
    
    Scanner input= new Scanner(System.in);
    
    //A default constructor for the class
    Booking(){
    }
    //Objects of class Movie to represent the currently showing movies
    OtherScreenings wicked = new OtherScreenings("Wicked","Auditorium 6","Monday 12:00pm", true, false);
    OtherScreenings pieceByPiece = new OtherScreenings("Piece by Piece", "Auditorium 1", "Thursday 7:00pm", false, true);
    OtherScreenings venom = new OtherScreenings("Venom: the last dance", "Auditorium 5", "Sunday 3:00pm", true, true);
    OtherScreenings wildRobot= new OtherScreenings("The Wild Robot", "Auditorium 3", "Friday 6:00pm", false, false);
    ReturningScreenings interstaller = new ReturningScreenings("Interstaller", "Auditorium 2", "Tuesday 4:00pm",
            "December 14th");
    ReturningScreenings moana = new ReturningScreenings("Moana 2", "Auditorium 4", "Wedensday 1:00pm",
            "November 26th");
    ReturningScreenings despicableMe = new ReturningScreenings("Despicable Me 4", "Auditorium 7", "Saturday 9:00pm",
            "January 16th");
    
    //A function that genrartes an ID number for the booking
    public int generateBookingID(){ 
        numberOfBookings++;
        bookingID= numberOfBookings+100;
        return bookingID;
    }
    //Booking a ticket 
    public void bookTicket(){
        System.out.println("Welcome! What movie would you like to see?"
                + "\nPlease type in the number of the movie you would like to see:"
                + "\n1.Wicked \n2.Piece by Piece\n3.Venom: the last dance \n4.The Wild Robot "
                + "\n5.Interstaller \n6.Moana 2 \n7.Despicable Me 4\n  ");
        // Al methods used in the cases are called are from the Movie class
        while(true){
            System.out.print("I would like to see movie number: ");
            int chosenMovie= input.nextInt();
            if(chosenMovie>0 && chosenMovie<8){
                switch (chosenMovie){
                    case 1:
                        Movie.showMovieDetails(wicked);
                        wicked.assignedSeating(wicked.getMovieAuditorium());
                        wicked.availableSeats(wicked.getMovieAuditorium());
                        wicked.assigningSeats(wicked.getMovieAuditorium(), wicked);
                        this.movie = wicked;
                        break;
                    case 2:
                        Movie.showMovieDetails(pieceByPiece);
                        pieceByPiece.assignedSeating(pieceByPiece.getMovieAuditorium());
                        pieceByPiece.availableSeats(pieceByPiece.getMovieAuditorium());
                        pieceByPiece.assigningSeats(pieceByPiece.getMovieAuditorium(), pieceByPiece);
                        this.movie= pieceByPiece;
                        break;
                    case 3:
                        Movie.showMovieDetails(venom);
                        venom.assignedSeating(venom.getMovieAuditorium());
                        venom.availableSeats(venom.getMovieAuditorium());
                        venom.assigningSeats(venom.getMovieAuditorium(), venom);
                        this.movie= venom;
                        break;
                    case 4:
                        Movie.showMovieDetails(wildRobot);
                        wildRobot.assignedSeating(wildRobot.getMovieAuditorium());
                        wildRobot.availableSeats(wildRobot.getMovieAuditorium());
                        wildRobot.assigningSeats(wildRobot.getMovieAuditorium(), wildRobot);
                        this.movie= wildRobot;
                        break;
                    case 5:
                        Movie.showMovieDetails(interstaller);
                        interstaller.assignedSeating(interstaller.getMovieAuditorium());
                        interstaller.availableSeats(interstaller.getMovieAuditorium());
                        interstaller.assigningSeats(interstaller.getMovieAuditorium(), interstaller);
                        this.movie= interstaller;
                        break;
                    case 6:
                        Movie.showMovieDetails(moana);
                        moana.assignedSeating(moana.getMovieAuditorium());
                        moana.availableSeats(moana.getMovieAuditorium());
                        moana.assigningSeats(moana.getMovieAuditorium(), moana);
                        this.movie= moana;
                        break;
                    case 7:
                        Movie.showMovieDetails(despicableMe);
                        despicableMe.assignedSeating(despicableMe.getMovieAuditorium());
                        despicableMe.availableSeats(despicableMe.getMovieAuditorium());
                        despicableMe.assigningSeats(despicableMe.getMovieAuditorium(), despicableMe);
                        this.movie= despicableMe;
                        break; 
                    }
                break;  
            } else{
                System.out.println("Sorry, Invalid entry! try agaian.");
            }
        }
    }
    //Cancelling a booking of a ticket  
    public void cancelBooking(){
        System.out.println("Verfication! \nWhich movie did you book to see?"
                + " \n1.Wicked 2.Piece by Piece 3.Venom: the last dance 4.The Wild Robot 5.Interstaller 6.Moana 2 7.Despicable Me 4");
        int bookedMovie= input.nextInt();
        System.out.print("And on which row did you book? ");
        int bookedRow= input.nextInt();
        System.out.print("So, which coloum did you book on? ");
        int bookedColoum= input.nextInt();
        switch(bookedMovie){
            case 1:
               wicked.deAssigningSeats(wicked.getMovieAuditorium(), bookedRow, bookedColoum);
               break;
            case 2:
               pieceByPiece.deAssigningSeats(pieceByPiece.getMovieAuditorium(), bookedRow, bookedColoum);
               break;
            case 3: 
                venom.deAssigningSeats(venom.getMovieAuditorium(), bookedRow, bookedColoum);
                break;
            case 4:
                wildRobot.deAssigningSeats(wildRobot.getMovieAuditorium(), bookedRow, bookedColoum);
                break;
            case 5:
                interstaller.deAssigningSeats(interstaller.getMovieAuditorium(), bookedRow, bookedColoum);
                break;
            case 6:
                moana.deAssigningSeats(moana.getMovieAuditorium(), bookedRow, bookedColoum);
                break;
            case 7:
                despicableMe.deAssigningSeats(despicableMe.getMovieAuditorium(), bookedRow, bookedColoum);
                break;
            default:
                System.out.println("Sorry! invalid entry");
                
        }
        
    }
    //Changes the seats booked for a ticket 
    public void modifyTicket(){
        System.out.println("No problems here!");
        while(true){
            System.out.print("Verfication! \nWhich movie did you book to see?"
                    + " \n1.Wicked 2.Piece by Piece 3.Venom: the last dance 4.The Wild Robot 5.Interstaller 6.Moana 2 7.Despicable Me 4");
            int bookedMovie= input.nextInt();
            if(bookedMovie>0 && bookedMovie<8){
                System.out.print("And on which row did you book? ");
                int bookedRow= input.nextInt();
                System.out.print("So, which coloum did you book on? ");
                int bookedColoum= input.nextInt();
        
                switch (bookedMovie){
                    case 1:
                        wicked.deAssigningSeats(wicked.getMovieAuditorium(), bookedRow, bookedColoum);
                        wicked.assignedSeating(wicked.getMovieAuditorium());
                        System.out.print("Now the available seats are: ");
                        wicked.availableSeats(wicked.getMovieAuditorium());
                        wicked.assigningSeats(wicked.getMovieAuditorium(), wicked);
                        break;
                    case 2:
                        pieceByPiece.deAssigningSeats(pieceByPiece.getMovieAuditorium(), bookedRow, bookedColoum);
                        pieceByPiece.assignedSeating(pieceByPiece.getMovieAuditorium());
                        System.out.print("Now the available seats are: ");
                        pieceByPiece.availableSeats(pieceByPiece.getMovieAuditorium());
                        pieceByPiece.assigningSeats(pieceByPiece.getMovieAuditorium(), pieceByPiece);
                    break;
                    case 3: 
                        venom.deAssigningSeats(venom.getMovieAuditorium(), bookedRow, bookedColoum);
                        venom.assignedSeating(venom.getMovieAuditorium());
                        System.out.print("Now the available seats are: ");
                        venom.availableSeats(venom.getMovieAuditorium());
                        venom.assigningSeats(venom.getMovieAuditorium(), venom);
                    break;
                    case 4:
                        wildRobot.deAssigningSeats(wildRobot.getMovieAuditorium(), bookedRow, bookedColoum);
                        wildRobot.assignedSeating(wildRobot.getMovieAuditorium());
                        System.out.print("Now the available seats are: ");
                        wildRobot.availableSeats(wildRobot.getMovieAuditorium());
                        wildRobot.assigningSeats(wildRobot.getMovieAuditorium(), wildRobot);
                        break;
                    case 5:
                        interstaller.deAssigningSeats(interstaller.getMovieAuditorium(), bookedRow, bookedColoum);
                        interstaller.assignedSeating(interstaller.getMovieAuditorium());
                        System.out.print("Now the available seats are: ");
                        interstaller.availableSeats(interstaller.getMovieAuditorium());
                        interstaller.assigningSeats(interstaller.getMovieAuditorium(), interstaller);
                        break;
                    case 6:
                        moana.deAssigningSeats(moana.getMovieAuditorium(), bookedRow, bookedColoum);
                        moana.assignedSeating(moana.getMovieAuditorium());
                        System.out.print("Now the available seats are: ");
                        moana.availableSeats(moana.getMovieAuditorium());
                        moana.assigningSeats(moana.getMovieAuditorium(), moana);
                        break;
                    case 7:
                        despicableMe.deAssigningSeats(despicableMe.getMovieAuditorium(), bookedRow, bookedColoum);
                        despicableMe.assignedSeating(despicableMe.getMovieAuditorium());
                        System.out.print("Now the available seats are: ");
                        despicableMe.availableSeats(despicableMe.getMovieAuditorium());
                        despicableMe.assigningSeats(despicableMe.getMovieAuditorium(), despicableMe);
                        break;
                }
                break;
            }else{
                System.out.println("Sorry! invalid entry");
            }
        }
    }
    //Calcultes the price of a ticket based on the showing auditorium 
    public double calculatePrice(){
        int basePrice = 50;
        int auditoriumPrice;

        switch(movie.getMovieAuditorium()) {
            case "Auditorium 1":
                auditoriumPrice = 20;
                break;

            case "Auditorium 2":
                auditoriumPrice = 25;
                break;

            case "Auditorium 3":
                auditoriumPrice = 30;
                break;

            case "Auditorium 4":
                auditoriumPrice = 25;
                break;

            case "Auditorium 5":
                auditoriumPrice = 20;
                break;

            case "Auditorium 6":
                auditoriumPrice = 35;
                break;

            case "Auditorium 7":
                auditoriumPrice = 30;
                break;
            default:
                auditoriumPrice=0;
        }
        return basePrice+auditoriumPrice;

        
    }
    
}
