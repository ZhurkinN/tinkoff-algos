package org.example.codeforces.week5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem368 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int[] frequencies = new int[n];
        Set<Integer> differentNumbers = new HashSet<>();
        for (int i = n - 1; i >= 0; i--) {
            differentNumbers.add(a[i]);
            frequencies[i] = differentNumbers.size();
        }

        for (int i = 0; i < m; i++) {
            int l = scanner.nextInt();
            System.out.println(frequencies[l - 1]);
        }
        scanner.close();
    }
}

