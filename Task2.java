package day3;
import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		int radius=num.nextInt();
		
		int area= 22/7*radius*radius;
		int perimeter=2*22/7*radius;
		num.close();
		System.out.println("Area of the circle: "+area);
		System.out.println("Area of the perimetre: "+perimeter);

	}
	

}
