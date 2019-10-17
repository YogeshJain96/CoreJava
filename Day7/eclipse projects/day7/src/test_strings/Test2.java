package test_strings;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		String s1=new String("hello");
		String s2=new String(s1);
		String s3=null;
		Scanner sc=new Scanner(System.in);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(sc));
		sc.close();

	}

}
