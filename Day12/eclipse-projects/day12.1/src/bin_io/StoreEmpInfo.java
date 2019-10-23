package bin_io;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class StoreEmpInfo {

	public static void main(String[] args) {
		System.out.println("Enter file name to store emp info");
		try (Scanner sc = new Scanner(System.in);
				// buffering , conversion ,bin file
				DataOutputStream out = new DataOutputStream(
						new BufferedOutputStream(new FileOutputStream(sc.nextLine())))) {
			System.out.println("Enter emp details id nm sal");
			Emp e = new Emp(sc.nextInt(), sc.next(), sc.nextDouble());
			//id
			out.writeInt(e.getId());
			//nm
			out.writeUTF(e.getName());
			//sal
			out.writeDouble(e.getSalary());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
