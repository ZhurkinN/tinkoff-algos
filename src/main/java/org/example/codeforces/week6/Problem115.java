package org.example.codeforces.week6;

import java.util.Arrays;
import java.util.Scanner;

public class Problem115 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] workers = new int[n];
        for (int i = 0; i < n; i++) {
            workers[i] = scanner.nextInt();
        }
        scanner.close();

        int minGroupsCount = 0;
        int[] checked = new int[n];
        Arrays.fill(checked, -1);
        for (int i = 0; i < n; i++) {
            int currentGroups = dfs(workers, i, checked);
            if (currentGroups > minGroupsCount) minGroupsCount = currentGroups;
        }

        System.out.println(minGroupsCount);
    }

    private static int dfs(
            int[] workers,
            int index,
            int[] checked
    ) {
        if (checked[index] >= 0) return checked[index];
        if (workers[index] == -1) return 1;

        int currentGroups = dfs(workers, workers[index] - 1, checked) + 1;
        checked[index] = currentGroups;
        return currentGroups;
    }
}
