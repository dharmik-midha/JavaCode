package FileOutputStream;

import java.io.*;

public class FileWriteFunction2 {
	/*
	 * Q.wap which take a string which says that this is my birthday month and
	 * second sentence is this month is the 10th month * of the year? 1st string
	 * into a file a.txt and write a second string in second file bb.txt, you will
	 * read the text from bb.text and * display the output on stdout.
	 */
	public static void main(String arg[]) {
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\dharm\\Desktop\\Example\\a.txt");
			String s = "this is my birthday month";
			byte b1[] = s.getBytes();
			fos.write(b1);
			FileOutputStream fos1 = new FileOutputStream("C:\\Users\\dharm\\Desktop\\Example\\bb.txt");
			String s1 = "this is the 10th month of the year";
			byte b2[] = s1.getBytes();
			fos1.write(b2);
		} catch (IOException e) {
			System.out.println("IOexception");
		}
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\dharm\\Desktop\\Example\\a.txt");
			byte b3[] = new byte[50];
			{
				fis.read(b3);
				String s = new String(b3);
				System.out.println(s);
			}
			FileInputStream fis1 = new FileInputStream("C:\\Users\\dharm\\Desktop\\Example\\bb.txt");
			byte b4[] = new byte[50];
			{
				fis1.read(b4);
				String s1 = new String(b4);
				System.out.println(s1);
			}
		} catch (IOException e) {
			System.out.println("IOexception");
		}
	}
}
