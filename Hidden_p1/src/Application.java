import java.util.Scanner;
import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String data = scan.next();
		
		char[] toEncrypt = data.toCharArray();
		
		Encrypter encrypt = new Encrypter();
		int[] encryptedData = encrypt.encryption(toEncrypt);
		
		for(int i = 0; i < encryptedData.length; i++) {
			System.out.print(encryptedData[i]);
		}
		System.out.print("\n");
		
		int[] decryptedData = new int[4];
		
		Decrypter decrypt = new Decrypter();
		decryptedData = decrypt.decryption(encryptedData);
		
		for(int i = 0; i < decryptedData.length; i++) {
			System.out.print(decryptedData[i]);
		}
		
		scan.close();
	}

}
