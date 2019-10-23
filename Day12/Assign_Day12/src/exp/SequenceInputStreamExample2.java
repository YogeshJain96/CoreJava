package exp;

import java.io.*;
//Input data from two files and writes into another file
public class SequenceInputStreamExample2 {
	public static void main(String args[]) throws Exception {
		FileInputStream fin1 = new FileInputStream("D:\\testin1.txt");
		FileInputStream fin2 = new FileInputStream("D:\\testin2.txt");
		FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
		SequenceInputStream sis = new SequenceInputStream(fin1, fin2);
		int i;
		while ((i = sis.read()) != -1) {
			fout.write(i);
		}

		FileInputStream fin = new FileInputStream("D:\\testout.txt");
		while ((i = fin.read()) != -1) {
			System.out.print((char)i);
		}
		sis.close();
		fout.close();
		fin1.close();
		fin2.close();
		fin.close();
		System.out.println("Success..");
	}
}