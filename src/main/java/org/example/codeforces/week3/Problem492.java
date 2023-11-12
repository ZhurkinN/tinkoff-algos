package org.example.codeforces.week3;

import java.util.Arrays;
import java.util.Scanner;

public class Problem492 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int l = scanner.nextInt();
        int[] lanterns = new int[n];
        for (int i = 0; i < n; i++) {
            lanterns[i] = scanner.nextInt();
        }

        System.out.println(getMaxRadius(lanterns, l));
        scanner.close();
    }

    private static double getMaxRadius(int[] lanterns, int l) {
        Arrays.sort(lanterns);
        double maxRadius = Math.max(lanterns[0], l - lanterns[lanterns.length - 1]);
        for (int i = 1; i < lanterns.length; i++) {
            double diff = (lanterns[i] - lanterns[i - 1]) / 2.0;
            if (diff > maxRadius) maxRadius = diff;
        }
        return maxRadius;
    }
}
