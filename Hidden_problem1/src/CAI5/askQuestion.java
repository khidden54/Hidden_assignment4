package CAI5;

public class askQuestion {
	public static void arithmeticType(int x, int y, int type) {
		
		switch(type) {
			case 1:
				System.out.println("What is " + x + " plus " + y + "?");
				break;
			case 2:
				System.out.println("What is " + x + " times " + y + "?");
				break;
			case 3:
				System.out.println("What is " + x + " minus " + y + "?");
				break;
			case 4:
				if(y == 0) {
					y = RandomNum.randomInt(4) % 8 + 1;
				}
				System.out.println("What is " + x + " divided by " + y + " to three decimal places?");
				break;
			default:
				System.out.println("Type error.");
		}
	}
	
	public static void tryAgain() {
		System.out.println("Do you want to try again? 1 : Yes | 2 : No");
	}
	
	public static int difficulty() {
		System.out.println("Choose a diffuculty level:\n1 : One digit numbers\n2 : Two digit numbers\n3 : Three digit numbers\n4 : Four digit numbers");
		return readResponse.scan.nextInt();
	}
	
	public static int type() {
		System.out.println("Choose question type:\n1 : Addition\n2 : Multiplication\n3 : Subtraction\n4 : Division\n5 : Mixed");
		return readResponse.scan.nextInt();
	}
}
