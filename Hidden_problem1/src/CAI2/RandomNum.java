package CAI2;

import java.security.SecureRandom;

public class RandomNum {
	public static int randomInt() {
		SecureRandom rand = new SecureRandom();
		
		int x = rand.nextInt(1000);
		
		return x;
	}
}
