/*
 * AIM:- Write a program to calculate percentage of a given 
 * student in cbse board exam his marks from 5 subject must 
 * be taken as input from the keyboard (marks are out of 100)
 */
import java.util.Scanner;
public class CalculatePercentage {
    

// public class CBSEPercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of subject1: ");
        int subject1 = sc.nextInt();
        System.out.println("Enter the marks of subject2: ");
        int subject2 = sc.nextInt();
        System.out.println("Enter the marks of subject3: ");
        int subject3 = sc.nextInt();
        System.out.println("Enter the marks of subject4: ");
        int subject4 = sc.nextInt();
        System.out.println("Enter the marks of subject5: ");
        int subject5 = sc.nextInt();

        int Total_Marks = subject1 + subject2 + subject3 + subject4 + subject5;
        double Percentage = (Total_Marks / 500.0)*100;
        System.out.println("Percentage of subject1 is: " + Percentage + "%");

        sc.close();
    }
}


