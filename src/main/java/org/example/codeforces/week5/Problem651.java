package org.example.codeforces.week5;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem651 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        scanner.close();

        Set<Integer> results = new HashSet<>();
        getResult(a1, a2, results, 0);
        System.out.println(results.stream().max(Comparator.naturalOrder()).orElse(0));
    }

    private static void getResult(int a1, int a2, Set<Integer> results, int count) {
        results.add(count);
        count++;

        if (a1 <= 0 || a2 <= 0) {
            return;
        }
        if (a1 >= a2) {
            if (a1 > 1) {
                a1 -= 2;
                a2 += 1;
                getResult(a1, a2, results, count);
            }
        } else {
            a2 -= 2;
            a1 += 1;
            getResult(a1, a2, results, count);
        }
    }
}