package CAI5;

public class Quiz {

	public static void quiz(int difficulty, int user_type) {
		
		int num_1;
		int num_2;
		int real_type = user_type;
		double score = 0.0;
		double input;
		boolean rand_type = false;
		
		if(user_type == 5) {
			rand_type = true;
		}
		
		for(int i = 0; i < 10; i++) {
			
			if(rand_type) {
				real_type = RandomNum.randomInt(difficulty) % 4 + 1;
			}
			
			num_1 = RandomNum.randomInt(difficulty);
			num_2 = RandomNum.randomInt(difficulty);
			askQuestion.arithmeticType(num_1, num_2, real_type);
			
			input = readResponse.scan.nextDouble();
			
			if (isAnswerCorrect.answerCheck(num_1, num_2, input, real_type)) {
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
