package org.example.codeforces.week2;

import java.util.Scanner;

public class Problem279 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] books = new int[n];
        for (int i = 0; i < n; i++) {
            books[i] = scanner.nextInt();
        }
        scanner.close();

        int currentMax = 0;
        int left = 0;
        int right = 0;
        int sum = 0;

        while (left <= right && right < n) {

            sum += books[right];

            if (sum <= t && right - left + 1 > currentMax) {
                currentMax = right - left + 1;
            }

            if (sum > t) {
                sum -= books[left];
                left++;
            }

            right++;
        }

        System.out.println(currentMax);
    }
}
