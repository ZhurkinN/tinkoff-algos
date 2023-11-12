package org.example.codeforces.week2;

import java.util.Scanner;

public class Problem381 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = scanner.nextInt();
        }

        int sergeyScore = 0;
        int dimaScore = 0;
        boolean isSergeysTurn = true;

        int left = 0;
        int right = cards.length - 1;
        while (left <= right) {

            int plus;
            if (cards[left] >= cards[right]) {
                plus = cards[left];
                left++;
            } else {
                plus = cards[right];
                right--;
            }

            if (isSergeysTurn) {
                sergeyScore += plus;
            } else {
                dimaScore += plus;
            }

            isSergeysTurn = !isSergeysTurn;
        }

        System.out.println(sergeyScore + " " + dimaScore);

        scanner.close();
    }
}
