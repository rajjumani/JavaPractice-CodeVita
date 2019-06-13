package com.quesH;

import java.util.Scanner;

public class Myclass {

	public static void main(String[] args) {

		int n,cnt=0;
		
		System.out.println("Enter no. of test cases:");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		if(n>=1 || n<=1000){
	
		int c[]=new int[n+1];
		for (int i = 1; i <= n; i++) {
			cnt=0;
		System.out.println("Enter value for case "+i);
			c[i]=in.nextInt();
			if (c[i]>0) {
				
			
			do{
			if(c[i]>=10){
				cnt++;
				c[i]=c[i]-10;
			}
			
			else if (c[i]>=7) {
				cnt++;
				c[i]=c[i]-7;
			}
			
			else if(c[i]>=5){
				cnt++;
				c[i]=c[i]-5;
			}
			
			else{
				cnt++;
				c[i]=c[i]-1;
			}
		
			}while(c[i]!=0);
			}
			System.out.println(cnt);
		}
		}		

	}

}
