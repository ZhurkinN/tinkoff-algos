package org.example.codeforces.week3;

import java.util.Scanner;

public class Problem1328 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            StringBuilder s = new StringBuilder();
            s.append("a".repeat(Math.max(0, n)));
            for (int j = n - 2; j >= 0; j--) {
                if (k <= (n - j - 1)) {
                    s.setCharAt(j, 'b');
                    s.setCharAt(n - k, 'b');
                    System.out.println(s);
                    break;
                }
                k -= (n - j - 1);
            }
        }

        scanner.close();
    }
}
