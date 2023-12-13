package org.example.codeforces.week5;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem753 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        List<Integer> results = new ArrayList<>();
        int currentCandy = 1;
        int result = 0;
        while (result + currentCandy <= n) {
            results.add(currentCandy);
            result += currentCandy++;
        }
        int diff = n - result;
        if (diff > 0) {
            int last = results.get(results.size() - 1);
            results.remove(results.size() - 1);
            results.add(last + diff);
        }

        System.out.println(results.size());
        for (int i : results) {
            System.out.print(i + " ");
        }
    }
}