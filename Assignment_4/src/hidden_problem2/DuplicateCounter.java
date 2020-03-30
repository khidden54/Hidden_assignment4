package hidden_problem2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class DuplicateCounter {
	
	HashMap<String, Integer> wordCounter = new HashMap<String, Integer>();
	
	public void count(String dataFile) {
		
		Scanner fileScanner = null;
		try {
			File in = new File(dataFile);
			fileScanner = new Scanner(in);
			
			String temp = "";
			
			while(fileScanner.hasNext()) {
				temp = fileScanner.next().toLowerCase();
				
				if(wordCounter.containsKey(temp)) {
					wordCounter.replace(temp, wordCounter.get(temp) + 1);
				}else {
					wordCounter.put(temp, 1);
				}
			}
			
		}catch(IOException e) {
			System.out.println("File could not be opened.");
		}finally {
			fileScanner.close();
		}
	}
	
	public void write(String outputFile) {
		File out = null;
		FileWriter write = null;
		
		try {
			out = new File(outputFile);
			write = new FileWriter(out);
			
			for(String word: wordCounter.keySet()) {
				write.write(word + " " + wordCounter.get(word) + "\n");
			}
		}catch(IOException e){
			System.out.println("File could not be opened.");
		}finally {
			try{
				write.close();
			}catch(IOException e) {
				System.out.println("Could not close file.");
			}
		}
	}
}
