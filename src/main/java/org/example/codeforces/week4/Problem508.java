package org.example.codeforces.week4;

import java.util.Scanner;

public class Problem508 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String course = scanner.next();
        scanner.close();

        int index = -1;
        for (int i = 0; i < course.length() - 1; i++) {

            if (course.charAt(i) % 2 == 0) {
                index = i;
                if (course.charAt(course.length() - 1) > course.charAt(i)) break;
            }
        }

        if (index == -1) {
            System.out.println(index);
        } else {
            System.out.println(swapElementsWithLast(course, index));
        }
    }

    private static String swapElementsWithLast(String course, int currentIndex) {
        StringBuilder sb = new StringBuilder(course);

        char temp = sb.charAt(currentIndex);
        sb.setCharAt(currentIndex, sb.charAt(sb.length() - 1));
        sb.setCharAt(sb.length() - 1, temp);

        return sb.toString();
    }
}
