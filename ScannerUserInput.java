package userInput;
import java.util.Scanner;//mandatory

public class ScannerUserInput {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);// mandatory, here sc is an object
//	int x = sc.nextInt();//sc.nextInt is the line where input is taken from user
//			
//	System.out.println(x);//th input stored goes in x in previous line so we print x which gives us user's input.
//    double y = sc.nextDouble();
//    
//    System.out.println(y);
//    
    String hello = sc.nextLine();
    System.out.println(hello);
	}

}