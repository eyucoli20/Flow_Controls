import java.util.Scanner;

public class FlowControls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();
        
        int difference = Math.abs(num1 - num2);
        
        if (difference < 200) {
            System.out.println("The difference between the numbers is less than 200. Program will exit.");
        } else {
            int evenAndDivisibleBy4Sum = 0;
            int evenAndDivisibleBy8Sum = 0;
            int notEvenAndNotDivisibleBy5Sum = 0;
            
            // Using a for loop
            for (int i = num1; i <= num2; i++) {
                switch (i % 8) {
                    case 0:
                        evenAndDivisibleBy8Sum += i;
                        break;
                    case 4:
                        evenAndDivisibleBy4Sum += i;
                        break;
                }
                if (i % 2 != 0 && i % 5 != 0) {
                    notEvenAndNotDivisibleBy5Sum += i;
                }
            }
            
            // Using a while loop
            int current = num1;
            while (current <= num2) {
                switch (current % 8) {
                    case 0:
                        evenAndDivisibleBy8Sum += current;
                        break;
                    case 4:
                        evenAndDivisibleBy4Sum += current;
                        break;
                }
                if (current % 2 != 0 && current % 5 != 0) {
                    notEvenAndNotDivisibleBy5Sum += current;
                }
                current++;
            }
            
            // Using a do-while loop
            int start = num1;
            do {
                switch (start % 8) {
                    case 0:
                        evenAndDivisibleBy8Sum += start;
                        break;
                    case 4:
                        evenAndDivisibleBy4Sum += start;
                        break;
                }
                if (start % 2 != 0 && start % 5 != 0) {
                    notEvenAndNotDivisibleBy5Sum += start;
                }
                start++;
            } while (start <= num2);
            
            System.out.println("Sum of even and divisible by 4: " + evenAndDivisibleBy4Sum);
            System.out.println("Sum of even and divisible by 8: " + evenAndDivisibleBy8Sum);
            System.out.println("Sum of not even and not divisible by 5: " + notEvenAndNotDivisibleBy5Sum);
        }
        
        scanner.close();
    }
}





/*
Create a program that does the following:

Takes 2 numbers as input. The difference between the numbers can’t be any less than 200.
if the difference is less than 200 then the program will have no output and will end.
The program should sum up the numbers that are even and also divisible by 4.
Then the program should sum up the numbers that are even and also divisible by 8.
Then the program should sum up the numbers that are not even and and not divisible by 5.
These values should all be displayed at the end of the program.
You must use all three kinds of loops and a switch statement.

Be sure to properly document your code with comments!!!!!!!!!!!!!!!!!

 */