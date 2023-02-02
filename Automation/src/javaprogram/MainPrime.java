package javaprogram;

import java.util.Scanner;

public class MainPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int n = sc.nextInt();
		boolean rs=isPrime(n);
		if(rs==true) {
			System.out.println(n+" is prime no");	
		}
		else {
			System.out.println(n+" is not prime");
		}
		

	}

	private static boolean isPrime(int x) {
		
		for (int i = 2; i < x/2; i++) {
			
			if(x%i==0) {
				return false;
			}
		}
		return true;
	}

	

}
