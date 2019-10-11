class Box 
{
	//state --non static instance vars (fields)
	//heap
	private double width,depth,height;
	//parameterized constr
	Box(double w,double d,double height)
	{
		width=w;
		depth=d;
		//this -- to resolve conflict between local vs instance car
		this.height=height;
	}
	//To display box dimensions (void returning)
	void displayDims()
	{
		System.out.println("Box Dims are : "+width+" "+depth+" "+height);
	}
	//To fetch box dimensions (string returning)
	String fetchDims()
	{
		return "Fetched Box Dims are : "+width+" "+depth+" "+height;
	}
	//To compute volume of a box & return computed volume.
	double calcVolume()
	{
		return width*depth*height;
	}
}
