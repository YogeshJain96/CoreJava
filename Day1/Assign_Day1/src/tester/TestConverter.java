package tester;
import java.util.Scanner;
import com.app.Converter;

class TestConverter{
	public static void main(String[] args) {

		System.out.println("Converting 500 pounds to kg: "+Converter.p2k(500));

		System.out.println("Converting 109 cel 2 farhen: "+Converter.c2f(109));		

		System.out.println("Converting 15200 sec to time: "+Converter.s2h(15200));		
	}
}