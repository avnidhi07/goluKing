package javaprogram;

import java.util.Scanner;

public class MainPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		boolean rs =isPalindrome(n);
		if(rs==true) {
			System.out.println(n+" is palindrome");
		}
		else {
			System.out.println(n+" is not palindrome");
		}
	}

	private static boolean isPalindrome(int x) {
		int rev=0; 
		int temp=x;
		do {
			int d=x%10;
			 rev = rev*10+d;
			x=x/10;
		}while(x!=0);
		
		return rev==temp;
	}

}
