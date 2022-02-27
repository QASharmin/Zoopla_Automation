package com.usa.javapractice;

public class MyProject {
	
	static String name = "Tawhid";
	double salary = 10000.50;
	int age;
	String firstName;
	String information;
	
	
	public void getTawhidInfo () {
		age = 45;
		firstName = "Sadia";
		information = "46544 St";
		System.out.println("Age: " + age + " Name: " +firstName + " Info: " +information);
	}
    
	public void getEducation () {
		age = 20;
		firstName = "Mitu";
		information =  "4456";
		String department = "biology";
		System.out.println(age + firstName + information + department);
		
	}
	
	public String getInfo(String type) {
		return null;
	}
	
	public void getData(int data) {
		
	}
	
	public String getCase () {
		return null; 
	}
	
	public void getSalary() {
		
	}
	
    public String getNumber() {
    	
   return null;	
    }

    public String getEmployees(int salary ) {
    return null;	
    }
    
    public void getNumber(int age) {
    	
    }
    
    
	public static void getIsratInfo() {
		int employeesID = 23575;
		String address = "3706 69th St";
		String city = "Broklyn";
		System.out.println(" My ID " +employeesID + " Address "  +address + " City " +city);
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyProject obj = new MyProject();
		
		obj.getTawhidInfo();
		obj.getEducation();

	}

}
