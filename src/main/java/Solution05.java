import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
/*
    prompt the user for a number
    set the user's input to num1
    prompt the user for another number
    set the user's input to num2
    create 4 int variables for + - * /
    set the value of sum = num1 + num2
    set the value of difference = num1 - num2
    set the value of product = num1 * num2
    set the value of quotient = num1 / num2
    print the for variables in one print statement
 */

public class Solution05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number\n");
        int num1 = input.nextInt();
        System.out.printf("Enter another number\n");
        int num2 = input.nextInt();
        int sum, difference, product, quotient;
        sum = num1 + num2;
        difference = num1 - num2;
        product = num1 * num2;
        quotient = num1 / num2;
        System.out.printf("%s + %s = %s\n%s - %s = %s \n%s * %s = %s \n%s / %s = %s ",num1, num2, sum, num1, num2, difference, num1, num2, product, num1, num2, quotient);
    }
}
