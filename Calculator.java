package switchCaseStatements;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter first number: ");
int a = sc.nextInt();

System.out.println("Enter second number: ");
int b = sc.nextInt();

System.out.println("Enter the operation");
// we have to take a string input before actual string input because when we previously took a int input  and hit enter
//the compiler thought we have already taken the string output but in real only an enter is stored in that string
// so we take one string input which is actually empty before the actual input

sc.nextLine();// takes the input of a string.
char operation = sc.nextLine().charAt(0);

int result = 0;

switch(operation) {
case '+':
    result = a + b;
	break;
case '-':	
	result = a- b;
	break;
case '*':
	result = a*b;
	break;
case '/':
	result = a/b;
	break;
default:
	System.out.println("This operation is not available.");
}
	
	System.out.println("The result is : " + result);
}



}


