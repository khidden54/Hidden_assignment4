package hidden_problem1;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

public class DuplicateRemover {
	
	HashSet<String> uniqueWords = new HashSet<String>();
	
	public void remove(String dataFile) {
		
		Scanner fileScanner = null;
		try {
			File in = new File(dataFile);
			fileScanner = new Scanner(in);
			
			while(fileScanner.hasNext()) {
				uniqueWords.add(fileScanner.next().toLowerCase());
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
		
		try{
			out = new File(outputFile);
			write = new FileWriter(out);
			
			Iterator<String> i = uniqueWords.iterator();
			
			while(i.hasNext()) {
				write.write(i.next() + "\n");
			}
			
		}catch(IOException e) {
			System.out.println("File could not be opened.");
		}finally {
				try{
					write.close();
				}catch(IOException e) {
					System.out.println("File could not be closed.");
			}
		}
	}
}
