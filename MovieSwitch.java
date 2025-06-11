package tasks;

import java.util.Scanner;

public class MovieSwitch {
	public static void main(String[]args) {
	Scanner movie= new Scanner(System.in);
	System.out.println("Enter the Screen No: ");
	int screen= movie.nextInt();
//	System.out.println("Enter timing: ");
//	String time= movie.nextLine();
//	movie.nextLine();
	switch(screen) {
	case 1:
		System.out.println("Enter timing: (9am-11am as 1st show, 11.30am-2pm as 2nd show, 2pm-5pm as 3rd show ) ");
		movie.nextLine();
		String time= movie.nextLine();
		switch (time) {
		case "1st show":
			System.out.println("movie running in screen 1 is Minnale ");
			break;
		case "2nd show":
			System.out.println("movie running in screen 1 is KKPO ");
			break;
		case "3rd show":
			System.out.println("movie running in screen 1 is OKOK ");
			break;
		default:
			System.out.println(" movie timing is not available");
			break;
			}
	case 2:
		System.out.println("Enter timing: (9am-11am as 1st show, 11.30am-2pm as 2nd show, 2pm-5pm as 3rd show ) ");
		String time1= movie.nextLine();
		movie.nextLine();
		switch (time1) {
		case "1st show":
			System.out.println("movie running in screen 1 is okok ");
			break;
		case "2nd show":
			System.out.println("movie running in screen 1 is KKPO ");
			break;
		case "3rd show":
			System.out.println("movie running in screen 1 is minnale ");
			break;
		default:
			System.out.println(" movie timing is not available");
			break;
			}
		case 3:
		System.out.println("Enter timing: (9am-11am as 1st show, 11.30am-2pm as 2nd show, 2pm-5pm as 3rd show ) ");
		String time2= movie.nextLine();
		movie.nextLine();
		switch (time2) {
		case "1st show":
			System.out.println("movie running in screen 1 is kkpo ");
			break;
		case "2nd show":
			System.out.println("movie running in screen 1 is minnale ");
			break;
		case "3rd show":
			System.out.println("movie running in screen 1 is OKOK ");
			break;
		default:
			System.out.println(" movie timing is not available");
			break;
			}
		default:
			System.out.println(" screen is not available");
			break;
		
	}
	      movie.close();
	
	
	}
	}