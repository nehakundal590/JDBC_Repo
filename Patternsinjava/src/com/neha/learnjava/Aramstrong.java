package com.neha.learnjava;
import java.util.Scanner;

public class Aramstrong {
	public static void main(String[] args) {
		System.out.println("Enter the nuumber");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
	       int	originalnumber =num;
	       
	        int sum=0;
	        while(num>0) {
	        	int digit1 =num%10;
	        	sum=sum+(digit1*digit1*digit1);
	        	num=num/10;
	        	
	        }
	        if(sum==originalnumber) {
	        	System.out.println("aramstrong number");
	        }
	        else {
	        	System.out.println("non aramstrong number");
	        }
	}

}
         