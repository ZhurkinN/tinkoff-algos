package org.example.codeforces.week2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Problem580 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int difference = scanner.nextInt();
        int[][] friends = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                friends[i][j] = scanner.nextInt();
            }
        }
        Arrays.sort(friends, Comparator.comparingDouble(a -> a[0]));

        int currentMaxFriendship = 0;
        int friendship = 0;
        int left = 0;
        int right = 0;

        while (left <= right && right < n) {

            if (friends[right][0] - friends[left][0] <= difference) {
                friendship += friends[right][1];
            }

            if (friends[right][0] - friends[left][0] > difference) {
                if (friendship > currentMaxFriendship) {
                    currentMaxFriendship = friendship;
                }
                friendship = 0;
                left++;
            }

            right++;
        }

        System.out.println(currentMaxFriendship);

        scanner.close();
    }

}
