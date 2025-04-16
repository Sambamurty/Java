package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class F7 {
	public static void main(String[] args) throws IOException {
//		String path = ".\\home\\next\\TextFile.txt";
//		File newfile = new File(path);
//		if(!newfile.exists())
//		{
//			newfile.createNewFile();
//		}
//		else
//		{
//			System.out.println("File already Exists.");
//		}
		FileWriter fw = new FileWriter("/home/next/TextFile.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("prabash is prabash who is called as prabash");
		bw.newLine();
		bw.write("samba");
		bw.flush();
		FileReader fr = new FileReader("/home/next/TextFile.txt");
		BufferedReader br = new BufferedReader(fr);
		br.lines().forEach(e->System.out.println(e));
//		int i;
//		while((i=br.read()) != -1)
//		{
//			System.out.println((char)i);
//		}
	}
}
