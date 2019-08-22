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
 *  Purpose:        A java program for a class called Invoice that a *
 *                  store might use to represent an invoice for an   *
 *                  item sold at the store.                          *
 ********************************************************************/

public class Employee
{
  private String fname;
  private String lname;
  private double monthly;
  private double yearly;
  private double newYearly;
  
  // Constructor that initializes the three instance variables
  public Employee(String first, String last, double pay)
  {
    fname = first;
    lname = last;
    monthly = pay;
  }
  
   // first name set method
  public void setFname(String first)
  {
   fname = first;
  }
  
  // first name get method
  public String getFname()
  {
    return fname;
  }
  
    // last name set method
  public void setLname(String last)
  {
   lname = last;
  }
  
  // last name get method
  public String getLname()
  {
    return lname;
  }
  
  // checks if monthly salary is a positive if so set its value
     public void setMonthly(double pay)
   {
     if(pay >= 0)  
      monthly = pay;
   }
 
  // monthly salary get method
  public double getMonthly()
  {
    return monthly;
  }
  
  // Invoice amount method
  public Double getYearly()
  {  
     yearly = monthly * 12;
     return yearly;
  }
  
  // Invoice amount method
  public Double getNewYearly()
  {  
     newYearly = ((monthly * .10) + monthly) * 12;
     return newYearly;
  }
    
  public void displayMessage()
  {
     System.out.printf("\nEmployee name is %s %s\n", getFname(), getLname());
     System.out.printf("\nEmployee monthly salary is $%3.2f\n", getMonthly());
     System.out.printf("\nEmployee yearly salary is $%3.2f\n", getYearly());
     System.out.printf("\nEmployee new yearly salary after 10 percent raise is $%6.2f\n", getNewYearly());
  }
} 
  