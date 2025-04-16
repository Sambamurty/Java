package filesbynio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class File1 {
	
	 public static String toString(byte[] a) {
	        if (a == null)
	            return "null";
	        int iMax = a.length - 1;
	        if (iMax == -1)
	            return "";

	        StringBuilder b = new StringBuilder();
	        for (int i = 0; ; i++) {
	            b.append((char)a[i]);
	            if (i == iMax)
	                return b.toString();
	        }
	    }
	public static void main(String[] args) throws IOException {
		Path path = Paths.get(".\\home\\next\\filesnio.txt");
		if(Files.exists(path))
		{
			System.out.println("file already exists.");
		}
		else {
			Files.createFile(path);
		}
		String p = "/home/next/TextFile.txt";
		Path fp = Paths.get(p);
		Files.write(fp,Arrays.asList("Nice "));
		byte arrfp[]=Files.readAllBytes(fp);
		System.out.print(toString(arrfp));
		
		System.out.println(path.getFileName()+" "+Files.exists(path));
		try {
			Files.write(path, Arrays.asList("I am samba"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		byte arr[]=Files.readAllBytes(path);
		System.out.println(toString(arr));
	}
}
