package Hackerrank.problems.Basic.Introduction;

import java.util.Scanner;

public class Java_Int_to_String {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = Integer.toString(n);
        if (n >= -100 & n <= 100) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }

}
