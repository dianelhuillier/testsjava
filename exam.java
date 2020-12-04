package diane.exam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Collections;

public class Exam {
	public static void main (String[] args) {
		ArrayList<IntBuffer> notes = new ArrayList<>();
		
		File file = new File ("notes.txt");
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String ligne = null;
			while((ligne = bufferedReader.readLine()) !=null) {
				System.out.println(ligne);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
 
