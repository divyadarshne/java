package tasks;

import java.util.Scanner;

public class MultiWhile {public static void main(String[]args) {
	Scanner input= new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n=input.nextInt();
	int a=1;
	//int n=6;
	while(a<=20) {
		System.out.println(n+" x "+a+" = "+(n*a));
		
		a++;
		}
	input.close();
}
}
