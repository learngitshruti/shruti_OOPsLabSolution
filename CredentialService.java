package com.greatlearning.service;

import java.util.Random;

public class CredentialService {
	
	public String capitalletters ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public String smallletters="abcdefghijklmnopqrstuvwxyz";
	public String Specialcharcters ="!@#$%&*";
	
	String password= capitalletters+smallletters+Specialcharcters;
	
	
	public String generateEmail(String firstname, String lastname, String dept) {
		
		String genemail;
		
		genemail=firstname+lastname+"@"+dept+"."+"company"+"."+"com";
		
		return genemail;
		
	}

	
	public char[] generatePassword() {
		
		String allowedPassword= new String ("ABCDEFGHIJKLMNOPQRSTUVWXYZ+!@#$%&*");
		int length=8;
		
		char [] password= new char[length];
		
		Random random = new Random();
		
		for(int i=0;i< length;i++) {
			int index= random.nextInt(allowedPassword.length());
			password[i]=allowedPassword.charAt(index);
		}
		return password;
		
	}


	public void display(String firstname, String lastname , String genemail , char[] password) {
		System.out.println("Dear" + " "+ firstname+" "+ "your generated credentials are as follows");
		System.out.println("Email--->"+ genemail);
		System.out.println("Password-->" +password);
	}
	

}
