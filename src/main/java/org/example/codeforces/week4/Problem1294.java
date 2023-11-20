package org.example.codeforces.week4;

import java.util.Scanner;

public class Problem1294 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong();
            long first = 0;
            long second = 0;
            for (long j = 2; j <= Math.sqrt(n); j++) {
                if (n % j == 0) {
                    first = j;
                    n /= j;
                    break;
                }
            }
            for (long j = 2; j <= Math.sqrt(n); j++) {
                if (n % j == 0 && j != first) {
                    second = j;
                    n /= j;
                    break;
                }
            }

            if (first == 0 || second == 0 || n == 1 || n == second || n == first) {
                System.out.println("NO");
                continue;
            }
            StringBuilder sb = new StringBuilder("YES");
            sb.append("\n")
                    .append(first)
                    .append(" ")
                    .append(second)
                    .append(" ")
                    .append(n);
            System.out.println(sb);
        }

        scanner.close();
    }
}
