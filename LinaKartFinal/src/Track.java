import java.util.*;

public class Track implements Operational
{
    private String trackName;
    private double distance;
    private int lastServiceYear;
    
    public Track()
    {
        this.trackName = "Basic";
        this.distance = 1;
        this.lastServiceYear = 1980;
    }
    
    public Track(String tN, double dis, int lSY)
    {
        this.trackName = tN;
        this.distance = dis;
        this.lastServiceYear = lSY;
    }
    
    public String getTrackName()
    {
        return this.trackName;
    }
    
    public int getLastServiceYear()
    {
        return this.lastServiceYear;
    }
    
    public double getDistance()
    {
        return this.distance;
    }
    
    public void setTrackName(String t)
    {
        this.trackName = t;
    }
 
    public void setDistance(double d)
    {
        this.distance = d;
    }
    
    public void setLastServiceYear(int l)
    {
        this.lastServiceYear = l;
    }
 
    
    public boolean serviced()
    {
        Calendar today = Calendar.getInstance();
        int year = today.get(Calendar.YEAR);
        
        if((year - lastServiceYear) > 5)
        {
            return false;
        }
        return true;
    }
    
    public String toString()
    {
        return "Track Name: " + trackName + " Distance: " + distance + " meters";
        
    }
    
}
