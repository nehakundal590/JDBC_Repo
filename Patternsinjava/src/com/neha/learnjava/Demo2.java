package com.neha.learnjava;
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=4;i<=2*n-1;i+=3) {
			
			System.out.println(i);
			
		}
	}

}
