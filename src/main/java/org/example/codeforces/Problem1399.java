package org.example.codeforces;

import java.util.Scanner;

public class Problem1399 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            scanner.nextLine();
            int n = scanner.nextInt();
            scanner.nextLine();
            int[] numbers = readArray(scanner, n);
            insertionSort(numbers);
            System.out.println(canArrayBeModifiedToOneElement(numbers));
        }

        scanner.close();
    }

    private static String canArrayBeModifiedToOneElement(int[] numbers) {

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] - numbers[i - 1] > 1) {
                return "NO";
            }
        }
        return "YES";
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {

            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
            }
        }
    }

    private static int[] readArray(
            Scanner scanner,
            int n
    ) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
