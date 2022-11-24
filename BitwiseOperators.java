package com.perscholas.java_basics;
import java.lang.*;

public class BitwiseOperators {

	public static void main(String[] args) {
		Integer x=2;
		System.out.println(Integer.toBinaryString(x));
		x= x<<1;
		//predicted binary value 100 and decimal value 4
		System.out.println(x);
		
		Integer y=150;
		System.out.println(Integer.toBinaryString(y));
		y= y>>2;
		//predicted binary value 100101 and decimal value 37
		System.out.println(y);
		
		Integer a=7,b=17,z;
		
		//a=7  0000 0111
		//b=17 0001 0001
		//and  0000 0001
		//or   0001 0111
		
		z= a & b;
		
		//prediction for and decimal value is 1
		System.out.println(z);
		
		z=a|b;
		//prediction for or decimal value is 23
		System.out.println(z);
	}

}
