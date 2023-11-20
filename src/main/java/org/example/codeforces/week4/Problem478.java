package org.example.codeforces.week4;

import java.util.Scanner;

public class Problem478 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long m = scanner.nextLong();

        findFriendPairs(n, m);

        scanner.close();
    }

    private static void findFriendPairs(long n, long m) {
        if (m == 1) {
            long pairs = findPairs(n - 1);
            System.out.println(pairs + " " + pairs);
            return;
        }

        System.out.println(findMin(n, m) + " " + findMax(n, m));
    }

    private static long findMin(long n, long m) {
        long result = 0;
        long div = n / m;
        long mod = n % m;
        result += findPairs(div) * mod;
        result += findPairs(div - 1) * (m - mod);

        return result;
    }

    private static long findMax(long n, long m) {
        return findPairs(n - m);
    }

    private static long findPairs(long total) {
        return (total * (total + 1)) / 2;
    }
}
