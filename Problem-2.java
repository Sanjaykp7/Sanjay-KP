package com.screening;
import java.util.*;
public class Problem2 {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a: ");
		int a = scan.nextInt();
		
		for (int i = 1, count = 0; count < a; i += 2, count++) {
		    System.out.print(i + (count < (a - 1) ? ", " : ""));
		}		
	}

}
