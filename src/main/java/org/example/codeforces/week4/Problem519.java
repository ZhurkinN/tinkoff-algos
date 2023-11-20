package org.example.codeforces.week4;

import java.util.Scanner;

public class Problem519 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int count = 0;
        while (n > 0 && m > 0 && n + m >= 3) {
            count++;
            if (n > m) {
                n -= 2;
                m--;
            } else {
                m -= 2;
                n--;
            }
        }

        System.out.println(count);

        scanner.close();
    }
}
