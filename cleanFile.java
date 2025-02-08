/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Ntokozo
 */
public class cleanFile 
{
    public void clean() throws IOException
    {
        try
        {
            Scanner scFile = new Scanner(new File("data1.txt"));
            int count = 0;
            
            while(scFile.hasNext())
            {
                String line = scFile.nextLine();
                Scanner scLine = new Scanner(line);
                
                String fLine = scLine.next();
                
                String specialCharacters = "!#$%&'()*+,-./:;<=>?@[]^_`{|}~0123456789";
                String str2[]=fLine.split("");
                
                for(int i=0;i<str2.length;i++)
                {
                    if(!(specialCharacters.contains(str2[i])))
                    {
                        File myFile = new File("data2.txt");
                        FileWriter myWriter = new FileWriter(myFile);
                        myWriter.write(fLine.charAt(count));
                        myWriter.close();
                        
                        //System.out.println(fLine.charAt(count));
                        count++;
                    }
                    i++;
                }
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found - check path");
        }
    }
}
