package com.usa.javapractice;

public class GlobalVariable {
	
int income;
static String firstName;
static String information;

public void getID() {
	String education = "Masters";
	income = 11000;
	firstName = "Sumaya";
	information = "2345235";
	System.out.println(education + income + firstName + information);
}
	
public void getAddress() {
	income = 8500;
	firstName = "Sharmin";
	information = "83648589";
	System.out.println(income + firstName + information);
}

public void getEducation() {
	income = 9500;
	firstName = "Rakib";
	information = "5225 69th St";
	System.out.println(income + firstName + information);
	
}


public static void main(String[] args) {
	GlobalVariable obj = new GlobalVariable();
	obj.getID();
	obj.getAddress();
	obj.getEducation();
}
}
