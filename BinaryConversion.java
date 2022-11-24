package com.perscholas.java_basics;

import java.util.Scanner;

public class BinaryConversion {
	public static void findBinary(int num) {
		
		//find the size of the array
		int findSizeOf = num;
		int count = 0;

		while (findSizeOf >= 1) {
			findSizeOf = findSizeOf / 2;
			count++;
		}
		
		//initializing variables
		int[] ans = new int[count];
		int mod;
		int i = 0;
		
		//finding binary using modulus operator
		while (num >= 1) {
			mod = num % 2;
			ans[i] = mod;
			num = num / 2;
			i++;
		}
		for (int j = count-1; j >= 0; j--) {
			System.out.print(ans[j]);
		}

	}

	public static void main(String[] args) {
		System.out.println("Enter a number to convert it to binary");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		findBinary(num);

	}

}
