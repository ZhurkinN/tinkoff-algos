package org.example.codeforces.week5;

import java.util.Scanner;

public class Problem363 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] fences = new int[n];
        for (int i = 0; i < n; i++) {
            fences[i] = scanner.nextInt();
        }
        scanner.close();

        int j = 0;
        int currentResult = 0;
        int resultIndex = 0;
        while (j < k) {
            currentResult += fences[j++];
        }

        int minResult = currentResult;
        for (int i = k; i < n; i++) {
            currentResult = currentResult - fences[i - k] + fences[i];
            if (currentResult < minResult) {
                minResult = currentResult;
                resultIndex = i - k + 1;
            }
        }

        System.out.println(resultIndex + 1);
    }
}
