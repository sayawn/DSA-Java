package sayan;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int answer = 0;
        //Take input from user until user enters X or x
        while(true) {
            System.out.print("Enter operator:");
            char ch = in.next().trim().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                //enter two numbers
                System.out.print("Enter 2 numbers:");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (ch == '+')
                    answer = num1 + num2;
                if(ch == '-')
                    answer = num1 - num2;
                if(ch == '*')
                    answer = num1 * num2;
                if(ch == '%')
                    answer = num1 % num2;
                if(ch == '/')
                    if(num2 == 0)
                        System.out.println("Can't divide by zero");
                    else
                        answer = num1 / num2;
                System.out.println(answer);
            }
            else if(ch == 'X' || ch == 'x') {
                System.out.println("Process ended");
                break;
            }
            else
                System.out.println("Invalid input. Please enter again.");


        }
    }
}
