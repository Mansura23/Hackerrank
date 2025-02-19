package Hackerrank.problems.Basic.Introduction;

import java.util.Scanner;

public class JavaEnd_Of_file {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        while (scanner.hasNextLine()) {
            String k = scanner.nextLine();
            System.out.println(num + " " + k);
            num++;

        }
    }
}
