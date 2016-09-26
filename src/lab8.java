import java.util.Arrays;
import java.util.Scanner;
public class lab8 {

	public static void main(String[] args) {
		//declare statements
		Scanner input = new Scanner(System.in);
		int choice = 0;
		int userInput;
		
		//enter welcome screen and begin first user input question
		System.out.println( "Welcome to Battling Average Calculator!");
		System.out.println( "Enter number of times at bat: ");
		
		//get user input for first question
		userInput = input.nextInt();
		int [] atBat = new int [userInput];
		

		//layout result format when at bat
		System.out.println(" Enter results for each time at bat");
		System.out.println(" 0=out, 1=single, 2=double, 3=triple, 4=HomeRun");
		System.out.println(" ===============================================");
		
		//for each element in the "atBat" array, we are going to use a for loop!
		for(int i = 0; i < atBat.length; i++){
			System.out.println("Enter result for number: " + i);
			i = i++;
			input.nextInt();
			int[] result = new int [choice];
			
			
		}
		
			
			
		
		
		
		
	}//End of main

}//End of class
