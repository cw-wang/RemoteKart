// Needs brief description for this class.
import java.util.*;

public class Run
{
    
    private Character character;
    private Kart kart;
    private Track track;
    private double timeSeconds;
    
    public Run()
    {
        this.character = new Character();
        this.kart = new Kart();
        this.track = new Track();
        this.timeSeconds = 0;
    }
    
    public Run(Character c, Kart k, Track t, double tS)
    {
        this.character = c;
        this.kart = k;
        this.track = t;
        this.timeSeconds = tS;
    }
    
    public Character getCharacter()
    {
        return this.character;
    }
    
    public Kart getKart()
    {
        return this.kart;
    }
    
    public Track getTrack()
    {
        return this.track;
    }
    
    public double getTimeSeconds()
    {
        return this.timeSeconds;
    }
    
    public void setCharacter(Character c)
    {
        this.character = c;
    }
    
    public void setKart(Kart k)
    {
        this.kart = k;
    }
    
    public void setTrack(Track t)
    {
        this.track = t;
    }
    
    public void setTimeSeconds(double tS)
    {
        this.timeSeconds = tS;
    }
    
    public double calcSpeed() //method
    {
        if(timeSeconds == 0)
        {
            return -1;
        }
        
        double speed = this.track.getDistance() / this.timeSeconds;
        return speed;
    }
    
    public String toString()
    {
        return this.getCharacter().getName() + " finished the race in " + this.getKart().getModel() + " on " + this.getTrack().getTrackName() + " in " +  this.timeSeconds + " seconds!";
    }
    
}
