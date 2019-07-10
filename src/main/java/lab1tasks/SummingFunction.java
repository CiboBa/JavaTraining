package lab1tasks;

import java.util.Scanner;

public class SummingFunction {

    //Write a function that takes a value n returns the sum of numbers 1 to n

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(sumOfNumbersToN(scanner.nextInt()));
    }

    private static int sumOfNumbersToN(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
