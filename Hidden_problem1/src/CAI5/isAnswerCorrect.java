package CAI5;

public class isAnswerCorrect {
	public static boolean answerCheck(double x, double y, double input, int type) {
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
}
