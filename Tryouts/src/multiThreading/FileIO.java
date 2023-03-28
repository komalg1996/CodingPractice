package multiThreading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO {

	public static void main(String[] args) {
		FileInputStream f=null;
		try {
		f = new FileInputStream("C:\\Users\\Komal Ghorpade\\OneDrive\\Desktop\\demo.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scanner sc = new Scanner(f);
		int counter=0;
		while(sc.hasNext()) {
			System.out.println(sc.next());
			counter++;
		}
		System.out.println(counter);
	}

}
