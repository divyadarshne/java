package day3;
import java.util.Scanner;
public class StudentDetails_Task3 {
	public static void main(String[] args) {
		Scanner details= new Scanner(System.in);
		System.out.println("Enter the Name: ");
		String name=details.nextLine();
		
		System.out.println("Enter the Roll no: ");
		int rollno=details.nextInt();
		
		System.out.println("Enter the English mark: ");
		int english=details.nextInt();
		
		System.out.println("Enter the Tamil mark: ");
		int tamil=details.nextInt();
		
		System.out.println("Enter the Maths mark: ");
		int maths=details.nextInt();
		
		System.out.println("Enter the Science mark: ");
		int science=details.nextInt();
		
		System.out.println("Enter the Social mark: ");
		int social=details.nextInt();
		
		int avg= (english+tamil+maths+science+social)/5;
		
		
		details.close();
		
		
		System.out.println("Name: " + name);
		System.out.println("Roll no: " + rollno);
		System.out.println("English marks: " + english);
		System.out.println("Tamil marks: " + tamil);
		System.out.println("Maths marks: " + maths);
		System.out.println("Science marks: " + science);
		System.out.println("Social marks: " + social);
		System.out.println("Average Marks of " + name+ " is "+ avg);

		
	
				
	}
	

}
