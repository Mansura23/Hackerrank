package Hackerrank.problems.Basic.Introduction;

import java.util.Scanner;

public class Java_Loop_ll {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();


        for (int i = 0; i < count; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            a += b;


            for (int j = 1; j <= n; j++) {
                System.out.print(a + " ");
                a = a + b * 2;
                b *= 2;


            }
            System.out.println();
        }
    }
}
