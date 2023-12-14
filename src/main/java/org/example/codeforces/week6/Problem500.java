package org.example.codeforces.week6;

import java.util.Scanner;

public class Problem500 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] transportSystem = new int[n];
        for (int i = 1; i < transportSystem.length; i++) {
            transportSystem[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println(
                dfs(transportSystem, t, 1) == t ? "YES" : "NO"
        );
    }

    private static int dfs(
            int[] transportSystem,
            int t,
            int current
    ) {
        if (current >= t) {
            return current;
        }

        current += transportSystem[current];
        return dfs(transportSystem, t, current);
    }
}
