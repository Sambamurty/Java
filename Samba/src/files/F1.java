package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class F1 {
	public static void main(String[] args) throws IOException {
		File newfile = new File("newfile.txt");
		if(!newfile.exists())
		{
			newfile.createNewFile();
		}
		else {
			System.out.println("File already exists");
		}
		FileWriter fw = new FileWriter("Samba\\src\\files\\newfile.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(672);
		bw.write(123);
		bw.write(231);
		bw.flush();
		bw.close();
		System.out.println("Successfully written.");
		FileReader fr = new FileReader("Samba\\src\\files\\newfile.txt");
 		BufferedReader br = new BufferedReader(fr);
 		int i;
 		while((i=br.read()) != -1)
 		{
 			System.out.println(i);
 		}
 		br.close();
	}
}
