package fileof;

import java.io.IOException;
import java.io.*;

public class FilewriterCar {
	
	public static void main(String[] args) {
		
		Car c = new Car(1976 , "Ferrari " , 200);
		System.out.println(c);
		//System.out.println(c.getSpeedMax().getBytes());
		
		try(FileOutputStream fos = new FileOutputStream("C:\\TestsF\\bucky.txt");//writes to a file but each byte separately takes bytes and save it to a file
			ObjectOutputStream streamer= new ObjectOutputStream(fos)){//takes object and converts it to bytes
			//1.object-output gets an object 2.translates it to bytes 3.pass those bytes to file-output.
			//4.file-output takes the bytes he got from object and saves them into a file
			streamer.writeObject(c);
			System.out.println("theres a car inside the file");
			
			//not textual but that way its easy for me to see what's inside
			//stream writes bytes array. i have an object represented by bytes. byte=256 options
			//i dont want to use it directly cause it means to translate it to bytes by myself.
			//so i use the help of object
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}

}
