package CAI3;

public class Quiz {

	public static void quiz() {
		
		int num_1;
		int num_2;
		double score = 0.0;
		int input;
		
		for(int i = 0; i < 10; i++) {
			
			num_1 = RandomNum.randomInt() % 9;
			num_2 = RandomNum.randomInt() % 9;
			askQuestion.multiplication(num_1, num_2);
			
			input = readResponse.scan.nextInt();
			
			if (isAnswerCorrect.answerCheck(num_1, num_2, input)) {
				displayCorrectResponse.correctResponse();
				score++;
			} else {
				displayIncorrectResponse.incorrectResponse();
			}
		}
		
		System.out.println(score *= 10);
		
		if(score >= 75.0) {
			System.out.println("Congratulations, you are ready to go to the next level!");
		} else {
			System.out.println("Please ask your teacher for extra help.");
		}
	}
}
