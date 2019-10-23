package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class BufferedFileCopy {

	public static void main(String[] args) {
		System.out.println("Enter src n dest file names on separate lines");
		try(Scanner sc=new Scanner(System.in);
				//BR -- buf char i/p strm reading data from text file
				BufferedReader br=new BufferedReader(new FileReader(sc.nextLine()));
				//pw -- buf char o/p strm to write data to text file
				PrintWriter pw=new PrintWriter(new FileWriter(sc.nextLine()))
				)
		{
			String s=null;
			while((s=br.readLine())!= null)
				pw.println(s);
			System.out.println("file copy over....");
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
