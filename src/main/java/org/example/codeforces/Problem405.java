package org.example.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Problem405 {

    public static final int MAX_CUBES_IN_COLUMN = 101;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cubesNumber = scanner.nextInt();
        scanner.nextLine();
        int[] cubes = readCoinsArray(scanner, cubesNumber);
        countSort(cubes);
        printCubesAfterChangingGravity(cubes);

        scanner.close();
    }

    private static void countSort(int[] cubes) {
        int[] elementFrequency = new int[MAX_CUBES_IN_COLUMN];

        for (int cube : cubes) {
            elementFrequency[cube]++;
        }

        int j = 0;
        for (int i = 0; i < elementFrequency.length; i++) {
            while (elementFrequency[i] > 0) {
                cubes[j++] = i;
                elementFrequency[i]--;
            }
        }
    }

    private static void printCubesAfterChangingGravity(int[] cubes) {
        System.out.println(String.join(" ", Arrays.stream(cubes)
                .mapToObj(String::valueOf)
                .toArray(String[]::new)));
    }

    private static int[] readCoinsArray(
            Scanner scanner,
            int coinsNumber
    ) {
        int[] coins = new int[coinsNumber];
        for (int i = 0; i < coinsNumber; i++) {
            coins[i] = scanner.nextInt();
        }
        return coins;
    }
}
