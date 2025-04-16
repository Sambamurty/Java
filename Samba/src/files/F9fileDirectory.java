package files;

import java.io.File;
import java.util.Arrays;

public class F9fileDirectory {
	public static void getFileDirectory(String dir)
	{
		File fdir = new File(dir);
		if(!fdir.exists() || !fdir.isDirectory())
		{
			System.err.println("There no such Directory");
			return;
		}
		File[] farr = fdir.listFiles();
		if(farr != null)
		{
			//Arrays.sort(farr); // Sort for consistent output
            for (File file : farr) {
                if (file.isFile()) {
                    System.out.println("File: " + file.getName());
                } else if (file.isDirectory()) {
                    System.out.println("Directory: " + file.getName());
                }
            }
		}
		System.out.println();
	}
	public static void getFileExtention(String dir,String ext)
	{
		File fdir = new File(dir);
		if(!fdir.exists() || !fdir.isDirectory())
		{
			System.out.println("There no such Directory");
			return;
		}
		File[] farr = fdir.listFiles();
		if(farr != null)
		{
			Arrays.sort(farr); // Sort for consistent output
            for (File file : farr) {
                if (file.isFile() && file.getName().toLowerCase().endsWith(ext.toLowerCase())) {
                    System.out.println("File: " + file.getName());
                }
            }
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dir = ".";
		String ext = ".java";
		getFileDirectory(dir);
		getFileExtention("src/multithreading",ext);
	}

}
