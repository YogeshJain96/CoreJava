Array handling
refer -- Java Tut slides No  29
In Java, arrays are full-fledged objects. Like objects, arrays are always stored on the heap. 

Arrays (like any other object) are  associated with the class. All arrays of the same dimension and type have the same class. The length of an array does not play any role in establishing the array's class. For example, an array of three ints has the same class as an array of three hundred ints. The length of an array is considered part of its instance data.

eg : The class name for single dimension array of ints is "[I". The class name for a three-dimensional array of bytes is "[[[B". The class name for single dimension array of booleans is "[Z"

Array size(length) is fixed.Implicit super class of array is java.lang.Object.



Create Array of primitive types

Objective -- Accept no of data samples(double) from User
Create array & display --confirm default values.
Accept data from User(scanner) & store it in suitable array.
Display array data from for loop.
for-each syntax.
Arrays.toString method
eg : Box b;
b=new Box(1,2,3);
eg : class TestPrimArray
{
   psvmain(..)
 { 
    //sc
    sop("How many values to enter ?");
    //create array type of ref var
	double[] data;//ref type var , that can refer to array object , to hold double values .
        data=new double[sc.nextInt()];
//display array contents
 for(int i=0;i<data.length;i++)
   sop(data[i]);
  for(int i=0;i<data.length;i++) {
  sop(....);
   data[i]=sc.nextDouble();
  }
   for(int i=0;i<data.length;i++)
   sop(data[i]);
//for-each --enhanced for loop
  for(double d : data) //d=data[0],d=data[1],....d=data[data.length-1]
    sop(d);
//display array contents using toString'
sop(Arrays.toString(data));

 }

}

for-each limitations
1. Can only iterate from 1st elem to last elem , with step size +1
2. Works on a copy of array elems
(can't be used for modifying array elems).

API --java.util.Arrays
Method 
public static String toString(double[] a)
Returns a string representation of the contents of the specified array.
-----------------------

Array of References

Objective --- Accept from user ,  no of boxes to be made.
Accept box dims from user & display box dims & volume using for-each
Display array contents using Arrays.toString

psvmain(...)
{
 //sc
  sop("How many boxes ?");
//ref type var , that can refer to array object , to hold Box type of refs
  Box[] boxes;
   boxes=new Box[sc.nextInt()];//2
   for(int i=0;i<boxes.length;i++)
  {
    sop("enter box dims ");
    boxes[i]=new Box(....);
  }
//display dims n vol
for(Box b : boxes) //b=boxes[0],b=boxes[1].....{
  b.displyDims();
  sop(b.calcVolume());
}
}
--------------------

Solve 
parameter passing in java



Regarding static keyword 


-------------------------------
Inheritance & Polymorphism
refer to "readme inheritance.txt" from today's help.









