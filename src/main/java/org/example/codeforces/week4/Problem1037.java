package org.example.codeforces.week4;

import java.util.Scanner;

public class Problem1037 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        char[] a = scanner.nextLine().toCharArray();
        char[] b = scanner.nextLine().toCharArray();

        int price = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) {

                if (a[i + 1] != b[i + 1]) {
                    i++;
                }
                price++;
            }
        }

        System.out.println(price);

        scanner.close();
    }
}
