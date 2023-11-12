package org.example.codeforces.week3;

import java.util.Scanner;

public class Problem1217 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            long str = scanner.nextInt();
            long intellect = scanner.nextInt();
            long exp = scanner.nextInt();

            long expForStr = exp;
            int builds = 0;

            if (str + exp <= intellect) {
                System.out.println(builds);
                continue;
            }

            while (expForStr >= 0
                    && str + expForStr > intellect + exp - expForStr) {
                builds++;
                expForStr--;
            }
            System.out.println(builds);
        }

        scanner.close();
    }
}
