package File_Handling;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;

import java.util.Scanner;

public class Create_File {

	//File handling is an important part of any application.
	//Java has several methods for creating, reading, updating, and deleting files.
	
	
public static void main(String[] args) {
		
//To use the File class, create an object of the class, and specify the filename or directory name:

		
		File obj = new File("FirstFile.txt");     // Creating File
		
		try {
		if(obj.createNewFile()) {
			
			System.out.println("New file Created : " + obj.getName() );
		}else {
	        System.out.println("File already exists.");
	      }
		}catch(IOException e) {
			 System.out.println("An error occurred.");
		      e.printStackTrace();
		}

//		 Deleting the Created file .....
		
		if(obj.delete()) {
			System.out.println("Deleted the file: " + obj.getName());
		}else {
			System.out.println("Failed to delete the file.");
		}
		
		
//we use the FileWriter class together with its write() method to write some text to the file we created
		
		
	try {                                                           // Writing in File
		FileWriter mywriter = new FileWriter("FirstFile.txt");
		
		mywriter.write("This is the first text in my file created");
		mywriter.close();      // After writing must and should close();
		 System.out.println("Successfully wrote to the file.");
		
		
		}catch(IOException e) {
			 System.out.println("An error occurred.");
		      e.printStackTrace();
		}
		
		
	
	// we use the Scanner class to read the contents of the text file we created 
	
	
	try {	                                           // Reading File 
		
		File obj1 = new File("FirstFile.txt");
		Scanner sc = new Scanner(obj);
		
		 String data = sc.nextLine();
	        System.out.println("Data in File :- "+data);
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	
	
	

		
		
		
		
	
	
	
	
	
		
	}
}
