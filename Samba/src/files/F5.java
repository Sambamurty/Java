package files;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class F5 {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("newfile1.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		String name = "kumari";
		dos.writeUTF(name);
		dos.writeUTF("Landa");
		dos.flush();
		dos.close();
		FileInputStream fis = new FileInputStream("newfile1.txt");
		DataInputStream dis = new DataInputStream(fis);
		System.out.println(dis.readUTF());
		System.out.println(dis.readUTF());
		dis.close();
	}
}
