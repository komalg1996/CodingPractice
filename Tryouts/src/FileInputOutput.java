import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInputOutput {

	public static void main(String[] args) {
		FileInputStream f=null;
		try {
			f = new FileInputStream("C:\\Users\\Komal Ghorpade\\OneDrive\\Desktop\\demo.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc =new Scanner(f);
		int count=0;
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
			count++;
		}
		System.out.println(count);
		
	}

}
