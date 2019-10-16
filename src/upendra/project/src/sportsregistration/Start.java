package sportsregistration;

import java.io.IOException;
import java.io.FileNotFoundException;
public class Start
{


    public static void main(String[] args)
    {
        Club sportsClub = new Club("Sports Club");
        UserInterface consoleApp = new UserInterface(sportsClub);
        try
        {
          sportsClub.fileReadSports();//read the Sports.txt

          sportsClub.readBookings(sportsClub);//read bookings.txt
        }
        catch(IOException e)
        {
          e.printStackTrace();
        }
        consoleApp.run();
        try 
        {
            FileUtility.writeToFile(sportsClub.fileWriteBookings(),"Bookings.txt");//write the bookings.txt
        }
        catch(IOException e) 
        {
            e.printStackTrace();
        }
    }


}