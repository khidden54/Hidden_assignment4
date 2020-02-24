package CAI5;

public class displayCorrectResponse {
	public static void correctResponse() {
		int response_choice = RandomNum.randomInt(4) % 4 + 1;
		
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
}
