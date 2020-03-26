package CAI5;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI5 {
	
	public static int maxQuestions = 10;
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		do {
			quiz();
			
			System.out.println("Do you want to try again? 1 : Yes | 2 : No");
			if(scan.nextInt() == 2) {
				break;
			}
		}while(true);
		
		scan.close();
	}
	
	public static int generateQuestionArgument(int difficulty) {
			
		SecureRandom rand = new SecureRandom();
		int x = 0;
		
		switch(difficulty) {
			case 1:
				x = rand.nextInt(9);
				break;
			case 2:
				x = rand.nextInt(99);
				break;
			case 3:
				x = rand.nextInt(999);
				break;
			case 4:
				x = rand.nextInt(9999);
				break;
			default:
				System.out.println("Difficulty error.");
		}
		
		return x;
	}
	
	public static void quiz() {
		
		int num_1;
		int num_2;
		int real_type = 0;
		double score = 0.0;
		double user_input;
		
		int difficulty = readDifficulty();
		int user_type = readProblemType();
		
		for(int i = 0; i < maxQuestions; i++) {
			
			if(user_type == 5) {
				real_type = generateQuestionArgument(difficulty) % 4 + 1;
			}else {
				real_type = user_type;
			}
			
			num_1 = generateQuestionArgument(difficulty);
			num_2 = generateQuestionArgument(difficulty);
			askQuestion(num_1, num_2, real_type);
			
			user_input = readResponse();
			
			if (isAnswerCorrect(num_1, num_2, user_input, real_type)) {
				displayCorrectResponse();
				score++;
			} else {
				displayIncorrectResponse();
			}
		}
		
		displayCompletionMessage(score);
	}
	
	public static int readDifficulty() {
		System.out.println("Choose a diffuculty level:\n1 : One digit numbers\n2 : Two digit numbers\n3 : Three digit numbers\n4 : Four digit numbers");
		int difficulty = scan.nextInt();
		return difficulty;
	}
	
	public static int readProblemType() {
		System.out.println("Choose question type:\n1 : Addition\n2 : Multiplication\n3 : Subtraction\n4 : Division\n5 : Mixed");
		int user_type = scan.nextInt();
		return user_type;
	}
	
	public static double readResponse() {
		return scan.nextDouble();
	}
	
	public static void askQuestion(int x, int y, int type) {
		
		switch(type) {
			case 1:
				System.out.println("What is " + x + " plus " + y + "?");
				break;
			case 2:
				System.out.println("What is " + x + " times " + y + "?");
				break;
			case 3:
				System.out.println("What is " + x + " minus " + y + "?");
				break;
			case 4:
				if(y == 0) {
					y = generateQuestionArgument(4) % 8 + 1;
				}
				System.out.println("What is " + x + " divided by " + y + " to three decimal places?");
				break;
			default:
				System.out.println("Type error.");
		}
	}
	
	public static boolean isAnswerCorrect(double x, double y, double input, int type) {
		switch(type) {
			case 1:
				if(x + y == input) {
					return true;
				}
				break;
			case 2:
				if(x * y == input) {
					return true;
				}
				break;
			case 3:
				if(x - y == input) {
					return true;
				}
				break;
			case 4:
				if((x / y) - input <= 0.001 && (x / y) - input >= 0.000) {
					return true;
				}
				break;
			default:
				System.out.println("Check error.");
		}
		
		return false;
	}
	
	public static void displayCorrectResponse() {
		int response_choice = generateQuestionArgument(4) % 4 + 1;
		
		switch(response_choice) {
			
			case 1: 
				System.out.println("Very good!");
				break;
			case 2: 
				System.out.println("Excellent!");
				break;
			case 3: 
				System.out.println("Nice work!");
				break;
			case 4: 
				System.out.println("Keep up the good work!");
				break;
			default :
				System.out.println("Error choice.");
		}
	}
	
	public static void displayIncorrectResponse() {
		int response_choice = generateQuestionArgument(4) % 4 + 1;
		
		switch(response_choice) {
			
			case 1: 
				System.out.println("No. Please try again.");
				break;
			case 2: 
				System.out.println("Wrong. Try once more.");
				break;
			case 3: 
				System.out.println("Don't give up!");
				break;
			case 4: 
				System.out.println("No. Keep trying.");
				break;
			default :
				System.out.println("Error choice.");
		}
	}
	
	public static void displayCompletionMessage(double score) {
		
		System.out.println("You got " + (int)score + " correct, and " + (maxQuestions - (int)score) + " incorrect.");
		
		if(score * 10 >= 75.0) {
			System.out.println("Congratulations, you are ready to go to the next level!");
		} else {
			System.out.println("Please ask your teacher for extra help.");
		}
	}
}

