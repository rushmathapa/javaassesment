import java.util.Arrays;
import java.util.Scanner;

public class MultipleChoice2DArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int choice = 1;
		while(choice == 1){
		int userAnswer = 0;
		int correctAnswer = 0;

		String[][] questions = {
				{ "A. What is the name of your country?", "1. Japan", "2. Nepal", "3. USA", "4. iNDIA" },
				{ "B. What is the capital city of Nepal?", "1. Kathmandu", "2. Tokyo", "3. Washington DC",
						"4. nEW dLHI" },
				{ "C. Why are you born ?", "1. To Live,", "2. To Laugh", "3. Happy", "4. Travel" },
				{ "D. Why study row is boring?", "1. lazy", "2. busy", "3. noisy", "4. louisy" } };
	
		int[] answers = { 2, 1, 4, 2 };

		int index = 0;
		for (int i = 0; i < questions.length; i++) {
			for (int j = 0; j < questions[i].length; j++) {
				System.out.println(questions[i][j]);
				
			}
			System.out.println("Enter the choice");
			 choice = scan.nextInt();
			if (choice == answers[i]) {
				index++;
				System.out.println("The user given input is correct!!");
				userAnswer += 1;
				System.out.println();
			}

			else {
				System.out.println("Invalid Input");

			}
		}
		System.out.println("Total correct Answer is " +userAnswer);
		System.out.println("Do you wish to continue? Press 1 to continue");
		choice = scan.nextInt();
		
		
		}
	}
}