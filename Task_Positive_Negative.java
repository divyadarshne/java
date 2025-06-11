package tasks;

import java.util.Scanner;

public class Task_Positive_Negative {
	public static void main(String[]args) {
		Scanner num =new Scanner(System.in);
		System.out.println("Enter number");
		int a = num.nextInt();
		if (a>0)
		{
			System.out.println("Number is possitive ");
		}
		
		else {
			System.out.println("Number is negative ");

		}
		num.close();
		
		
	}
}

