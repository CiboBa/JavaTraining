package lab1tasks;

import java.util.Scanner;

public class FactiorialCount {

    /*Write a function that computes the factorial value
    Definition: n! = n*(n-1)! , where 0! = 1
    1! = 1
    2! = 2 * 1! = 2 * 1
    3! = 3 * 2! = 3 * 2 * 1! = 3 * 2 * 1
    4! = 4 * 3! = 4 * 3 * 2! = 4 * 3 * 2 * 1! = 4 * 3 * 2 * 1
    Hint: use the recursive method*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(factorial(scanner.nextInt()));
    }

    private static int factorial(int n) {
        int factorial = 0;
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
