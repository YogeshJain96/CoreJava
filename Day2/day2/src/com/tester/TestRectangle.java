package com.tester;
import com.cdac.shapes.*;
class TestRectangle 
{
	public static void main(String[] args) 
	{
		//1st constr
		Rectangle r1=new Rectangle(10,20,5,15);
		//2nd constr
		Rectangle r2=new Rectangle(40,50);
		//3rd constr 
		Rectangle r3=new Rectangle();
		r1.display();
		r2.display();
		r3.display();
	}
}
