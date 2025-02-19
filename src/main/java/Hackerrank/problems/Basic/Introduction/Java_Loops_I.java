package Hackerrank.problems.Basic.Introduction;

import java.util.Scanner;

public class Java_Loops_I {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();


        for (int i = 1; i <= 10; i++) {
            int product = i * N;
            System.out.println(N + " x " + i + " = " + product);

        }
    }

}
