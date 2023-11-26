package org.example.codeforces.week4;

import java.util.Arrays;
import java.util.Scanner;

public class Problem545 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long[] times = new long[n];
        for (int i = 0; i < n; i++) {
            times[i] = scanner.nextLong();
        }

        Arrays.sort(times);
        long count = 0;
        long result = 0;
        for (int i = 0; i < n; i++) {

            while (i < n && times[i] < count) {
                i++;
            }

            if (i < n) {
                result++;
                count += times[i];
            }
        }

        System.out.println(result);
        scanner.close();
    }
}
