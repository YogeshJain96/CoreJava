// 2. Create a class Calculator with 2 private double data members firstNumber & secondNumber.
// Supply getters & setters.
// Add 4 instance methods add,subtract,multiply & divide , without parameters , to return result of calculation.
// Divide method should return 0 in case of 0 denominator.
// Create a TestCalculator class with scanner.
// Accept 2 numbers from user & set them in Calculator.
// Menu 1: Add
// 2 : Subtract 
// 3 : Multiply
// 4 : Divide
// 5 :Exit.
package com.app;

public class Calculator{
		
		private double firstNumber;
		private double secondNumber;	
		

		public void setFirst(double n){
			firstNumber=n;
		}

		public void setSecond(double n){
			secondNumber=n;
		}

		public double getFirst(){
			return firstNumber;
		}
		public double getSecond(){
			return secondNumber;
		}

		public void Display(){
			System.out.println("You Entered\nFirstNum="+firstNumber+"\nSecond="+secondNumber);
		}

		public double Add(){
			return getFirst()+getSecond();
		}

		public double Subtract(){
			return getFirst()-getSecond();
		}
		public double Multiply(){
			return getFirst()*getSecond();
		}
		public double Divide(){
			if(getSecond()!=0)
				return getFirst()/getSecond();
			else
			{
				System.out.println("Enter 2nd Num non Zero");
				return 0 ;
			}
		}
}