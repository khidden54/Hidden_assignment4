package CAI4;

public class CAI4 {

	public static void main(String[] args) {
		
		do {
			Quiz.quiz(askQuestion.difficulty());
			
			askQuestion.tryAgain();
			if(readResponse.scan.nextInt() == 2) {
				break;
			}
		}while(true);
	}
}
