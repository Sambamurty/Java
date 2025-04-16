package files;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class F3 {
	public static void main(String[] args) {
		String path = "newfile1.txt";
		try {
			FileOutputStream fos = new FileOutputStream(path);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			byte[] array = path.getBytes();
			bos.write(array);
			bos.close();
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
			int i;
			while( (i=bis.read()) != -1)
			{
				System.out.print((char)i);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
