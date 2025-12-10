package com.screening;

import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scan.nextInt();
        int odd = 0;
 
        if (a % 2 == 0) {
        		odd = --a;
        }else {
        		odd = a;
        }

        for (int i = 1, count = 0; count < odd; i += 2, count++) {
            System.out.print(i + (count < (odd - 1) ? ", " : ""));
        }
        
    }
}
