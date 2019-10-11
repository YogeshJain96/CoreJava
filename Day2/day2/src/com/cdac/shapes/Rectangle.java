package com.cdac.shapes;
public class Rectangle 
{
	//D.M --state
	private int x,y,width,height;
	public Rectangle(int x,int y,int w,int h)
	{
		this.x=x;
		this.y=y;
		width=w;
		height=h;
	}
	//overloaded constr --w ,h
	public Rectangle(int w,int h)
	{
	/*	x=y=0;
		width=w;
		height=h;*/
		this(0,0,w,h);

	}
	public Rectangle()
	{
		this(-1,-1,-1,-1);
		//this(0,0);
	}
	public void display()
	{
		 System.out.println("Rect : "+x+" "+y+" "+width+" "+height);
	}

}
