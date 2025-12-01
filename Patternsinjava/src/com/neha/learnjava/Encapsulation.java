package com.neha.learnjava;
import java.util.Scanner;

public class Encapsulation {
	//Encapsulation----------->Data binding in a single entity
	//Achieve Declare the variable as a private and define public
	//setter getter method
	private int a;
	//Setter method
	public void setA(int a) {
		this.a=a;
	}
	//getter method
	public int getA() {
		return a;
	}
	public static void main(String[] args) {
		Encapsulation d1=new Encapsulation();
		d1.setA(10);
		System.out.println(d1.getA());
		
	}

}
