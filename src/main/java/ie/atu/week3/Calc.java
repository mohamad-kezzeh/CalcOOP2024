package ie.atu.week3;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        System.out.println("Please Enter a number: ");
        Scanner scan1 = new Scanner(System.in);
        int a = scan1.nextInt();
        System.out.println("please enter a second number: ");
        int b = scan1.nextInt();
        System.out.print("Choose an operation ");
        String operation = scan1.next();
        switch (operation){
            case "add": add(a, b); break;
            case "subtract": subtract(a, b); break;
            default: System.out.println("Invalid operation"); break;

        }

    }
    // Subtract two numbers in new branch
    public static void add(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }
    //add method to subtract two numbers
    public static void subtract(int a, int b){
        int sum = a - b;
        System.out.println(sum);
    }
}
