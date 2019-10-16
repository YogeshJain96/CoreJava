package co_variance;

public class Fruit {
}
class Mango extends Fruit {}

class A 
{
	Fruit getFruit()
	{
	  return new Fruit();
	}
}
class B extends A
{
	//co variant return type
	@Override
	public Mango getFruit()
	{
		return new Mango();
	}
}