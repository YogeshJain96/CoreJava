package com.app.core;
public class Box 
{
	//state --non static instance vars (fields)
	//heap
	private double width,depth,height;
	//parameterized constr
	public Box(double w,double d,double height)
	{
		width=w;
		depth=d;
		//this -- to resolve conflict between local vs instance car
		this.height=height;
	}
	//To display box dimensions (void returning)
	public void displayDims()
	{
		System.out.println("Box Dims are : "+width+" "+depth+" "+height);
	}
	//To fetch box dimensions (string returning)
	public String fetchDims()
	{
		return "Fetched Box Dims are : "+width+" "+depth+" "+height;
	}
	//To compute volume of a box & return computed volume.
	public double calcVolume()
	{
		return width*depth*height;
	}
	//add a setter n getter for width
	public void setWidth(double width)
	{
		this.width=width;
	}
	public double getWidth()
	{
		return width;
	}
}
