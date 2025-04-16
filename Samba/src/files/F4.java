package files;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class F4 {
	public static void main(String[] args) throws IOException {
		SequenceInputStream sis = new SequenceInputStream(new FileInputStream("newfile.txt"),new FileInputStream("newfile1.txt"));
		int content;
		while((content = sis.read()) != -1)
		{
			System.out.print((char)content);
		}
	}
}
