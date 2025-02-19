package Hackerrank.problems.Basic.Introduction;

import java.util.Scanner;

public class Java_StdinStdout_II {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        Double myDouble = scanner.nextDouble();
        scanner.nextLine();
        String myString = scanner.nextLine();


        System.out.println("String: " + myString);
        System.out.println("Double: " + myDouble);
        System.out.println("Int: " + myInt);


    }
}
