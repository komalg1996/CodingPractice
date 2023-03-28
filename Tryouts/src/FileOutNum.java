import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutNum {

	public static void main(String[] args) {
		FileOutputStream fo = null;
		
		try {
			fo = new FileOutputStream("C:\\Users\\Komal Ghorpade\\OneDrive\\Desktop\\demo2.txt");
			//String s = "hello komal"; 
			int s = 33;
			
			try {
				fo.write(s);
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
