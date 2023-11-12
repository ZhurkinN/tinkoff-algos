package org.example.codeforces.week3;

import java.util.Scanner;

public class Problem1352 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            long n = scanner.nextInt();
            long k = scanner.nextInt();

            long r = (k - 1) / (n - 1);
            System.out.println(k + r);

        }

        scanner.close();
    }
}
