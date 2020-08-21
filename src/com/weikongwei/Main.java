package com.weikongwei;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Primitive types
        byte myAge = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = true;

        // Reference types
        String letters = "c:\\windows\\..." + "DEF"; // Strings are inmutable
        Date now = new Date();  // Except String, "new" is needed to
                                // initiate a new reference type(a object)
        System.out.println(letters.toLowerCase());
        System.out.println(letters.indexOf("a"));
        System.out.println("\n");


        // Arrays (fixed size)
        int[] numbers = {1,2,4,3,5,7,6};    // this is a clean way to declare array
        //int[] numbers = new int[5];   // where 5 is the size of this array
        Arrays.sort(numbers);
        System.out.println("Array: " + Arrays.toString(numbers));   // before printing Array
                                                        // convert it to String
        // Multi-dimensional Arrays
        int[][] nums = new int[2][3];
        nums[0][0] = 1;
        System.out.println("Multi-D Array: " + Arrays.deepToString(nums));

        int[][] nums2 = {{1,2,3},{2,3,4}};
        System.out.println("Multi-D Array2: " + Arrays.deepToString(nums2));
        System.out.println("\n");

        // Constants
        final float PI = 3.14F; // Always use capital letters to name constants

        // Arithmatic Expressions
        int result = 10/3;
        System.out.println("Division with int 10/3: ");
        System.out.println(result);
        double result2 = (double)10/(double)3;
        System.out.println("Division with double 10/3: ");
        System.out.println(result2);
        result  = 10%3; // Remainder
        System.out.println("Remainder of 10/3: " + result);
        System.out.println("\n");



        // Increamental
        int x = 1;
        int y = x++; // assign value to y first then increase
        int z = ++x; // increase first, then assign to z
        x += 2; // increase x by 2
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println("\n");


        // Implicit casting
        short x2 = 1;
        int y2 = x2 + 2; // Java creates an anonymous int
                        // to store x's value, then add 2 to it
                        // then assign the result to yy
                        // byte -> short -> int -> long -> float -> double
        double y3 = (double)x2 + 2; // Java will convert 2 to 2.0, then
                                    // add it with x2 casted as double
        System.out.println(y2);
        System.out.println(y3);

        // Wrapper class: str to nums
        letters = "12";
        System.out.println(Integer.parseInt(letters));
        System.out.println(Short.parseShort(letters));
        System.out.println(Float.parseFloat(letters));
        System.out.println(Double.parseDouble(letters));
        System.out.println("\n");


        // The Math Class
        result = Math.round(1.1F);
        result = (int)Math.ceil(1.1F);
        result = (int)Math.floor(1.1F);
        result = Math.max(1,2);
        result = Math.min(1,2);
        double result_db = Math.random();
        result = (int)(Math.round(Math.random()*100));
        System.out.println(result);
        System.out.println("\n");


        // Formatting Numbers in string
        NumberFormat currency = NumberFormat.getCurrencyInstance(); //Factory method
        letters = currency.format(12345678.12);
        System.out.println(letters);

        letters = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(letters);
        System.out.println("\n");


        // Reading input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // .nextInt() only takes the int value you entered,
                            // the \n generated when pressing enter key got passed
                            // to the next scanner.
                            // You have to put a .nextLine() after .nextInt() to consume \n
        System.out.print("Enter your name:");
        letters = scanner.nextLine();
        System.out.println("You are " + letters + ", and your age is " + age);


        // Comparison operators
            // >,<,==,>=,<=,!=

        // Logical Operators
            // &&: and
            // ||: or
            // !: negation, same as '~' + '!' in python


        // If statements
        int tem = 32;
        if (tem>30) {
            System.out.println("It's a hot day");
            System.out.println("Drink water");
        } else if (tem>20) {
            System.out.println("Nice day");
        } else {
            System.out.println("Cold day");
        }
        System.out.println("\n");

        // Simplifying if statements
        int income = 120_000;
        boolean hasHighIncome = income>100_000;

        // Ternary operator
        income = 120_000;
        String className = income > 100_000 ? "First" : "Economic";


        // Switch statements
        String role = "admin";
            // switch can execute cases on variable other than long type
        switch (role) {
            case "admin":
                System.out.println("You are an admin.");
                break;
            case "moderator":
                System.out.println("You are a moderator");
                break;
            default:    // No break needed for default case
                System.out.println("You are a guest");
        }
        System.out.println("\n");


        // FizzBuzz
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        if (number % 15 ==0) {
            System.out.println("FizzBuzz");
        } else if (number % 5 == 0) {
            System.out.println("Fizz");
        } else if (number % 3 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }

        // Mortgage Calculator
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.println("Annual Interest Rate: ");
        float anualRate = scanner.nextFloat();
        float monthlyRate = anualRate/100/12;
        System.out.println("Period (years): ");
        byte years = scanner.nextByte();    // it is also the number of payments

        double mortgage = principal *
                (monthlyRate*(Math.pow(1.0+monthlyRate,years*12)))
                / (Math.pow(1.0+monthlyRate,years*12)-1.0);
        System.out.println("Mortgage: " + mortgage);

        // Mortgage Calculator using Methods
        mortgageCalculator();


        // For loops
        for (int i=0; i<5; i++) {
            System.out.println("You are the best!" + i);
        }
        System.out.println("\n");


        // While loops
        String input = "";
        while (!input.equals("quit")){
            System.out.print("Input \"quit\": ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
        System.out.println("\n");

        // Do-while loop, executed at least once
        do {
            System.out.print("Input \"quit\": ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit")); // it checks conditions after code
                                        // gets executed

        // Break and continue statement
            // break statement terminates the look
            // continue statement goes back to the beginning of the loop
        while (true) {
            System.out.print("Input \"quit\": ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }
        System.out.println("\n");


        // For-each loop
        String[] fruits = {"Apple", "Mango", "Orange"};
            // Traditional for loop:
        for (int i = fruits.length-1; i >= 0; i--)
            System.out.println(fruits[i]);
        System.out.println("");
            // For-each loop:
        for (String fruit : fruits)
            System.out.println(fruit);
        System.out.println("\n");


        // Mortgage Calculator with input verification
        int principal;
        float monthlyRate;
        byte years;
        while (true){
            System.out.print("Principal ($1k-$1M): ");
            principal = scanner.nextInt();
            if (principal > 1_000 && principal <1_000_000)
                break;
            System.out.println("Enter a value btween 1k and 1M.");
        }
        while (true) {
            System.out.println("Annual Interest Rate (0-30): ");
            float anualRate = scanner.nextFloat();
            if (anualRate > 0 && anualRate <= 30){
                monthlyRate = anualRate/100/12;
                break;
            }
            System.out.println("Enter a rate greater than 0 and less than and equal to 30.");
        }
        while (true) {
            System.out.println("Period (years): ");
            years = scanner.nextByte();    // it is also the number of payments
            if (years <= 30 && years >= 0)
                break;
            System.out.println("Enter a value between 0 and 30.");
        }

        double mortgage = principal *
                (monthlyRate*(Math.pow(1.0+monthlyRate,years*12)))
                / (Math.pow(1.0+monthlyRate,years*12)-1.0);
        System.out.println("Mortgage: " + mortgage);


        // Mortgage Calculator using Multiple Methods
        int principal = (int)getNumber("Principal ($1k-$1M)", 1_000,1_000_000);
        float anualRate = (float)getNumber("Annual Interest Rate (0-30)", 0,30);
        byte years = (byte)getNumber("Period (years)", 0,30);
        double mortgage = mortgageCalculator2(principal,anualRate,years);
        System.out.println("-----------------");

        // Mortgage Payment Schedule (using imput values from above section)
        double balance = 1;
        int numOfPay = 0;

        System.out.println("Payment Schedule: ");
        while (balance > 0) {
            balance = mortgagePaymentSchedule(principal,anualRate,years,numOfPay);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
            numOfPay++;
        }


    }

    public static void mortgageCalculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.println("Annual Interest Rate: ");
        float anualRate = scanner.nextFloat();
        float monthlyRate = anualRate/100/12;
        System.out.println("Period (years): ");
        byte years = scanner.nextByte();    // it is also the number of payments

        double mortgage = principal *
                (monthlyRate*(Math.pow(1.0+monthlyRate,years*12)))
                / (Math.pow(1.0+monthlyRate,years*12)-1.0);
        System.out.println("Mortgage: " + mortgage);
    }

    public static double getNumber(String prompt, double min, double max) {
        double value=0;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print(prompt + ": ");
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                return value;
            System.out.println("Enter a value between " + min + " and " + max + ".");
        }
    }

    public static double mortgageCalculator2(int principal, float anualRate, byte years) {
        float monthlyRate = anualRate/100/12;
        double mortgage = principal *
                (monthlyRate*(Math.pow(1.0+monthlyRate,years*12)))
                / (Math.pow(1.0+monthlyRate,years*12)-1.0);
        System.out.println("Mortgage Payment: " + mortgage);
        return mortgage;
    }

    public static double mortgagePaymentSchedule(int principal, float anualRate, byte years, int numOfPay) {
        float monthlyRate = anualRate/100/12;

        double remaining  = principal*(Math.pow(1+monthlyRate,years*12) - Math.pow(1+monthlyRate,numOfPay))
                /(Math.pow(1+monthlyRate,years*12) - 1);

        return remaining;
    }
}
