package org.example.codeforces.week5;

import java.util.Scanner;

public class Problem1323 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }

            int evenNumberIndex = -1;
            int oddNumberIndex = -1;
            for (int j = 0; j < n; j++) {
                if (a[j] % 2 == 0) {
                    evenNumberIndex = j;
                    break;
                }
                if (j != 0 && a[j - 1] % 2 != 0) {
                    oddNumberIndex = j - 1;
                    break;
                }
            }
            int result = -1;
            if (evenNumberIndex >= 0) {
                System.out.println(1);
                result = ++evenNumberIndex;
            } else if (oddNumberIndex >= 0) {
                System.out.println(2);
                System.out.println(++oddNumberIndex + " " + ++oddNumberIndex);
                continue;
            }
            System.out.println(result);
        }
    }
}
