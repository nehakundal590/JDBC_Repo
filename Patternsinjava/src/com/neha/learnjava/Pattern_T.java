package com.neha.learnjava;

public class Pattern_T {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			System.out.print("*");
		}
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=5;j++) {
				if(j==3) {
					System.out.print("*");
				}
				else {
					System.out.println("");
				}
			}
			System.out.println();
		}
		
	}
	

}
