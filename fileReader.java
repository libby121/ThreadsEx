package fileIO;

import java.io.*;

public class fileReader {

	public static void main(String[] args) {

		try (FileReader reader = new FileReader("C:\\TestsF\\sunny.txt")) {
			int tav = reader.read();

			while (tav != -1) {// keep reading the tavs till the end of file
				System.out.print((char)tav);//returns ascii int . we need casting
				tav = reader.read();// returns int that it reads. when it
									// reaches the end- returns -1 instead of
									// the character

			}

		} catch (IOException ex) {// two possible excpetions - file that doesnt
									// exist. or path doesnt exist
			ex.getMessage();// ioexception- father of filenotfoundexception

			// }catch(FileNotFoundExcetion ex){
			// ex.getMessage();
		}
	}
}
