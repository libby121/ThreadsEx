package fileIO;

import java.io.FileWriter;

import java.io.IOException;
import java.util.*;

public class WriterEx {

	public static void main(String[] args) {

		try (FileWriter writer = new FileWriter("C:\\TestsF\\sunny.txt");
				Scanner sc = new Scanner(System.in)) {

			//for (int i = 0; i < 2; i++) {
			System.out.println("enter your name");
			String userText = sc.nextLine();			
			writer.write(userText);
		
	} catch (IOException e) {
		System.out.println(e.getMessage());
	}

	}
}
