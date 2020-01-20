package fileIO;

import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {

	public static void main(String[] args) {

		// File file = new File("C:\\TestsF\\bucky.txt");// ctor of file class.
		// file
		// // class gives
		// // information about
		// // file
		// // they exist, whats their name/length/location..
		//
		// if (file.exists())
		// System.out.println("it exists!");
		// else
		// System.out.println("it doesnt exist yet..");
		//
		//		// }
		//		FileWriter file = null;
		//		try {
		//
		//			file=new FileWriter("C:\\TestsF\\sunny.txt");// ctor gets String of location
		//			//System.out.println("file created");
		//			file.write("have lovely day\n");
		//			file.write("bye\n");
		//			//file.close();//writer must be closed in order to watch it. operating
		//			//system wont let anyone access  if its not closed first 
		//		} catch (IOException ex) {// windows 10 i cant create a file without a folder. if the folder
		//			// or path doesnt exist-its an exception. make sure path exists
		//			System.out.println("cant create the file: "+ex.getMessage());
		//		}finally{
		//			try{//code that will always run
		//			file.close();//can create exception-if i try to clse closed file..
		//		}catch (IOException ex) {
	//			System.out.println("cant create the file: "+ex.getMessage());

		
		try(FileWriter writer = new FileWriter("C:\\TestsF\\sunny.txt")){//a special try that closes the 
			//writer by itself-instead of finally and close
			//true- overloading of "append" of the writer ctor.adding instead of overriding
			//System.out.println("file created successfully");
			//writer.write("shalom\n");
			//writer.write(65);//ascii 
			writer.write("\nappending\n");
			//writer.write("12\n");
			int x=120;
			boolean y=true;
			writer.write(String.valueOf(y)+"\n ");
			writer.write(String.valueOf(x));//casting from int to string
		}catch(IOException ex){
			System.out.println(ex.getMessage());
		

	}
}
}
