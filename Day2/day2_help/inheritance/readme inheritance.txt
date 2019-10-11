Regarding inheritance

In OOP, we often organize classes in hierarchy to avoid duplication and reduce redundancy. The classes in the lower hierarchy inherit all the variables (attributes) and methods (dynamic behaviors) from the higher hierarchies. 

A class in the lower hierarchy is called a subclass (or derived, child, extended class). A class in the upper hierarchy is called a superclass (or base, parent class). 

By pulling out all the common variables and methods into the superclasses, and leave the specialized variables and methods in the subclasses, redundancy can be greatly reduced or eliminated as these common variables and methods do not need to be repeated in all the subclasses. Re usability is maximum.

A subclass inherits all the member variables and methods from its superclasses (the immediate parent and all its ancestors). It can use the inherited methods and variables as they are. It may also override an inherited method by providing its own version, or hide an inherited variable by defining a variable of the same name.

Summary : Sub class IS-A super class , and something more (additional state + additional methods) and something modified(behaviour --- method overriding)

eg :

Person -- firstName,lastName
Student --firstName,lastName,grad year
Faculty -- firstName,lastName,yrs of experience , sme

OR

Emp-Mgr-SalesMgr scenario.

OR

Fruit -- Apple -- FujiApple


A subclass inherits all the variables and methods from its superclasses, including its immediate parent as well as all the ancestors. 

It is important to note that a subclass is not a "subset" of a superclass. In contrast, subclass is a "superset" of a superclass. It is because a subclass inherits all the variables and methods of the superclass; in addition, it extends the superclass by providing more variables and methods.


Inheritance --- generalization ----> specialization. 

IS A Relationship. 

Why -- code re usability.

super class ---base class
sub class --derived class

keyword --extends 

sub class IS A super class and something added(additonal state + additional behaviour) and something modified(behaviour ---method overriding)

Types of inheritance 
1. single inheritance ---
class A{...} class B extends A{...}
2. multi level inhertance 
class A{...} class B extends A{...} class C extends B{...}
3. multiple inhertiance --- NOT supported
class A extends B,C{...}  -- compiler err

Why --For simplicity.

(Diamond problem)

We have two classes B and C inheriting from A. Assume that B and C are overriding an inherited method and they provide their own implementation. Now D inherits from both B and C doing multiple inheritance. D should inherit that overridden method.  BUT which overridden method will be used? Will it be from B or C? Here we have an ambiguity.




Constructor invocations in inheritance hierarchy -- single & multi level.

eg -- Based on class A -- super class & B its sub class.
Further extend it by class C as a sub-class of B.


super keyword usage
1. To access super class's visible members
2. To invoke immediate super class's matching constructor --- accessible only from sub class constructor.(super(...))

eg -- Person,Student,Faculty 
Emp,Manager,SalesManager
Shape, Circle,Rectangle
LoanAccount,HomeLoanAccount,VehicleLoanAccount,
Student,GradStudent,PostGradStudent

eg :
Person -- firstName,lastName
Student --firstName,lastName,grad year
Faculty -- firstName,lastName,yrs of experience , sme

Add the functionality to show individual details.



Regarding this & super

1. Only a constr can use this() or super()
2. Has to be 1st statement in the constr
3. Any constructor can never have both ie. this() & super()
4. super & this (w/o brackets) are used to access (visible) members of super class or the same class.


Polymorphism ---one functionality --multiple (changing) forms
1. static -- compile time --early binding ---resolved by javac.

Achieved via method overloading

rules -- can be in same class or in sub classes.
same method name
signature -- different (no/type/both)
ret type --- ignored by compiler.

eg --- void test(int i,int j){...}
void test(int i) {..}
void test(double i){..}
void test(int i,double j,boolean flag){..}
int test(int a,int b){...}   



RULE -- when javac doesn't find exact match --tries to resolve it by the closest arg type(just wider than the specified arg)


solve --- EasyOver.java
(More interesting examples after boxing & var-args)


2. Dynamic polymorphism --- late binding --- dynamic method dispatch ---resolved by JRE.
Dynamic method dispatch -- which form of method to send for execution ---This decision can't be taken by javac --- BUT taken by JRE
Achieved via -- method overriding

Method Overriding --- Means of achieving run-time polymorphism

NO "virtual" keyword in java.

All java methods can be overridden : if they are not marked as private,static,final

Super-class form of method - --- overridden method

sub-class form --- overriding form of the method

Rules : to be followed by overriding method in a sub-class

1. same method name, same signature, ret type must be same or its sub-type(co-variance)
eg of co-variance
class A {
    A getInstance()
	{
                    return new A();
	}
}

class B extends A
{
    B getInstance()
	{
                    return new B();
	}
}

2. scope---must be same or wider.

3. Will be discussed in exeception handling.
Can not add in its throws clause any new or broader checked exceptions.
BUT can add any new unchecked excs.
Can add any subset or sub-class of checked excs.
class A
{
  void show() throws IOExc
  {...}
}
class B extends A
{
  void show() throws Exc
  {...}
}
Can't add super class of the checked excs.

example of run time polymorphism -- Car & its sub classes.


From JDK 1.5 onwards : Annoations are available --- metadata meant for Compiler or JRE.(Java tools)

Java Annotation is a tag that represents the metadata i.e. attached with class, interface, methods or fields to indicate some additional information which can be used by java compiler and JVM.

Annotations in java are used to provide additional information, so it is an alternative option for XML.

eg @Override,@Deprecated,@SuppressWarnings,@FunctionalInterface





@Override --
Annotation for javac
While overridng the method --- if u want to inform the compiler that : following is the overriding form of the method use :
@Override
method declaration

Run time polymorphism or Dynamic method dispatch in detail

Super -class ref. can directly refer to sub-class object(direct=w/o type casting) as its the example of up-casting(similar to widening auto. conversion) . 
When such a super class ref is used to invoke the overriding method: which form of the method to send for execution : this decision is taken by JRE & not by compiler. In such case --- overriding form of the method(sub-class version) will be dispatched for exec.

Super -class ref. can directly refer to sub-class inst BUT it can only access the members declared in super-class -- directly.


eg : A ref=new B(); ref.show()  ---> this will invoke the sub-class: overriding form of the show () method
----------------------------------------------
Applying inheritance & polymorphism 
java.lang.Object --- Universal super class of all java classes including arrays.

Object class method
public String toString() ---Rets string representation of object.
Returns --- Fully qualified class Name @ hash code
hash code --internal memory representation.(hash code is mainly used in hashing based data structures -- will be done in Collection framework)

Why override toString?
To replace hash code version by actual details of any object.

eg -- Use it in  sub classes. (override toString to display Account or Point2D or Emp details)


Object class method
public boolean equals(Object o)
Returns true --- If 'this' (invoker ref) & o ---refers to the same object(i.e reference equality) i.e this==o , otherwise returns false.

Need of overriding equals method ?
To replace reference  equality by content equality , based upon prim key criteria.

eg : In Car scenario 
(Primary key -- int registration no)


Objective ---Applying inheritance & polymorphism to organization scenario

Emp based org structure --- Emp , Mgr , Worker

Emp state--- id(primary key), name, deptId , basic
system generated ID (auto increment)
Behaviour --- get emp details -- via toString

Mgr state  ---id,name,basic,dept,perfBonus
Behaviour ----get mgr details, compute net salary (formula: basic+perfBonus)
& get performance bonus.


Worker state  ---id,name,basic,dept, hoursWorked,hourlyRate
Behaviour--- get worker details, compute net salary (formula:  = basic+(hrs*rate)
get hrlyRate of the worker  


Design classes based on above info.

Create a tester to create org structure --- m1,w1,m2,w2


Use single for-each loop Display emp info & net sal.

From same for-each loop display mgr's bonus or worker's rate



instanceof -- keyword in java --used for testing run time type information


eg ---
Emp e =new Mgr(...);
if (e instanceof Mgr) ---rets true iff e --->Mgr obj
if (e instanceof Worker) ---rets true iff e --->Worker obj
if (e instanceof Emp)   

As an extension , take above code , attach scanner , accept emp details from user & test it.


Anything "not so object oriented" about Emp , Mgr & worker hierarchy? 



abstract : keyword in Java
abstract methods ---methods only with declaration & no definition
eg : public abstract double calNetsalry();

Any time a class has one or multilple abstract methods ---- class must be declared as abstract class.
eg. public abstract class Emp {....}

Abstract classes can't be instantiated BUT can create the ref. of abstract class type to refer to concrete sub-class instances.
Emp e1=new Emp(...);//illegal
Emp e1=new Mgr(....);//legal


Abstract classes CAN HAVE concrete(non-abstract) methods.


Abstract classes MUST provide constructor/s to init its own private data members.

Can a class be decalred as abstract & final ? NO 

Can an abstract class be crerated with 100% concrete functionality?
Yes 
eg --- Event adapter classes

Use "abstract" keyword in Emp , Mgr ,Worker hierarchy & test it
final  -- keyword in java 

Usages

1 final data member(primitive types) - constant.
eg -- public final int data=123;

2. final methods ---can't be overridden.
usage eg public final void show{.....}
eg -- Object class -- wait , notify ,notifyAll

3. final class --- can't be sub-classed(or extended) -- i.e stopping inheritance hierarchy.
eg -- String ,StringBuffer,StringBuilder

4. final reference -- references can't be re-assigned.
eg -- final Emp e=new Mgr(.......);
         e=new Worker(.....);//compiler err

--------------------
Special note on  protected 

Protected members acts as default scope within the same package.
BUT outside pkg -- a sub-class can access it through inheritance(i.e just inherits it directly)  & CANT be accessed by creating super class instance.
