package fileIO;


import java.io.*;

public class ReaderEx {

	public static void main(String[] args) {

		try(FileReader reader =new FileReader("C:\\TestsF\\sunny.txt")){
			int tav=reader.read();
			while(tav!=-1){
				System.out.print((char)tav);
				tav=reader.read();
			}
			reader.close();
		}catch(IOException ex){
			System.out.println(ex.getMessage());
		}


	}

}
