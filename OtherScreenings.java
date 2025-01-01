/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moviewaves;

/**
 *
 * @author Movie Waves Developers
 */
public class OtherScreenings extends Movie {
    private boolean is3D;
    private boolean isVIP;
    
    //Constructor
    public OtherScreenings(String movieName, String movieAuditorium, String movieShowTime,
            boolean is3D, boolean isVip){
        super(movieName, movieAuditorium, movieShowTime);
        this.is3D= is3D;
        this.isVIP= isVip;
    }
    //Accessors and mutators
    public boolean getIs3D(){return is3D;}
    public void setIs3D(boolean is3D){this.is3D= is3D;}
    public boolean getIsVIP(){return isVIP;}
    public void setIsVIP(boolean isVIP){this.isVIP=isVIP;}
    
    //Shows movie detials and if the movie is VIP or 3D or both
    public void showMovieDetails(){
        showMovieDetails(this);
        if(is3D){
            System.out.println("This is a 3D screening.");
        }
        if(isVIP){
            System.out.println("This is a VIP screening");
        }
    }
    
    //Indicates to the user that they are signing up for a special screening
    @Override
    public void assigningSeats(String auditouriumName, Movie movie){
        System.out.println("...Assigning seats for a special screening...");
        super.assigningSeats(auditouriumName, movie);
    }
}
