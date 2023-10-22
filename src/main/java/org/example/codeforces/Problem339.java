package org.example.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Problem339 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        int[] numbers = Arrays.stream(inputString.split("\\+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        quickSort(numbers, 0, numbers.length - 1);
        System.out.println(getResultStatement(numbers));

        scanner.close();
    }

    private static void quickSort(
            int[] array,
            int lowIndex,
            int highIndex
    ) {

        if (lowIndex >= highIndex || array.length == 1) {
            return;
        }

        int pivot = array[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {

            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swapElements(array, leftPointer, rightPointer);
        }

        swapElements(array, leftPointer, highIndex);

        quickSort(array, lowIndex, leftPointer - 1);
        quickSort(array, leftPointer + 1, highIndex);
    }

    private static void swapElements(
            int[] array,
            int index1,
            int index2
    ) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static String getResultStatement(int[] numbers) {
        return String.join("+", Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new));
    }
}
