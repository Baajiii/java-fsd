package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Createfile {
public static void main(String[] args) throws IOException {
	 File file = new File("G://mphasis//testFile1.txt");
     if (file.createNewFile()){
       System.out.println("File is created!");
     }else{
       System.out.println("File already exists.");
     }
     FileWriter writer = new FileWriter(file);
     writer.write("hello! welcome to the file");
     writer.close();
}
}
