package CAI5;

public class CAI5 {

	public static void main(String[] args) {
		
		do {
			Quiz.quiz(askQuestion.difficulty(), askQuestion.type());
			
			askQuestion.tryAgain();
			if(readResponse.scan.nextInt() == 2) {
				break;
			}
		}while(true);
	}
}
