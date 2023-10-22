package org.example.codeforces.week1;

import java.util.Arrays;
import java.util.Scanner;

public class Problem160 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int coinsNumber = scanner.nextInt();
        scanner.nextLine();
        int[] coins = readCoinsArray(scanner, coinsNumber);
        mergeSort(coins);
        System.out.println(getMinimalPossibleAmountOfCoins(coins));

        scanner.close();
    }

    private static int getMinimalPossibleAmountOfCoins(int[] coins) {
        int currentSum = 0;
        int coinsSum = Arrays.stream(coins).sum();
        int index = 0;
        while (currentSum <= coinsSum) {
            currentSum += coins[index];
            coinsSum -= coins[index];
            index++;
        }

        return index;
    }

    private static void mergeSort(int[] coins) {
        int size = coins.length;

        if (size < 2) {
            return;
        }

        //split
        int middleIndex = size / 2;
        int[] leftHalfArray = new int[middleIndex];
        int[] rightHalfArray = new int[size - middleIndex];

        System.arraycopy(coins, 0, leftHalfArray, 0, middleIndex);
        if (size - middleIndex >= 0)
            System.arraycopy(coins, middleIndex, rightHalfArray, 0, size - middleIndex);

        mergeSort(leftHalfArray);
        mergeSort(rightHalfArray);

        //merge
        merge(coins, leftHalfArray, rightHalfArray);
    }

    private static void merge(
            int[] inputArray,
            int[] leftHalfArray,
            int[] rightHalfArray
    ) {
        int leftSize = leftHalfArray.length;
        int rightSize = rightHalfArray.length;

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalfArray[i] >= rightHalfArray[j]) {
                inputArray[k] = leftHalfArray[i];
                i++;
            } else {
                inputArray[k] = rightHalfArray[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            inputArray[k] = leftHalfArray[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            inputArray[k] = rightHalfArray[j];
            j++;
            k++;
        }
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
