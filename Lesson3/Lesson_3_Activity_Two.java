/*
 * Lesson 3 Coding Activity Question 2
 * 
 * Write a program that asks the user for three names, then prints the names in reverse order.
 * 
 * Sample Run:

Please enter three names:
Zoey 
Zeb 
Zena 

Zena Zeb Zoey

*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_3_Activity_Two {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Give me one name.");
        String nameOne = scan.nextLine();

        String nameTwo = scan.nextLine();     

        String nameThree = scan.nextLine();   
        
        System.out.println(nameOne + " " + nameTwo + " " + nameThree); 
        /* Write your code here 
         * Copy and paste your entire code to Code Runner to complete the activity, 
         * from the first import statement to the last bracket. 
        */


    }
}