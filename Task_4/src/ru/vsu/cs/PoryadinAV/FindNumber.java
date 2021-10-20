package ru.vsu.cs.PoryadinAV;

import java.util.Scanner;

public class FindNumber {

    public static void main(String[] args) {
        int N = readNum();

        writeAnswer(findNnum(N));
    }

    private static int readNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input N: ");

        return scanner.nextInt();
    }

    private static int findNnum(int N) {
        int count = N;

        for (int i = 100; i < 999; i++) {
            if (checkNum(i) && count > 0) {
                count -= 1;
            }
            if (count == 0) {
                return i;
            }
        }
        return 0;
    }

    private static boolean checkNum(int num) {
        int first = num / 100;
        int second = ((num - first * 100) / 10);
        int third = num - (first * 100) - (second * 10);

        return (first == second && first != third) || (first == third && first != second)
                || (second == third && second != first);
    }

    private static void writeAnswer(int num) {
        System.out.println("Number: " + num);
    }
}
