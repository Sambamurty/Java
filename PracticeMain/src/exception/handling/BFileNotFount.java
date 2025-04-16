package exception.handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BFileNotFount {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("/home/next/eclipse-workspace/Samba/fil.txt");
			BufferedReader br = new BufferedReader(fr);
			int i;
			while((i=br.read()) != -1)
			{
				System.out.println((char)i);
			}

			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
