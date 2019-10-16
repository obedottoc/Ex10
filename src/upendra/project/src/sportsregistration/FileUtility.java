package sportsregistration;

import java.util.*;
import java.io.*;
public class FileUtility
{
    public FileUtility()
    {
    }

    /**
     * Reads data from file returning the lines as a list, or null if error
     * 
     */
    public static ArrayList<String> readFromFile(String fileName) throws IOException
    {
       ArrayList<String> fileData = new ArrayList<>();
       //File filePath = new File("F:/SwinBurne_Sem2/OOPS/Proj2/PageLoadingEffects/Project2_Start_Up_Code/"+fileName);
        BufferedReader sc = new BufferedReader(new FileReader(fileName));

        String value = sc.readLine();
        while (value != null) {
            fileData.add(value);
            value = sc.readLine();
        }
        sc.close();
        return fileData;

    }
    
    /**
     * Write data to file 
     * 
     */
    public static void writeToFile(ArrayList<String> data,String fileName ) throws IOException
    {
        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName, true))) {
            for (String s : data) {
                pw.println(s);
            }
        } catch (IOException e) {
            System.out.println("Error in write File:" + e);
        }
    }
    
}
