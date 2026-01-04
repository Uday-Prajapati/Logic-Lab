// always use checked exception / compile time

import java.io.FileNotFoundException;
import java.io.FileReader;
class FileService {
	static void readFile() throws FileNotFoundException{
		FileReader fr = new FileReader("data.txt");
	}
}

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			FileService.readFile();
		}catch(FileNotFoundException e) {
			System.out.println("Exception handle in main: "+e);
		}
		System.out.println("Program continues...");
	}
}
