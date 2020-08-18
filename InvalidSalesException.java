/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salestracker;

 /**
* Programmer: Jasleen Kaur <BR>
 * Program:    InvalidSalesException.java<BR>
 * Date:       21 June 2020<BR>
 * @version 1.0 * @author jasleen Kaur
 */
 public class InvalidSalesException extends Exception
 
 {
	 /**
	  * This toString method is used to display the statement for exception.
	  */
	 @Override
	public String toString() {
		
		return "The sales is not betweek 0 and 2000";
	}
 }