package org.example;

public class Main {
    public static void main(String[] args) {
        // Testing Person class
        try {
            Person person = new Person("Jonny B", 30);
            System.out.println("Created Person: " + person.getName() + ", " + person.getAge());
        } catch (IllegalArgumentException e) {
            System.out.println("Failed to create Person: " + e.getMessage());
        }

        try {
            Person person2 = new Person("Angus McFangus Mister Drangus Jingle Jangle", 30);
        } catch (IllegalArgumentException e) {
            System.out.println("Failed to create Person: " + e.getMessage());
        }

        try {
            Person person3 = new Person("Jonny C", 300);
        } catch (IllegalArgumentException e) {
            System.out.println("Failed to create Person: " + e.getMessage());
        }

        // Testing Calculator class
        Calculator calculator = new Calculator();

        try {
            int factorial = calculator.factorial(5); // Valid
            System.out.println("Factorial of 5 is " + factorial);
        } catch (IllegalArgumentException e) {
            System.out.println("Failed to calculate factorial: " + e.getMessage());
        }

        try {
            int factorial = calculator.factorial(-3); // Invalid: negative number
        } catch (IllegalArgumentException e) {
            System.out.println("Failed to calculate factorial: " + e.getMessage());
        }

        try {
            int binomialCoefficient = calculator.binomialCoefficient(5, 3); // Valid
            System.out.println("Binomial coefficient C(5, 3) is " + binomialCoefficient);
        } catch (IllegalArgumentException e) {
            System.out.println("Failed to calculate binomial coefficient: " + e.getMessage());
        }

        try {
            int binomialCoefficient = calculator.binomialCoefficient(5, 6); // Invalid: k > n
        } catch (IllegalArgumentException e) {
            System.out.println("Failed to calculate binomial coefficient: " + e.getMessage());
        }

        try {
            int binomialCoefficient = calculator.binomialCoefficient(-5, 3); // Invalid: negative n
        } catch (IllegalArgumentException e) {
            System.out.println("Failed to calculate binomial coefficient: " + e.getMessage());
        }

        try {
            int binomialCoefficient = calculator.binomialCoefficient(5, -3); // Invalid: negative k
        } catch (IllegalArgumentException e) {
            System.out.println("Failed to calculate binomial coefficient: " + e.getMessage());
        }
    }
}



