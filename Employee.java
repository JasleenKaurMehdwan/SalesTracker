/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salestracker;

 /**
* Programmer: Jasleen Kaur <BR>
 * Program:    Employee.java<BR>
 * Date:       21 June 2020<BR>
 * @version 1.0 * @author jasleen Kaur
 */
public class Employee {
	
	/*Instance variable for employee number*/
	private int employeeNumber;
	/*Instance variable for name*/
	private String name;
	
	/**
	 * This is the constructor of the employee class 
	 * @param EmployeeNo employee number of the employee.
	 * @param name name of the employee.
	 */
	public Employee(int EmployeeNo, String name)
{
	 employeeNumber=EmployeeNo;
	 this.name = name;
}
	
	/**
	 * This is toString method which is used to display the employee number and name.
	 */

    public String toString() {
	return "Employee number: " + employeeNumber +"\nName :"+name;
}

}
