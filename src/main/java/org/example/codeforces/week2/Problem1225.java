package org.example.codeforces.week2;

import java.util.HashMap;
import java.util.Scanner;

public class Problem1225 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int d = scanner.nextInt();
            int[] serialNumbers = new int[n];
            for (int j = 0; j < n; j++) {
                serialNumbers[j] = scanner.nextInt();
            }

            HashMap<Integer, Integer> frequencies = new HashMap<>();
            for (int num : serialNumbers) {
                frequencies.put(num, frequencies.getOrDefault(num, 0) + 1);
            }
            int distinctCount = frequencies.size();

            if (k == serialNumbers.length) {
                System.out.println(distinctCount);
                continue;
            }
            int left = 0;
            int right = d - 1;
            while (right < n - 1) {

                int freq = frequencies.get(serialNumbers[left]);
                if (freq - 1 == 0) {
                    frequencies.remove(serialNumbers[left]);
                } else {
                    frequencies.put(serialNumbers[left], freq - 1);
                }
                frequencies.put(serialNumbers[right + 1], frequencies.getOrDefault(serialNumbers[right + 1], 0) + 1);
                if (distinctCount < frequencies.size()) {
                    distinctCount = frequencies.size();
                }
                left++;
                right++;
            }
            System.out.println(distinctCount);
        }

        scanner.close();
    }
}
