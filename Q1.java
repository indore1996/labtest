package ioExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Q1 {
	public static void main(String[] args) throws FileNotFoundException {
		
		try(FileReader t=new FileReader("test.txt"))
		{
			  char c[]= new char[100];
			   t.read(c); //store file data to array 
			   FileWriter w= new FileWriter("newData.txt"); // create a new file if it doesnot exist
			   w.write(c); //write array data to file 
			   System.out.println(c);
			   w.flush(); // push data to file 
			   w.close();
			}
			catch(Exception w1) {
				System.out.println(w1);
			}
		
	}

}