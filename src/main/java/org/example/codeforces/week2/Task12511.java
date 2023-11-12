package org.example.codeforces.week2;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task12511 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
        }

        for (String string : strings) {

            char[] characters = string.toCharArray();
            if (characters.length == 0) {
                continue;
            }
            if (characters.length == 1) {
                System.out.println(characters[0]);
                continue;
            }

            StringBuilder sb = new StringBuilder();
            int left = 0;
            for (int right = 1; right < characters.length; right++) {
                if (characters[right] != characters[left]) {
                    if ((right - left) % 2 != 0) {
                        sb.append(characters[left]);
                    }
                    left = right;
                }
            }

            if (characters[characters.length - 1] != characters[characters.length - 2]) {
                sb.append(characters[characters.length - 1]);
            }

            System.out.println(
                    Stream.of(sb.toString().split(""))
                            .distinct()
                            .sorted().collect(Collectors.joining())
            );
        }

        scanner.close();
    }
}
