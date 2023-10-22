package org.example.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Problem723 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[]{scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        Arrays.sort(numbers);
        System.out.println(numbers[2] - numbers[0]);

        scanner.close();
    }
}
