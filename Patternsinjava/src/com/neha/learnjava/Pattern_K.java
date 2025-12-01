package com.neha.learnjava;

public class Pattern_K {
	
	public static void main(String[] args) {
		for (int i=3;i>0;i--) {
			for(int j=1;j<=3;j++) {
				if (j==1||i==j) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		for (int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if (i==j || j==1) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
