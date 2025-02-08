/*
 * Creating a prgram that can calculate the radius of a circle,
 * based on user input
 */

import java.util.*;

 public class CalculateRadius {
    public static void main(String[] args){
        // Create a scanner object
        Scanner r_input = new Scanner(System.in);

        // Create variables
        double radius;
        double area;

        // Ask the user for the radius
        System.out.println("Enter the radius of your circle!");
        System.out.print("Please enter radius in 0.00 format: ");
        
        radius = r_input.nextDouble();

        // Calculate the area of the circle with the user input
        area = Math.PI * Math.pow(radius, 2);

        // Print the area
        System.out.println("The area of your circle is: " + String.format("%.2f", area));
    
    r_input.close();
    }
 }