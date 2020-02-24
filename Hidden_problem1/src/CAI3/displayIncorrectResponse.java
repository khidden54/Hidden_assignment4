package CAI3;

public class displayIncorrectResponse {
	public static void incorrectResponse() {
		int response_choice = RandomNum.randomInt() % 4 + 1;
		
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
}
