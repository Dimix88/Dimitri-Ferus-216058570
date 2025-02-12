package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
       //Menu for displaying calculator options
        while(true){
            System.out.println("Dimitri's Calculator");
            System.out.println("1.  Add");
            System.out.println("2.  Subtract");
            System.out.println("3.  Multiply");
            System.out.println("4.  Divide");
            System.out.println("5.  Exit");
            System.out.println("Choose an option: ");

            if(scanner.hasNextInt()){
                System.out.println("Invalid Input");
                scanner.next();
                continue;

            }
            int choice = scanner.nextInt();

            if(choice == 5){
                System.out.println("Closing Program");
                break;
            }
            //User input
            System.out.println("Enter First Number: ");
            double num1 = scanner.nextInt();
            System.out.println("Enter Second Number: ");
            double num2 = scanner.nextInt();

            double result = 0;
            boolean valid = true;

            switch(choice){
                case 1:
                    result = num1 + num2;
                    break;

                    case 2:
                        result = num1 - num2;
                        break;

                        case 3:
                            result = num1 * num2;
                            break;
                            case 4:
                                if(num2 != 0){
                                    result = num1 / num2;
                                }
                                else{
                                    System.out.println("Cannot divide by zero");
                                    valid = false;
                                }
                                break;
                                default:
                                    System.out.println("Invalid Option, Try Again");
                                    valid = false;

            }
            if(valid){
                System.out.println("Result: " + result);
            }

        }
        scanner.close();
    }
}