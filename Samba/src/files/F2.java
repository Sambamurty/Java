package files;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class F2 {
	public void fileWriterAndReader() throws IOException{
		String path ="newfile.txt";
		FileOutputStream fos = new FileOutputStream(path);
		String txt = "Samba is good man.";
		byte[] txtArray = txt.getBytes();
		fos.write(txtArray);
		try (FileInputStream fis = new FileInputStream(path)) {
			int n;
			while((n=fis.read()) != -1)
			{
				System.out.print((char)n);
			}
		}
	}
	public static void main(String[] args) throws IOException  {
		
		F2 obj = new F2();
		obj.fileWriterAndReader();
	}
}
