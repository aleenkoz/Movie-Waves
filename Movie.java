/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moviewaves;

/**
 *
 * @author Movie Waves Developers
 */
import java.util.HashMap; 
import java.util.Map;
import java.util.Scanner;
public class Movie {
    private String movieName;
    private String movieShowTime;
    private String movieAuditorium;
    private Map<String, int[][]> auditoriums = new HashMap<>();
    
    Scanner input= new Scanner(System.in);
    //Constructor: parametrized
    public Movie(String movieName, String movieAuditorium, String movieShowTime){
        this.movieName= movieName;
        this.movieAuditorium= movieAuditorium;
        this.movieShowTime= movieShowTime;
        
        // assigning a 2D array for each auditorium
        auditoriums.put("Auditorium 1", new int[5][4]);
        auditoriums.put("Auditorium 2", new int[5][4]);
        auditoriums.put("Auditorium 3", new int[5][4]);
        auditoriums.put("Auditorium 4", new int[5][4]);
        auditoriums.put("Auditorium 5", new int[5][4]);
        auditoriums.put("Auditorium 6", new int[5][4]);
        auditoriums.put("Auditorium 7", new int[5][4]);
    }
    //defualt conatructor
    public Movie(){
        
    }
    //Returns movie details in a print statement
    public static void showMovieDetails(Movie movie){
        System.out.println("You want to watch "+ movie.getMovieName()+"! good choice!"
        + "\n the movie will be showing in "+ movie.getMovieAuditorium()+" on "+movie.getMovieShowTime()+"\n");    
    }
    //Accesors and mutators
    public void setMovieName(String movieName){this.movieName= movieName;}
    public void setMovieShowTime(String movieShowTime){this.movieShowTime= movieShowTime;}
    public void setMovieAuditorium(String movieAuditorium){this.movieAuditorium= movieAuditorium;}
    
    public String getMovieName(){return movieName;}
    public String getMovieShowTime(){return movieShowTime;}
    public String getMovieAuditorium(){return movieAuditorium;}
    
    public void assignedSeating (String auditoriumName){
        int[][]seating= auditoriums.get(auditoriumName);
        int availableSeats=0;
        for(int i=0; i<5; i++){
            for(int j=0; j<4; j++){
                if(seating[i][j]==0){
                    availableSeats+=1;
                }
            }
        }
        System.out.print("The Auditorium has "+ availableSeats+ " available seats. \n");
    }
    //returns the number of available seats 
    public void availableSeats(String auditoriumName){
        int[][]seating= auditoriums.get(auditoriumName);
        for(int i=0; i<5; i++){
            for(int j=0; j<4; j++){
                if(seating[i][j]==0){
                   System.out.println("on row "+(i+1)+" seat nrmber "+(j+1));
                }
            }
        }
    }
    //returns all the placemnets of the avialble seats
    public void assigningSeats(String auditoriumName, Movie movie){
        int[][]seating= auditoriums.get(auditoriumName);
        int row, colomn;
        while(true){
           System.out.println("Please enter the row you'd prefer to choose (1-5): ");
           row= input.nextInt();
           System.out.println("Please enter the coloumn that you'd like to choose from row "+row+" (1-4): ");
           colomn= input.nextInt();
           if(row>0 && row<=seating.length && colomn>0 && colomn<=seating[0].length){
               row= row-1;
               colomn= colomn-1;
               seating[row][colomn]=1;
               System.out.println("You have booked a seat on row "+(row+1)+" on colomn "+(colomn+1)+" succesfully! "
               +"\nSee you at "+movie.getMovieName());
               break;
           }
           else{
               System.out.println("Sorry! invalid entry");
           }
           
        }
    }
    //revrse the process of booking a seat 
    public void deAssigningSeats(String auditoriumName, int row, int colomn){
        int[][]seating= auditoriums.get(auditoriumName);
        while(true){
            if(row<0 || row> seating.length || colomn<0 || colomn> seating[0].length){
                System.out.println("Sorry! inavlid entry!");
                
            }
            else{
                seating[row][colomn]=0;
                System.out.println("We are sorry to know that! \nYou're booking has been canceled.");
                break;
            }
        }
  
    }
   
}
    