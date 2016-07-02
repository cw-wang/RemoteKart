import java.util.*;

public class GameDriver
{
    public static void main(String[] args)
    {
        //
        //initialization
        //
        Character[] myChars = new Character[4];
        myChars[0] = new Character(-1000, 17, "Baby Peach", "F");
        myChars[1] = new Character(18, 1000, "Peach", "F");
        myChars[2] = new Character(-1000, 17, "Baby Mario", "M");
        myChars[3] = new Character(18, 1000, "Mario", "M");
        
        Kart[] myKarts = new Kart[6];
        myKarts[0] = new Kart("Baby Carriage", "red", "small", 2015);
        myKarts[1] = new Kart("Nitrocycle", "yellow", "small", 2015);
        myKarts[2] = new Kart("Dolphin Dasher", "blue", "large", 2014);
        myKarts[3] = new Kart("Phantom", "pink", "large", 2016);
        myKarts[4] = new Kart("Wild Wing", "black", "large", 2014);
        myKarts[5] = new Kart("Poop Car", "brown", "large", 2000);
        
        Track[] myTracks = new Track[4];
        myTracks[0] = new Track("Mushroom Gorge", 100, 2013);
        myTracks[1] = new Track("Bowser Castle", 200, 2014);
        myTracks[2] = new Track("Dino Dino Jungle", 300, 2015);
        myTracks[3] = new Track("Poop Track", 300, 2000);
        
        ArrayList<Run> myRuns = new ArrayList<Run>();
        
        Character chosenChar;
        Kart chosenKart;
        Track chosenTrack;
        Run thisRun;
        int age;
        String gender;
        int kartNum;
        int trackNum;
        Game thisGame;
        
        // Sort myKarts by Model 
        Kart kartHolder;
        // String strHolder;
        // int numHolder;
        int lastItem = myKarts.length -1;
        while(lastItem > 0)
        {
        	for(int i = 0; i < lastItem; i ++)
        	{
        		if(myKarts[i].getModel().compareTo(myKarts[i+1].getModel()) > 0)
        		{
        			kartHolder = myKarts[i];
        			myKarts[i] = myKarts[i+1];
        			myKarts[i+1] = kartHolder;
        					
        			/*
        			strHolder = myKarts[i].getModel();
        			myKarts[i].setModel(myKarts[i+1].getModel());
        			myKarts[i+1].setModel(strHolder);
        			
        			strHolder = myKarts[i].getSize();
        			myKarts[i].setSize(myKarts[i+1].getSize());
        			myKarts[i+1].setSize(strHolder);
        			
        			strHolder = myKarts[i].getColor();
        			myKarts[i].setColor(myKarts[i+1].getColor());
        			myKarts[i+1].setColor(strHolder);
        			
        			numHolder = myKarts[i].getLastServiceYear();
        			myKarts[i].setLastServiceYear(myKarts[i+1].getLastServiceYear());
        			myKarts[i+1].setLastServiceYear(numHolder);
        			 */
        		}
        	}
        	lastItem --;
        }
        
        Scanner s = new Scanner(System.in); //use JScanner for user input
        
        String keepGoing = "y";
        
        while(keepGoing.toLowerCase().equals("y"))
        {
        
        
            //
            //choose a character
            //
            System.out.println("Welcome!");
            System.out.print("Please enter your age [1-100]: ");
            age = s.nextInt();
            
            
            do {
                System.out.print("\nPlease enter your gender [F/M]: ");
                gender = s.next().toUpperCase();
            } while (!(gender.equals("F") || gender.equals("M")));
            
            chosenChar = myChars[0];
            for(int i = 0; i < myChars.length; i++)
            {
                if(myChars[i].playerChoseMe(age, gender))
                {
                    chosenChar = myChars[i];
                    break;
                }
            }
            
            if(age >= 18)
            {
                Adult a = new Adult(chosenChar.getMinAge(), chosenChar.getMaxAge(), chosenChar.getName(), chosenChar.getSex());
            
                System.out.println("\n" + a.toString() + "\n");
            }
            else
            {
                Minor m = new Minor(chosenChar.getMinAge(), chosenChar.getMaxAge(), chosenChar.getName(), chosenChar.getSex());
            
                System.out.println("\n" + m.toString() + "\n");
            }
            //
            //choose a kart
            //
            
            for(int i = 0; i < myKarts.length; i++)
            {
                if(myKarts[i].serviced())
                {
                    System.out.println(i + ": " + myKarts[i].toString());
                }
            }
            
            System.out.print("Pick kart number: ");
            kartNum = s.nextInt();
            
            if(kartNum < 0) //if-then-else statement
            {
                System.out.println("INVALID NUMBER!!! You are assigned " + myKarts[0].toString());
                kartNum = 0;
            }
            else if(kartNum >= myKarts.length)
            {
                System.out.println("INVALID NUMBER!!! You are assigned " + myKarts[myKarts.length - 1].toString());
                kartNum = myKarts.length -1;
            }
            
            chosenKart = myKarts[kartNum];
            
            
            System.out.println();
            
            //
            //choose a track
            //
            
            for(int i = 0; i < myTracks.length; i++)
            {
                if(myTracks[i].serviced())
                {
                    System.out.println(i + ": " + myTracks[i].toString());
                }
            }
            
            System.out.print("Pick track number: ");
            trackNum = s.nextInt();
            
            if(trackNum < 0) //if-then-else statement
            {
                System.out.println("INVALID NUMBER!!! You are assigned " + myTracks[0].toString());
                trackNum = 0;
            }
            else if(trackNum >= myTracks.length)
            {
                System.out.println("INVALID NUMBER!!! You are assigned " + myTracks[myTracks.length - 1].toString());
                trackNum = myTracks.length - 1;
            }
            
            chosenTrack = myTracks[trackNum];
            
            System.out.println();
            
            //
            //Start a run
            //
            
            thisRun = new Run(chosenChar, chosenKart, chosenTrack, Math.random()*50);
            myRuns.add(thisRun);
            
            System.out.println("\n" + thisRun.toString());
            
            System.out.print("\nWould you like to race again [y/n]? ");
            keepGoing = s.next();
        
        }
        
        thisGame = new Game(myRuns);
        
        System.out.println("\nSummary:");
        
        System.out.println("\nNumber of races played: " + thisGame.numRunsPlayed() + "\n");
        
        for(int i = 0; i < myTracks.length; i++)
        {
            System.out.format("Track: %s \tAverage Speed: %.2f m/s\n", myTracks[i].getTrackName(), thisGame.avgSpeedByTrack(myTracks[i].getTrackName()));
        }
        
        System.out.println();
        
        for(int i = 0; i < myTracks.length; i++)
        {
            System.out.format("Track: %s \tFastest run: %s\n", myTracks[i].getTrackName(), thisGame.fastestByTrack(myTracks[i].getTrackName()).toString());
        }
    }
}