/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salestracker;

 /**
* Programmer: Jasleen Kaur <BR>
 * Program:    Main.java<BR>
 * Date:       21 June 2020<BR>
 * @version 1.0 * @author jasleen Kaur
 */
import java.util.*;

public class Main 
{
	public static void main(String[] args) throws InvalidSalesException//main method
	{
		ArrayList<Employee> EmployeeList = new ArrayList<>();// arraylist for employee list
		String continueinput = "Yes";
		Scanner input = new Scanner(System.in);

		while (continueinput.equalsIgnoreCase("Yes")) 
		{

			System.out.println("Enter your employee number");
			int EmployeeNo = input.nextInt();

			Employee one = null;

			System.out.println("Press 1 if you are Sales Person , 2 if a worker");
			int selected = input.nextInt();
			System.out.println("Enter your name");
			String name = input.next();

			if (selected == 1) {

				System.out.println("Enter sales amount");
				double salesAmount = input.nextDouble();

				if(salesAmount<=0 || salesAmount>=2000) {
					throw new InvalidSalesException();
				}
				one = new SalesPerson(EmployeeNo,name, salesAmount);
			}

			else if (selected == 2) {

				System.out.println("Enter your hours worked");
				int hours = input.nextInt();

				System.out.println("Enter hourly pay");
				double pay = input.nextDouble();
				one = new Worker(EmployeeNo,name, hours, pay);

			}

			EmployeeList.add(one);

			System.out.println("Do you want another services : yes or no");
			continueinput = input.next();

		}
		for(Employee emp: EmployeeList) //for each loop
		{
			System.out.println("\n*****************************");
			System.out.println(emp.toString());

		}
		

	}
}

