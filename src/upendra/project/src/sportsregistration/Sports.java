package sportsregistration;

import java.time.*;
import java.util.*;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.text.ParseException;

public abstract class Sports
{
    private ArrayList<Court> courtList=new ArrayList<Court>();
    private int usageFee;
    private int insurance;
    private int slotTime;
    private String sportName;
    private int timeDuration;
    
    public Sports()
    {
        
    }
    
   /**
     * parameterized constructor for the class sport
     * @param sports data of string type and duration of int datatype
     */
    public Sports(String data, int duration) throws IOException, FileNotFoundException
    {           
       try
       {
        
        String[] list = data.split(",");
        sportName=list[0].trim();
        usageFee=Integer.parseInt(list[1].trim());
        insurance=(Integer.parseInt(list[2].trim()));
        Court courtobj;
        for(int i=3;i<list.length;i++)
        {
        courtList.add(new Court(Integer.parseInt(list[i].trim())));
        }
        timeDuration=duration;
    }
    catch(Exception E)
    {
        System.out.println("Exception Caught:"+ E);
    }
        
    }
    
    
    //abstarct Method we implement same in both the child classes
    public abstract boolean timeCheck(int timeCheck);
    
        /**
         * accessor for getusageFee variable
         *
         * @return usageFee in int format
         */
       public int getUsageFee()
        {
            return usageFee;
        }
        
        /**
         * mutator for setusageFee variable
         *
         * @param usageFee  provided in int format
         */
        public void setUsageFee(int usageFee)
        {
             this.usageFee=usageFee;
        }
        
        /**
         * accessor for getinsurance variable
         *
         * @return insurance in int format
         */
       public int getInsurance()
        {
            return insurance;
        }
        
        /**
         * mutator for setinsurance variable
         *
         * @param insurance  provided in int format
         */
        public void setInsurance(int insurance)
        {
             this.insurance=insurance;
        }
        
         /**
         * accessor for getslotTime variable
         *
         * @return slotTime in int format
         */
       public int getSlotTime()
        {
            return slotTime;
        }
        
        /**
         * mutator for setslotTime variable
         *
         * @param slotTime  provided in int format
         */
        public void setSlotTime(int slotTime)
        {
             this.slotTime=slotTime;
        }
        
       /**
         * accessor for generating court list
         */
        public ArrayList<Court> getCourtList()
        {
            return courtList;
        }
    
        /**
         * mutator to access courtList list
         *
         * @param courtList user provided data for courtList list
         */
        public void setCourtList(ArrayList<Court> courtList)
        {
            for(Court c : courtList )
        {
            this.courtList.add(c);         
        } 
        }
        
        /**
         * accesssor to getSportName
         *
         */
        
        public String getSportName()
        {
            return sportName;
        }
        
        /**
         * mutator to access set Sport Name
         *
         * @param set Sport Name user provided data for Sport Name
         */
        
        public void setSportName(String sportName)
        {
            this.sportName = sportName;
        }
        
        /**
         * this function gives the available courts based on the date, local time and duration
         * @param localdate,localTime,duration
         * @return court of arrayList
         **/   
        public ArrayList<Court> getAvailableCourts(LocalDate date, LocalTime time, int duration)
        {
            ArrayList<Court> courtsList=new ArrayList<Court>();    
        
            for(Court courtObj : courtList)
            {       
                if(courtObj.availabilityStatus(date, time, duration))
                        {
                            
                            courtsList.add(courtObj);                            
                                
                        }
            
             }
                    
            return courtsList;       
        }
    
       
        
   
    
     
    public String toString()
    {
        return "Sport{" +
                "Usage Fee='" + usageFee + '\'' +
                ", Insurance='" + insurance + '\'' +
                ", Courts List='" + courtList.toString() +
                '}';

    }
}