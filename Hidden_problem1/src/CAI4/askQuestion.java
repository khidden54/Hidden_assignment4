package CAI4;

public class askQuestion {
	public static void multiplication(int x, int y) {
		System.out.println("What is " + x + " times " + y + " ?");
	}
	
	public static void tryAgain() {
		System.out.println("Do you want to try again? 1 : Yes | 2 : No");
	}
	
	public static int difficulty() {
		System.out.println("Choose a diffuculty level:\n1 : One digit numbers\n2 : Two digit numbers\n3 : Three digit numbers\n4 : Four digit numbers");
		return readResponse.scan.nextInt();
	}
}
