import java.util.Arrays;
import java.util.Scanner;
public class lab8 {

	public static void main(String[] args) {
		//declare statements
		Scanner input = new Scanner(System.in);
		int choice = 0;
		int userInput;
		int totalBases = 0;
		int average= 0;
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
		
		//for each element in the "atBat" array, we are going to use a for loop
		//the for loop should calculate how many times the batter went to bat
		int i = 1;
		for( i = 1; i <= atBat.length; i++){
			System.out.println("Enter result for bat number: " + i);
			//Save the user input for number of times batting
			//and also store the number of bases in "i"
			atBat[i]=input.nextInt();
			input.nextInt();
				totalBases += atBat[i];
				average = totalBases/i;
		}
			//Get result total for "at bat"
			//To get average batting percentage, use total/atBats
			
			
		
		
		
		
	}//End of main

}//End of class
