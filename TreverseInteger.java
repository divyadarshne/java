package tasks;

import java.util.Scanner;

public class TreverseInteger {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=input.nextInt();
		int rev = 0;
		input.close();
		while(n>0) {
			int last =n % 10;
			rev=rev *10+last;
			n=(int)(n/10);
			
		} System.out.println(rev);
			
	}
}