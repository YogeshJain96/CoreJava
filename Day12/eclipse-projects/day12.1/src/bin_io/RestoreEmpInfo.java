package bin_io;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.Scanner;

public class RestoreEmpInfo {

	public static void main(String[] args) {
		System.out.println("Enter bin file name to read emp info");
		try (Scanner sc = new Scanner(System.in);
				DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(sc.nextLine())))) {
			Emp e = new Emp(in.readInt(), in.readUTF(), in.readDouble());
			System.out.println(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
