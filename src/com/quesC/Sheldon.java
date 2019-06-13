package com.quesC;

import java.util.Scanner;

public class Sheldon {

	public static void main(String[] args) {

		int n,x,cnt=0;
		
		System.out.println("Enter no of inputs");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int[] dr=new int[n];
		if(n>=3){
		
		for (int i = 0; i < n; i++) {
			dr[i]=in.nextInt();
		}

		System.out.println("Enter X");
		x=in.nextInt();
		
		for (int i = 0; i <= n; i++) {
			for (int j = i+1; j < n; j++) {
				for (int j2 = j+1; j2 < n; j2++) {
					
					if (x==dr[i]+dr[j]+dr[j2]) {
						cnt++;
					}
					
				}
				
			}
			
		}
		if(cnt>=1)
			System.out.println("True");
		else{
			System.out.println("False");
		}
		}	
		
	}

}
