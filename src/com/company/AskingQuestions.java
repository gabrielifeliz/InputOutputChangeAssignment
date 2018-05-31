package com.company;

import java.util.Scanner;

public class AskingQuestions
{
    public static void main( String[] args )
    {   // To make the program find the average of two double values, I added lines 11 and 12
        Scanner keyboard = new Scanner(System.in);

        double num1, num2, num3; // Line 11. I changed datatype from int to double

        System.out.print( "First temperature? " );
        num1 = keyboard.nextDouble(); // Changed method to nextDouble()

        System.out.print( "Second temperature? " );
        num2 = keyboard.nextDouble(); // Changed method to nextDouble()

        // To find the average of two double values, I used num3 to calculate and hold the average value
        num3 = (num1 + num2) / 2;

        System.out.println("The average of the two temperatures is : " + num3);
    }
}