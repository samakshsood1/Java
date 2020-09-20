package whileLoops;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int temp = n;
		int reversed = 0;
		while(temp > 0)
		{ int lastDigit = temp % 10;
		reversed = reversed * 10 + lastDigit;
		temp = temp / 10;// this technique is used to reverse a number.
	
		}
		if(reversed == n) System.out.println(n+ " is a palindrome");
		else System.out.println(n+ " is not a palindrome");// single digits are palindrome
}
}