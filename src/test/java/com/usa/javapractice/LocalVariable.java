package com.usa.javapractice;

public class LocalVariable {

	public void getNumber() {
	int salary = 8000;
	String name = "Twinkle";
	String info = "123-13-3524";
	System.out.println(salary + name + info);
	}

	public void getEmail() {
	int salary = 39999;
	String name = "Muna";
	String info = "703-255-4305";
	System.out.println(salary + name + info);
	}
	
	public static void main(String[] args) {
		LocalVariable obj = new LocalVariable();
		obj.getNumber();
		obj.getEmail();
	}
}
