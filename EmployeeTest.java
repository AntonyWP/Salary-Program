/*********************************************************************
 *                                                                   *
 *  CSCI 470               Assignment 2           Fall 2018          *
 *                                                                   *
 *  Developer(s):   Antony Pierson                                   *
 *                                                                   *
 *  Section:        1                                                *
 *                                                                   *
 *  Due Date/Time:  9/14/18 11:59p.m.                                *
 *                                                                   *
 *  Purpose:        A java program for a class called Employee that  *
 *                  a employer might use to represent an employee    *
 *                  yearly pay and year pay after 10% raise          *
 ********************************************************************/

import java.util.Scanner;                                // import the Scanner class to read input data

public class EmployeeTest
{
  public static void main(String[] args)
  {
    String fname;                                        // used to hold first name
    String lname;                                        // used to hole last name
    double monthly;                                      // used to hold monthly salary
    
    Scanner keyScan = new Scanner(System.in);            // scanner to gets keyboard input from user.
    Employee myEmployee = new Employee(" ", " ", 0.0);    // initialize scanner object
    
    System.out.print("Enter first name: ");              // print statment to prompt user input
    fname = keyScan.nextLine();                          // Use method nextLine to read an input first name
    myEmployee.setFname(fname);                          // set first name
    
    System.out.print("Enter last name: ");               // print statment to prompt user input
    lname = keyScan.nextLine();                          // Use method nextLine to read an input last name
    myEmployee.setLname(lname);                          // set last name
    
    System.out.print("Enter monthly salary: ");          // print statment to prompt user input
    monthly = keyScan.nextDouble();                      // Use method nextLine to read an input monthly salary
    myEmployee.setMonthly(monthly);                      // set monthly salary
    
    myEmployee.displayMessage();                         // call displayMessage to display employee information
    
    keyScan.close();                                     // close the scanner
  }
} 