/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salestracker;

 /**
* Programmer: Jasleen Kaur <BR>
 * Program:    Worker.java<BR>
 * Date:       21 June 2020<BR>
 * @version 1.0 * @author jasleen Kaur
 */
public class Worker extends Employee {
	
	 public Worker(int EmployeeNo, String name, int hours, double pay) {
     super(EmployeeNo, name);
     hoursWorked = hours;

     hourlyPay= pay;
     }
    /* Instance variable for hours worked*/
	private int hoursWorked;
	/* Instance variable for hourly pay*/
	private double hourlyPay;
	/* Instance variable for pay*/
	private double pay;
	 
	/**
	 * This method is used to set the name of the employee
	 * @param name of the employee
	 * @return name of the employee
	 */
	 
	public String setWorkername(String name)
	{
		return name;
	}
	/**
	 * This method is used to set the number of the hours.
	 * @param hoursWorked hours worked by the employee.
	 * @return hoursWorked hours worked by the employee.
	 */
	public int setHours(int hoursWorked)
	{
		return this.hoursWorked=hoursWorked;
	}
	
	/**
	 * This method is used to return the hourly pay of the employee
	 * @param hourlyPay hourly pay of the employee
	 * @return hourlypay hourly pay of the employee
	 */
	
	public double hourlyPay(double hourlyPay)
	{
		return this.hourlyPay=hourlyPay;
	}
	
	/**
	 * This method is used to return Pay.
	 * @return pay of the employee. 
	 */
	public double Pay()
	{
		calculatePay();
		return pay;
	}

	/**
	 * This method is used to calculate the pay of the employee based on hoursWorked and hourlyPay.
	 * @return pay of the employee.
	 */
	private double calculatePay()
	{
		return pay=hoursWorked*hourlyPay;
	}
	/**
	 * This to String method to return the String representation of the details.
	 */
	 @Override
	public String toString() 
	 {
		 super.toString();
		 String toReturn= super.toString() +"Hours worked: "+hoursWorked+"\nHourly Rate: $"+String.format("%.2f", hourlyPay) +"\nPay: $"+String.format("%.2f", Pay());
		return toReturn;
	}

	 
}
