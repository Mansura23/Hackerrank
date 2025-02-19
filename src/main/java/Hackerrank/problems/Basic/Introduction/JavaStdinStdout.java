package Hackerrank.problems.Basic.Introduction;

import java.util.Scanner;

public class JavaStdinStdout {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        int myInt = scanner.nextInt();
        int mysecondInt = scanner.nextInt();
        scanner.close();
        System.out.println(myString);
        System.out.println(myInt);
        System.out.println(mysecondInt);
    }
}
