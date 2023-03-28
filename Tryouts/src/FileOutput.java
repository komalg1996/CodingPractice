import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {

	public static void main(String[] args) {
		FileOutputStream fo = null;

		try {
			fo = new FileOutputStream("C:\\Users\\Komal Ghorpade\\OneDrive\\Desktop\\demo2.txt");
			String s = "Hello Komal 123";
			//int a= 77;
			byte b[] = s.getBytes();
			try {
				fo.write(b);
				fo.write(65);
				//fo.write(a);
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("success");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
