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


            int choice = scanner.nextInt();

            if(choice == 5){
                System.out.println("Closing Program");
                break;
            }

        }
    }
}