package CAI1;

public class Quiz {

	public static void quiz() {
		
		int num_1 = RandomNum.randomInt() % 9;
		int num_2 = RandomNum.randomInt() % 9;
		int input = 0;

		askQuestion.multiplication(num_1, num_2);

		while (true) {

			input = readResponse.scan.nextInt();

			if (isAnswerCorrect.answerCheck(num_1, num_2, input)) {
				displayCorrectResponse.correctResponse();
				break;
			} else {
				displayIncorrectResponse.incorrectResponse();
			}
		}
	}
}
