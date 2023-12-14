package org.example.codeforces.week6;

import java.util.Scanner;

public class Problem1255 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            int price = 0;
            for (int j = 0; j < n; j++) {
                price += scanner.nextInt();
            }

            if (n != m || n < 3) {
                System.out.println(-1);
                continue;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(2 * price).append("\n").append(n).append(" ").append(1);
            for (int j = 1; j < n; j++) {
                sb.append("\n").append(j).append(" ").append(j + 1);
            }

            System.out.println(sb);
        }

        scanner.close();
    }
}
