package com.quesF;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		String itm[]=new String[50];
		System.out.println("Enter The item amt:");
		Scanner in=new Scanner(System.in);
		int n = 0;
		
		for (int j = 0; j < itm.length; j++) {
		
			n=Integer.parseInt(in.nextLine());
		}
		
		for (int j = 0; j < n; j++) {
			 String line  = in.nextLine();
			    Scanner lineScan = new Scanner(line);
			    while (lineScan.hasNextInt()) {
			        // print number
			        System.out.println(lineScan.nextInt());
			    }
		}
		
		for (int j = 0; j < itm.length; j++) {
			System.out.println(itm[j]);
		}
	}

}
