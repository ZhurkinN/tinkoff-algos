package org.example.codeforces.week6;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1490 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] permutation = new int[n];
            for (int j = 0; j < n; j++) {
                permutation[j] = scanner.nextInt();
            }

            int[] results = new int[n];
            Arrays.fill(results, 0);
            dfs(0, n - 1, permutation, results, 0);
            for (int k : results) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        scanner.close();
    }

    private static void dfs(
            int firstIndex,
            int secondIndex,
            int[] permutation,
            int[] results,
            int currentDepth
    ) {
        if (firstIndex == secondIndex) {
            results[firstIndex] = currentDepth;
            return;
        }
        int maxIndex = getArraysIntervalMaximumsIndex(permutation, firstIndex, secondIndex);
        results[maxIndex] = currentDepth;

        if (maxIndex != firstIndex) {
            dfs(firstIndex, maxIndex - 1, permutation, results, currentDepth + 1);
        }
        if (maxIndex != secondIndex) {
            dfs(maxIndex + 1, secondIndex, permutation, results, currentDepth + 1);
        }
    }

    private static int getArraysIntervalMaximumsIndex(
            int[] array,
            int firstIndex,
            int secondIndex
    ) {
        int max = array[firstIndex];
        int maxIndex = firstIndex;
        for (int i = firstIndex + 1; i <= secondIndex; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
