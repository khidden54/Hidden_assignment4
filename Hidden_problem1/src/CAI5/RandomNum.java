package CAI5;

import java.security.SecureRandom;

public class RandomNum {
	public static int randomInt(int difficulty) {
		
		SecureRandom rand = new SecureRandom();
		int x = 0;
		
		switch(difficulty) {
			case 1:
				x = rand.nextInt(9);
				break;
			case 2:
				x = rand.nextInt(99);
				break;
			case 3:
				x = rand.nextInt(999);
				break;
			case 4:
				x = rand.nextInt(9999);
				break;
			default:
				System.out.println("Difficulty error.");
		}
		
		return x;
	}
}
