package com.joshua;

/**
 * This
 *
 */
import java.io.IOException;
import java.io.bufferedReader;
import java.io.*;
import java.io.InputStreamReader;
public class App 
{
    public static void main( String[] args )
    {
        // This application calculates the volume of a cube.
         int length = 0;
         int width = 0;
         int height = 0;

         try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             System.out.println("Please enter the length of the cube.");
             length = Integer.parseInt(br.readLine());

             System.out.println("Please enter the width of the cube.");
            width = Integer.parseInt(br.readLine());

            System.out.println("Please enter the height of the cube.");
            height = Integer.parseInt(br.readLine());

         }
         catch(NumberFormatException ne)
         {
             System.out.println("This value is invalid." + ne);
             System.exit(0);
         }
         catch(IOException ioe)
         {
            System.out.println("input/output error" + ioe);
            System.exit(0);
         }
         int volume = length * width * height;
         System.out.println("The volume of the cube is " + volume);

    }
}
