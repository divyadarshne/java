package day3;
import java.util.Scanner;
public class Task1 {
	public static void main(String [] args){
	//int a= 55;
	Scanner num = new Scanner(System.in); 
	System.out.println("enter number a : ");
	int a=num.nextInt();
	//int b= 11;  
	System.out.println("enter number b : ");
	int b=num.nextInt();
	int sum= a+b;
	int sub=a-b;
	int multi= a*b;
	int divide=a/b;
	int modu=a%b;

	num.close();
	System.out.println("sum of the numbers is :  " + sum);
	System.out.println("sub of the numbers is :  " + sub);
	System.out.println("multiple of the numbers is :  " + multi );
	System.out.println("quationt of the numbers is :  " + divide );
	System.out.println("reminder of the numbers is :  " + modu );

	}}
