import java.util.*;

public class Character
{
    private int minAge;
    private int maxAge;
    private String name;
    private String sex;
    
    public Character()
    {
        this.minAge = 0;
        this.maxAge = 0;
        this.name = "";
        this.sex = "";
    }
    
    public Character(int minA, int maxA, String n, String s)
    {
        this.minAge = minA;
        this.maxAge = maxA;
        this.name = n;
        this.sex = s;
    }
    
    public int getMinAge()
    {
        return this.minAge;
    }
    
    public int getMaxAge()
    {
        return this.maxAge;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getSex()
    {
        return this.sex;
    }
    
    public void setMinAge(int a)
    {
        this.minAge = a;
    }
    
    public void setMaxAge(int a)
    {
        this.maxAge = a;
    }
    
    public void setName(String n)
    {
        this.name = n;
    }
    
    public void setSex(String s)
    {
        this.sex = s;
    }
    
    public boolean playerChoseMe(int age, String sex)//method
    {
        if(age >= minAge && age <= maxAge && sex.equals(this.sex))
        {
            return true;
        }
        else
        {    
            return false;
        }
    }
    
    
    
}
