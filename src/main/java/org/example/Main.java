package org.example;
import java.util.Scanner;
import java.text.NumberFormat;
public class Main {
    public static void main(String[] args) {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        System.out.println("1 - Further Substring Fun");
        System.out.println("2 - Run of Integers");
        System.out.println("3 - Sum of a Range of Sequential Integers");
        System.out.println("4 - Repeatedly Echo a word");
        System.out.println("5 - Words seperated by dots");
        System.out.println("6 - Adding up Integers");
        System.out.println("7 - Shipping Cost Calculator");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        if (choice == 1) {
            // Further Substring Fun
            System.out.print("Enter a string: ");
            String word = inputString.nextLine();
            System.out.print("Enter beginning index: ");
            int begin = input.nextInt();
            System.out.print("Enter ending index: ");
            int end = input.nextInt();
            System.out.println("Original String: " + word);
            System.out.println("Substring: " + word.substring(begin, end + 1));
        } else if (choice == 2) {
            // Run of Integers
            System.out.print("Enter start: ");
            int start = input.nextInt();
            System.out.print("Enter end: ");
            int end = input.nextInt();
            for (int i = start; i <= end; i ++) {
                System.out.println(i);
            }
        } else if (choice == 3) {
            System.out.print("Enter low: ");
            int low = input.nextInt();
            System.out.print("Enter high: ");
            int high = input.nextInt();
            int count = 0;
            for (int i = low; i <= high; i ++) {
                count += i;
            }
            System.out.println("The sum is: " + count);
        } else if (choice == 4) {
            System.out.print("Enter a word: ");
            String word = inputString.nextLine();
            for (int i = 0; i < word.length(); i ++) {
                System.out.println(word);
            }
        } else if (choice == 5) {
            System.out.print("Enter first word: ");
            String word1 = inputString.nextLine();
            System.out.print("Enter second word: ");
            String word2 = inputString.nextLine();
            System.out.print(word1);
            int length1 = word1.length() + word2.length();
            for (int i = 0; i < 30-length1; i ++) {
                System.out.print(".");
            }
            System.out.println(word2);
        } else if (choice == 6) {
            System.out.print("How many integers will be added: ");
            int num = input.nextInt();
            int total = 0;
            for (int i = 0; i < num; i ++) {
                System.out.print("Enter an integer: ");
                int add = input.nextInt();
                total += add;
            }
            System.out.println("The sum is: " + total);
        } else if (choice == 7) {
            int weight = -4;
            do {
                if (weight <= 10 && weight > 0) {
                    double cost = 3.0;
                    System.out.println("Shipping Cost: " + currencyFormat.format(cost));
                } else if (weight > 0) {
                    weight -= 10;
                    double cost = weight * 0.25 + 3;
                    System.out.println("Shipping Cost: " + currencyFormat.format(cost));
                }
                System.out.print("Weight of order: ");
                weight = input.nextInt();
                
            } while (weight > 0);
            System.out.println("bye");
        }
    }
}