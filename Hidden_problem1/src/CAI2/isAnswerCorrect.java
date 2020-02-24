package CAI2;

public class isAnswerCorrect {
	public static boolean answerCheck(int x, int y, int input) {
		if(input == x * y) {
			return true;
		} else {
			return false;
		}
	}
}
