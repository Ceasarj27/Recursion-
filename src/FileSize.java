import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FileSize {
	/**
	 * Directory
	 * |
	 * |file 1 file file 3 directory1
	 * 							|
	 * 							file4 file 5 dir2
	 * 										  |
	 * 										 file 6
	 * 
	 * @param args
	 */
	
	public static long getSize(File file){
		long size = 0;
		//if file => get size
		//if directory => get all of the files, and 
		// process all of the files and directory
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			// for every file call getSize
			List<File> xFiles = new LinkedList<>(Arrays.asList(file));
			for(File f: xFiles) {
				size += getSize(f);
			} 
		} else {
			size += file.length();	
			}
		
		return size;
		}
		
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please give me directory or a file:");
		String str = input.nextLine();
		System.out.println("The size is: " + getSize(new File(str)));
	}

}
