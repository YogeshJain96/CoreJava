package tester;

import fruits.Cherry;
import fruits.Fruit;
import fruits.Orange;

public class TestFruits2 {

	public static void main(String[] args) {
		Fruit f=new Orange();//up casting
		f.taste();//run time poly.
		((Orange)f).juice();//down casting Fruit ---> Orange
		f=new Cherry();//up casting
		System.out.println(f);//  fruits.Cherry @ hashcode
		((Cherry)f).squash();
		((Orange)f).juice();

	}

}
