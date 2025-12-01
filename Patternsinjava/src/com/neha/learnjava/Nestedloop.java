package com.neha.learnjava;

import java.util.Scanner;

public class Nestedloop {
	public static void main(String[]args) {
		int n;
		System.out.println("enter the number of row");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
			System.out.print(i+","+ j +" ");
		}
		System.out.println();
	}

}

}
