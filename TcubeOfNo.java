package tasks;
import java.util.Scanner;

public class TcubeOfNo {
public static void main(String[]args) {
	Scanner input= new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n=input.nextInt();
	int con=n*n*n;
	System.out.println("Cube of the number is: "+ con);
    input.close();

	
}
}
