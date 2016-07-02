import java.util.*;

public class Game
{
    private ArrayList<Run> runs;
    
    public Game()
    {
        runs = new ArrayList<Run>();
    }
    
    public Game(ArrayList<Run> r)
    {
        runs = r;
    }
    
    public ArrayList<Run> getRuns()
    {
        return this.runs;
    }
    
    public void setRuns(ArrayList<Run> r)
    {
        this.runs = r;
    }
    
    public int numberOfRuns()
    {
        return this.runs.size();
    }
    
    public double avgSpeedByTrack(String trackName)//method
    {
        double sumTime = 0;
        int count = 0;
        for(Run r : runs)
        {
            if(r.getTrack().getTrackName().equals(trackName) && r.calcSpeed() != -1) //logical operator
            {
                sumTime += r.calcSpeed();
                count++;
            }
        }
        
        if(count == 0)
        {
            return -1;
        }
        
        return sumTime/count;
    }
    
    public int numRunsPlayed() //method
    {
        return runs.size();
    }
    
    public Run fastestByTrack(String trackName)//method
    {
        Run shortestTime = runs.get(0);
        for(Run r : runs)
        {
            if(r.getTrack().getTrackName().equals(trackName) && r.calcSpeed() != -1) //logical operator
            {
                if(shortestTime.getTimeSeconds() > r.getTimeSeconds());
                {
                    shortestTime = r;
                }
            }
        }
        
        return shortestTime;
    }
}