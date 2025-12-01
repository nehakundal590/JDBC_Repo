package com.neha.learnjava;
import java.util.Scanner;


public class Sumofdigit {
	public static void main(String[]args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		while(num>0) {
			//digit
			int d=num%10;
			//addition
			sum=sum+d;
			//number update
			num=num/10;
		}
	}

}
