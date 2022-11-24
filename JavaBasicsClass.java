package com.perscholas.java_basics;

public class JavaBasicsClass {

	public static void main(String[] args) {
		int a,b;
		a=10;
		b=100;
		int intSum = a+b;
		System.out.println("The sum of two integers " + a+", "+b+" is "+intSum);
		
		double c,d,doubleSum;
		c=1.4;
		d=20.5555;
		doubleSum=c+d;
		System.out.println("The sum of two double " + c+", "+d+" is "+doubleSum);
		
		double intDoubleSum;
		intDoubleSum=a+c;
		
		//If we have a integer variable concatenated to other strings in print statement, it is also considered as string
		System.out.println("The sum of one integer " +a+ " and one double number" +c +" is "+ a+c);
		System.out.println("The actual answer is here " +intDoubleSum);
		
		//if we are dividing a decimal with a integer, the data type of the variable that we store the value should be in double
		double divide;
		divide=d/a;
		System.out.println("The result of double divided by a integer " +divide);
		
		
		divide = d/c;
		System.out.println("The result of double divided by a double "+divide+" and then casted as integer "+ (int)divide);
		
		//Write a program that declares two integer variables, x, and y, 
		//and assigns 5 to x and 6 to y. Declare a variable q and assign y/x to it and print q. Now, 
		//cast y to a double and assign it to q. Print q again.
		int x=6,y=6;
		double q;
		q=y/x;
		System.out.println(q);
		q=(double)y;
		System.out.println(q);
		
		final double pi=3.14;
		int radius=3;
		double areaOfCircle;
		areaOfCircle=pi*radius*radius;
		System.out.println("Calculation made with final variable "+areaOfCircle);
		
		double coffee,tea,cookie,subTotal,totalSale;
		final double SALES_TAX=0.08;
		
		coffee = 2.4;
		tea = 1.4;
		cookie = 3;
		subTotal=(3*coffee)+(4*tea)+(2*cookie);
		totalSale=subTotal*SALES_TAX;
		System.out.println("The total sale is "+ String.format("%.2f", totalSale));
		
		
	}

}
