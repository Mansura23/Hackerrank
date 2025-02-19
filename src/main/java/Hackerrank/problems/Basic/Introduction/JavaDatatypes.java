package Hackerrank.problems.Basic.Introduction;

import java.util.Scanner;

public class JavaDatatypes {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            try {

                long num = scanner.nextLong();
                System.out.println(num + " can be fitted in: ");
                if (num >= Byte.MIN_VALUE & num <= Byte.MAX_VALUE) System.out.println("* byte");
                if (num >= Short.MIN_VALUE & num <= Short.MAX_VALUE) System.out.println("* short");
                if (num >= Integer.MIN_VALUE & num <= Integer.MAX_VALUE) System.out.println("* int");
                if (num >= Long.MIN_VALUE & num <= Long.MAX_VALUE) System.out.println("* long");


            } catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }


        }


    }
}
