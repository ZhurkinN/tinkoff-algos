package org.example.codeforces.week6;

import java.util.Scanner;

public class Problem1433 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] gangs = new int[n];
            gangs[0] = scanner.nextInt();

            boolean impossible = true;
            for (int j = 1; j < n; j++) {
                gangs[j] = scanner.nextInt();
                if (gangs[j] != gangs[j - 1]) impossible = false;
            }

            if (impossible) {
                System.out.println("NO");
                continue;
            } else System.out.println("YES");

            int groveStreet = gangs[0];
            int ballasStreetAddress = 0;
            for (int j = 1; j < n; j++) {
                if (gangs[j] != groveStreet) {
                    int res = j + 1;
                    System.out.println(1 + " " + res);
                    ballasStreetAddress = j + 1;
                }
            }
            for (int j = 1; j < n; j++) {
                if (gangs[j] == groveStreet) {
                    int res = j + 1;
                    System.out.println(ballasStreetAddress + " " + res);
                }
            }
        }
        scanner.close();
    }
}
