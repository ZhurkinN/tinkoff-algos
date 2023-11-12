package org.example.codeforces.week3;

import java.util.Scanner;

public class Problem1288 {

    public static final String YES = "YES";
    public static final String NO = "NO";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong();
            long d = scanner.nextLong();

            if (d <= n) {
                System.out.println(YES);
                continue;
            }

            long start = 0;
            long end = n;
            long currentFunctionResult = d;
            while (start < end) {
                long middle = (end + start) / 2;
                long result = function(middle, d);

                if (result <= n) {
                    System.out.println(YES);
                    continue;
                }

                if (result < currentFunctionResult) {
                    end = middle;
                    currentFunctionResult = middle;
                } else start = middle;
            }
            System.out.println(NO);
        }

        scanner.close();
    }

    private static long function(long x, long d) {
        return (long) (x + Math.ceil(d / (x + 1.0)));
    }

}
