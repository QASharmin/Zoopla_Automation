package com.usa.javapractice;

public class InstanceVariable {//this is a class
	
 int salary;
 String name;
 String info;

	
	public void getSalary() {
	salary = 10000;
	name = " Alam ";
	info = "123-13-3534";
	System.out.println(salary + name + info);
	}
	
	public void getName() {
	salary = 8000;
	name = " Julie ";
	info = "234-13-2334";
	System.out.println(salary + name + info);
	}
	
	public void getInfo() {
	salary = 6000;
	name = " Imon ";
	info = "454-13-4564";
	System.out.println(salary + name + info);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    InstanceVariable obj = new InstanceVariable();
    obj.getSalary();
    obj.getName();
    obj.getInfo();
	}

}
