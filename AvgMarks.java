package arrays;
import java.util.Scanner;

public class AvgMarks {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of students:");
int n = sc.nextInt();

int marks[] = new int[n];
System.out.println("Enter marks of the students:");

for(int i = 0; i<marks.length; i++ )
{ marks[i] = sc.nextInt();}
int average = 0;

for(int i = 0; i<n; i++)
{ average += marks[i];}
average = average/n;

System.out.println("Average of marks is: " +average);


	}

}
