package org.example.codeforces.week2;

import java.util.Scanner;

public class Problem251 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[] points = new int[n];
        for (int i = 0; i < n; i++) {
            points[i] = scanner.nextInt();
        }

        int variants = 0;
        int right = 2;

        for (int left = 0; left < points.length - 2; left++) {
            while (points[right] - points[left] <= d && right < points.length - 1) {
                right++;
            }

            int diff = right - left - 1;
            variants += diff * (diff - 1) / 2;
            right = left + 2;
        }

        System.out.println(variants);
        scanner.close();
    }
}