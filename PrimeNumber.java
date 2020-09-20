package loops;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPrime = true;
		
		for(int i = 2 ; i*i<= n ; i++)//because there is a property for prime nos. if a number is not prime then it will must have a fator between 1 and underoot of n
		{if( n % i == 0) {isPrime = false;// this dec computation time
		break;}
		}
		if (n<2) isPrime = false; 
System.out.println(isPrime);
	}

}
