/*
 * Lesson 3 Coding Activity Question 1
 * 
 * Write the code to ask the user to enter their name and print the following message:

Hi ______, nice to see you.
 
 * Remember, you'll need to use the method println and Scanner class method nextLine.
*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_3_Activity_One {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("What is your name"); 
        String name = scan.nextLine(); 
        System.out.println("Hi " + name + ", nice to see you."); 
        /* Write your code here 
         * Copy and paste your entire code to Code Runner to complete the activity, 
         * from the first import statement to the last bracket. 
        */


    }
}