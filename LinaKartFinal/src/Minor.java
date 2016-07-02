public class Minor extends Character
{
    public Minor(int minA, int maxA, String n, String s)
    {
        super( minA,  maxA,  n,  s);
    }
    
    public String toString()
    {
        
        return "Hi! My name is " + this.getName() + " and this is my first time racing, I'm excited to race for you. Thanks for choosing me!";
    }
}