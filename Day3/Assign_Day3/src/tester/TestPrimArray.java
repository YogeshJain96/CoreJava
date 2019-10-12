package tester;
import java.util.*;
class TestPrimArray
{
  public static void main(String[] args) {
  //sc
  Scanner sc=new Scanner(System.in);

  System.out.println("How many values to enter ?");
  
  //create array type of ref var
	double[] data;//ref type var , that can refer to array object , to hold double values .
  data=new double[sc.nextInt()];
  
  //display array contents
  for(int i=0;i<data.length;i++)
    System.out.println(data[i]);
  
  //Storing Data from the user
  for(int i=0;i<data.length;i++) {
    System.out.println("Enter "+(i+1)+" element:");
    data[i]=sc.nextDouble();
  }
  
  //display array contents
  for(int i=0;i<data.length;i++)
    System.out.print(data[i]+" ");
 
 System.out.println();

  //for-each --enhanced for loop
  for(double d : data) //d=data[0],d=data[1],....d=data[data.length-1]
    System.out.println(d);

  //display array contents using toString
  System.out.println(Arrays.toString(data));

 }

}