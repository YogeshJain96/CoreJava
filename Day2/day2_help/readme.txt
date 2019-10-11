Assignment status ?????????????

solution for 1st assignment
if(args.length < 2)
 {
 sop(....);
  return;
}
double sum=0;
for(int i=0;i<args.length;i++) 
 sum += Double.parseDouble(args[i]);
sop("Avg="+(sum/args.length));


Revise

Why Java 
How Java gives you Platform independence ?
JDK vs JRE vs JVM

JVM Architecture overview
refer to diagram & its readme in "about_jvm"

Answer this!
Can u write a java class w/o main & compile it ?
Can u write a java class w/o main & run it ?
What are valid access specifiers for members(data members & methods)?
Which are applicable to classes ?

Can a java src file contain multiple default classes ?
Can a java src file contain multiple public  classes ?
Any rules regarding def class name & src file name ?
Any rules regarding public class name & src file name ?

--------------------------
Rules for defining Java Identifiers

Valid identifiers for java & other languages like C,C++ are

1. The legal characters for identifiers are all alphanumeric characters([A-Z],[a-z],[0-9]), ‘$‘(dollar sign) and ‘_‘ (underscore).

2. Identifiers should not start with digits([0-9]), can start with a letter or _.

3. Java identifiers are case-sensitive.
4. There is no limit on the length of the identifier
5. Reserved Words can’t be used as an identifier. 

-------------------------
Revise 
Java Data Types ---primitive & ref type
Automatic or widening Conversions vs narrowing conversions(type casting)

Solve
String s;
System.out.println(s);//err
String ss ="abc";
ss+=10;//ss = ss+10
System.out.println(ss);//abc10
ss++;//err
byte b1=12;
short s=b1;
byte b2=10;
byte b3=5;
byte b4=b1+b3;//err
b4 += 10;
float f1=5.67;//err
double d=f1;
long l1=f1;//err
int count=10;
if(count) //err
 System.out.println("yes");
else 
System.out.println("no");
long l=12345;
l=l/2;
b2=b2/2;//err
short s2=10; 
s2 = s2 * 2;//err	
System.out.println(11/2);
System.out.println(11.0f/2);
System.out.println(11.0/2);
char ch='A';
System.out.println(ch);
ch=66;
System.out.println(ch);
------------------------------------------

Ref : regarding class n object
Continue with day1's readme.

--------------------------
Regarding Packages
refer to its readme.
Solve :
Create a  Rectangle class under "com.cdac.shapes" package.

Add data members --  x,y,widht,height.
Create a  rectangle with x & y with default values 0 , supply only width & height
Create a default constructor with all values set to -1
Add a constr to accept all i/ps from user.

Create a class TestRect to test rectangle --
under pkg -- "com.tester"

How to load classes from day2\bin,day3\bin, day4\bin


Access specifiers

Array handling
refer -- Java Tut slides 29

Array of primitive types
-------------------

Objective -- Accept no of data samples(double) from User
Create array & display --confirm default values.
Accept data from User(scanner) & store it in suitable array.
Display array data from for loop.
for-each syntax.


Array of References

Objective --- Accept from user ,  no of boxes to be made.
Accept box dims from user & display box dims volume using for-each


