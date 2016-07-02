import java.util.*;

public class Kart implements Operational
{
    private String model;
    private String color;
    private String size;
    private int lastServiceYear;
    
    public Kart()
    {
        this.model = "";
        this.color = "";
        this.size = "";
        this.lastServiceYear = 1980;
    }
    
    public Kart(String m, String c, String s, int lSY)
    {
        this.model = m;
        this.color = c;
        this.size = s;
        this.lastServiceYear = lSY;
    }
    
    public String getModel()
    {
        return this.model;
    }
    
    public String getColor()
    {
        return this.color;
    }
    
    public String getSize()
    {
        return this.size;
    }
    
    public int getLastServiceYear()
    {
        return this.lastServiceYear;
    }
    
    public void setModel(String m)
    {
        this.model = m;
    }
    
    public void setColor(String c)
    {
        this.color = c;
    }
    
    public void setSize(String s)
    {
        this.size = s;
    }
    
    public void setLastServiceYear(int l)
    {
        this.lastServiceYear = l;
    }
 
    public boolean serviced()
    {
        Calendar today = Calendar.getInstance();
        int year = today.get(Calendar.YEAR);
        
        if((year - lastServiceYear) > 3)
        {
            return false;
        }
        return true;
    }
    
    
    public String toString()
    {
        return this.size + " " + this.color + " "  + this.model;
    }
}
