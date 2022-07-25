package Filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteAppend {
	public static void main(String[] args) throws IOException {
		String s = " And i am also going append this sentences in this file ";
		File file = new File("G://mphasis//textfile...txt");
		if(file.createNewFile())
		{
			System.out.println("File is Created");
		}else
		{
			System.out.println("file is already exists.");
		}
		FileWriter writer = new FileWriter(file);
		writer.write("hello friends , welcome to this file , this is my 1st file to create like this. ");
		writer.append(" And i am also going append this sentences in this file");
		writer.close();
	}

}
