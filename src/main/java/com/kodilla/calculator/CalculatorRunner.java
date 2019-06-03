package com.kodilla.calculator;

public class CalculatorRunner {
    public static void main(String args[]){
        Calculator calculator = new Calculator();
        System.out.println("it works!! " + calculator.substraction(2,3) + ", " +calculator.addition(2,3));
    }
}
