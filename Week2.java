//calculator program that performs basic operations on two numbers
//EDIT: learnt switch cases in week 3, however kept if-else for week 2 submission

import java.util.Scanner;

class Week2Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------Welcome to the calculator program!----------");
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter an operator (+, -, *, /): ");
        String operator = scanner.nextLine();
        
        if(operator.equals("+")){
            System.out.printf("%.2f + %.2f = %.2f", num1, num2, num1 + num2);
        }
        else if(operator.equals("-")){
            System.out.printf("%.2f - %.2f = %.2f", num1, num2, num1 - num2);
        }
        else if(operator.equals("*")){
            System.out.printf("%.2f x %.2f = %.2f", num1, num2, num1 * num2);
        }
        else if(operator.equals("/")){
            if(num2 == 0){
                System.out.println("Error: Division by zero is not allowed.");
            } else {
                System.out.printf("%.2f / %.2f = %.2f", num1, num2, num1 / num2);
            }
        }
        else{
            System.out.println("Operator not recognised.");
        }
        scanner.close();
    }
}