package tasks;

import java.util.Scanner;

public class Even_Or_Odd_Task {
public static void main(String[] args) {
	Scanner num =new Scanner(System.in);
	System.out.println("Enter number");
	int a = num.nextInt();
	if (a%2==0) {
		System.out.println("The Given number is Even");
	}
	else {
		System.out.println("The Given number is Odd");

	}
	num.close();
	
}
}
