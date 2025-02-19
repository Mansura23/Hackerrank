package Hackerrank.problems.Basic.Introduction;

import java.util.Scanner;

public class Java_Output_Formatting {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);


        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String str1 = scanner.next();
            int num1 = scanner.nextInt();
            System.out.printf("%-15s%03d\n", str1, num1);
        }


        System.out.println("================================");

    }
}
