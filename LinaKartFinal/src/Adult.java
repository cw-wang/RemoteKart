public class Adult extends Character
{
    public Adult(int minA, int maxA, String n, String s)
    {
        super( minA,  maxA,  n,  s);
    }
    
    public String toString()
    {
        
        return "Hi! My name is " + this.getName() + " and I'll be racing for you. Thanks for choosing me!";
    }
}