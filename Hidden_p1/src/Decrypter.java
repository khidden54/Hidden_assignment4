
public class Decrypter {
	
	public int[] decryption(int[] encryptedData) {
		
		int length = encryptedData.length;
		
		int[] decryptedData = new int[length];
		
		for(int i = 0; i < length; i++) {
			decryptedData[(i + 2) % length] = (encryptedData[i] + 3) % 10;
		}
		
		return decryptedData;
	}
}
