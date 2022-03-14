package com.greatlearning.driver;


import java.util.*;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class Driver {

	public static void main(String args[]) {
		
		
		CredentialService cs = new CredentialService();
		Employee e=new Employee("Shruti","Sonje");
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the option");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.HR");
		System.out.println("4.Legal");
		int option =sc.nextInt();
		
		if(option == 1) {
			String email=cs.generateEmail(e.getFirstname(), e.getLastname(), "tech");
			char[] pass=cs.generatePassword();
			cs.display(e.getFirstname(), e.getLastname(), email, pass);
			
				
			
		} else if(option ==2) {
			String email=cs.generateEmail(e.getFirstname(), e.getLastname(), "adm");
			char[] pass=cs.generatePassword();
			cs.display(e.getFirstname(), e.getLastname(), email, pass);
				
		} else if (option==3) {
			String email=cs.generateEmail(e.getFirstname(),e.getLastname() , "hr");
			char[] pass=cs.generatePassword();
			cs.display(e.getFirstname(), e.getLastname(), email, pass);
		    
		} 
		else if   (option == 4){
			String email=cs.generateEmail(e.getFirstname(), e.getLastname(), "lg");
			char[] pass=cs.generatePassword();
			cs.display(e.getFirstname(), e.getLastname(), email, pass);
				
			
		}
		
		
		
		
				
		
		
		
	}
}
