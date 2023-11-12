package org.example.codeforces.week3;

import java.util.Scanner;

public class Problem1183 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            long k = scanner.nextLong();
            long n = scanner.nextLong();
            long a = scanner.nextLong();
            long b = scanner.nextLong();

            long result = -1;

            long start = 0;
            long end = n;

            while (start <= end) {
                long middle = (end + start) / 2;

                long bTimes = n - middle;
                if (k > bTimes * b + middle * a) {
                    result = middle;
                    start = ++middle;
                } else end = --middle;
            }

            System.out.println(result);
        }

        scanner.close();
    }
}
