/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salestracker;

 /**
* Programmer: Jasleen Kaur <BR>
 * Program:    SalesPerson.java<BR>
 * Date:       21 June 2020<BR>
 * @version 1.0 * @author jasleen Kaur
 */
public class SalesPerson extends Employee
{
	 
   public SalesPerson(int EmployeeNo, String name, double salesAmount) {
		super(EmployeeNo, name);
		sales= salesAmount;
		 
	}
   /* Instance variable for sales*/
  private double sales;
  /* Instance variable for rate*/
   private double rate;
   /* Instance variable for commission*/
   private double commission;
   
   /**
    * This method is used to calculate the commission of employee.
    * @return commission of the employee
    */
   private double calculateCommission()
   {
	   if(sales>=0 && sales<=100.00)
	   {
		   rate = 5;
		 return  commission=(rate*sales)/100;
	   }
	   else if(sales>100.01 && sales<=1000.00)
	   {
		   rate = 7;
		   return commission=(rate*sales)/100;
	   }
	   else 
	   {
		   rate = 9;
		  return commission=(rate*sales)/100;
	   }   
   }
   /**
    * This method is used to return the string representation of the details of salesPerson
    */
	 @Override
	public String toString() {
		 double calCommission = calculateCommission();
		 String toReturn= super.toString()+ "\nSales amount: "+String.format("%.2f", sales)+"\nCommission Rate: "+String.format("%.2f", rate) +"\nCommisssion amount: : "+String.format("%.2f", calCommission);
		return toReturn;	}
   
}
