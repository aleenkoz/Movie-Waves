/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moviewaves;

/**
 *
 * @author Movie Waves developers
 */
public class ReturningScreenings extends Movie {
    private String returnDate;
    
    //Constructor 
    public ReturningScreenings (String movieName, String movieAuditorium, String movieShowTime, String returnDate){
        super(movieName, movieAuditorium, movieShowTime);
        this.returnDate= returnDate;
    }
    //Accessor 
    public String getReturnDate(){ return returnDate; }
    public void setReturnDate(String returnDate){ this.returnDate= returnDate; }
    
    //Shows movie deyals and information about returning date
    public void showMovieDetails(){
        showMovieDetails(this);
        System.out.println("Returning date: "+ returnDate);
    }
    
    //Indicating to the user what they are booking for
    @Override
    public void assigningSeats(String auditoriumName, Movie movie){
        System.out.println("...Assigning seats for a returning screening...");
        super.assigningSeats(auditoriumName, movie);
    }
}
