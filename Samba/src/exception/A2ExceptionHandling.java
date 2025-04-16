package exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//Write a Java program to create a method that reads a file and throws an exception if the file is not found.
public class A2ExceptionHandling {
	public static void main(String[] args) {
		try {
		Path dir = Paths.get(".");
		Files.list(dir).forEach(System.out::println);
		//Files.walk(dir, 4).filter(e->e.endsWith(".")).forEach(System.out::println);
		}catch(IOException e)
		{
			e.printStackTrace();
		}	
	}
}
