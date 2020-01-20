package fileof;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileReaderCar {
	
	public static void main(String[] args) {
		
		try(FileInputStream fis= new FileInputStream("C:\\TestsF\\bucky.txt");//returns bytes array
			ObjectInputStream ois = new ObjectInputStream(fis)){//translates the bytes from fis -
			//back to an object
			Car cc= (Car)ois.readObject();//make sure its a car- casting(always reads an object, but what object?
			System.out.println(cc);
		}catch(IOException | ClassNotFoundException ex){
			System.out.println(ex.getMessage());
		}
	}

}
