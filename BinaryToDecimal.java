package com.perscholas.java_basics;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		System.out.println("Enter a binary number without space");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int find = num;
		int count = 0;
		int decimalNumber = 0;
		int mul = 1;

		// To find the count of digits written in binary
		while (find > 0) {
			find = find / 10;
			count++;

		}
		// System.out.println(count);

		// converting to decimal
		for (int i = 1; i <= count; i++) {
			int mod = num % 10;

			// To find the place value for each binary digit
			if (i > 1) {
				for (int j = 0; j < i - 1; j++) {
					mul = mul * 2;
				}
			}
			// System.out.println(mul);
			if (mod == 1 && i == 1)
				decimalNumber = decimalNumber + 1;
			else if (mod == 1)
				decimalNumber = decimalNumber + mul;

			num = num / 10;
			mul = 1;
		}
		System.out.println(decimalNumber);

	}

}
