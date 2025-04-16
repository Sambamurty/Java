package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class F6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("newfile.txt");
		fw.write("Samba Murty");
		fw.write(" Linker");
		//fw.flush();
		FileReader fr = new FileReader("newfile.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println();
		String s ="Note Book N0. 33";
//		int rem = s.indexOf('a',2);
//		System.out.println("\n"+rem);
		
		BufferedWriter bw =new BufferedWriter(fw);
		bw.newLine();
		bw.write(s, 2, 8);	
		bw.flush();
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());
		System.out.println(br.readLine());
	}

}
