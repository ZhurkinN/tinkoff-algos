package org.example.codeforces.week1;

import java.util.Scanner;

public class Problem723 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[]{scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        selectionSort(numbers);
        System.out.println(numbers[2] - numbers[0]);

        scanner.close();
    }

    private static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
