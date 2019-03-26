package engine.core.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileUtils {

	private FileUtils() {
		
	}
	
	public static String loadText(String path) {
		String result = "";
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			String buffer;
			
			while ((buffer = reader.readLine()) != null)
				result += buffer + "\n";
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public static String loadAsString(String file) {
		StringBuilder result = new StringBuilder();
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String buffer = "";
			
			while ((buffer = reader.readLine()) != null)
				result.append(buffer + '\n');
			
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result.toString();
	}
	
}