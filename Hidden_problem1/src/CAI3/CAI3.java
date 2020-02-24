package CAI3;

public class CAI3 {

	public static void main(String[] args) {
		
		do {
			Quiz.quiz();
			
			askQuestion.tryAgain();
			if(readResponse.scan.nextInt() == 2) {
				break;
			}
		}while(true);
	}
}
