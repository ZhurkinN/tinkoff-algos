package org.example.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Problem141 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String guestName = scanner.nextLine();
        String ownerName = scanner.nextLine();
        String givenCharacters = scanner.nextLine();
        System.out.println(canBuildName(guestName + ownerName, givenCharacters));

        scanner.close();
    }

    private static String canBuildName(
            String namesCharacters,
            String givenCharacters
    ) {
        if (namesCharacters.length() != givenCharacters.length()) {
            return "NO";
        }
        return Arrays.equals(bubbleSort(namesCharacters), bubbleSort(givenCharacters)) ? "YES" : "NO";
    }

    private static char[] bubbleSort(String s) {
        char[] characters = s.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            for (int j = 0; j < characters.length - 1; j++) {
                if (characters[j] > characters[j + 1]) {
                    char temp = characters[j];
                    characters[j] = characters[j + 1];
                    characters[j + 1] = temp;
                }
            }
        }

        return characters;
    }
}
