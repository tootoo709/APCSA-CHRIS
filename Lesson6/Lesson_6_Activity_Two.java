/*
 * Lesson 6 Coding Activity Question 2
 *
 * Input a double value and print only the integer part.
 *
 * Sample run:
 
Please input a decimal number:
57.8934
Answer: 57

*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_6_Activity_Two 
{
    public static void main(String args[]) 
    {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Please enter ratings from the movie review website. " ); 
        double websiteOne = scan.nextDouble();
        double websiteTwo = scan.nextDouble();
        double websiteThree = scan.nextDouble();
        
        System.out.println("Please enter ratings from the focus group. " );
        double focusOne = scan.nextDouble();
        double focusTwo = scan.nextDouble();

        System.out.println("Please enter the average movie critic rating. " );
        double criticOne = scan.nextDouble();
        
        double averageWebsite = (((websiteOne + websiteTwo + websiteThree)/3));
        double averageFocus = ((((double)focusOne + (double)focusTwo)/2));
        double averageCritic = criticOne;  
        
        System.out.println("Average website rating: " + averageWebsite);
        System.out.println("Average focus group rating: " + averageFocus);
        System.out.println("Average movie critic rating: " + averageCritic);       
        double weightedWebsite = (0.2 * averageWebsite) ;
        double weightedFocus = (0.3 * averageFocus) ;       
        double weightedCritic = (0.5 * averageCritic) ;
        double weightedAverage = (weightedWebsite + weightedFocus + weightedCritic); 

        
        
        
    


    }
}