package org.example.codeforces.week2;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1251 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stringsNumber = scanner.nextInt();

        for (int i = 0; i < stringsNumber; i++) {
            char[] stringChars = scanner.nextLine().toCharArray();
            StringBuilder result = new StringBuilder();

            if (stringChars.length == 0) {
                System.out.println();
                continue;
            }

            if (stringChars.length == 1) {
                System.out.println(stringChars[0]);
                continue;
            }

            int left = 0;
            for (int right = 1; right < stringChars.length; right++) {
                if (stringChars[right] != stringChars[left]) {
                    if ((right - left) % 2 != 0) {
                        result.append(stringChars[left]);
                    }
                    left = right;
                }
            }

            if (stringChars[stringChars.length - 1] != stringChars[stringChars.length - 2]) {
                result.append(stringChars[stringChars.length - 1]);
            }

            System.out.println(
                    Stream.of(result.toString().split(""))
                            .distinct()
                            .sorted().collect(Collectors.joining())
            );
        }

        scanner.close();
    }
}
