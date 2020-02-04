
public class Encrypter {
	
	public int[] encryption(char[] temp) {
		
		int length = temp.length;
		
		int[] encryptedData = new int[length];
		
		for(int i = 0; i < length; i++) {
			encryptedData[(i + 2) % length] = (Character.getNumericValue(temp[i]) + 7) % 10;
		}
		
		return encryptedData;
	}
}
