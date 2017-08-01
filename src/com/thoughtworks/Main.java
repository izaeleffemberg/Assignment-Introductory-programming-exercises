package com.thoughtworks;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        triangle.printOneAsterisk();
        triangle.printNAsteriskOnOneLine(8);
        triangle.printNAsteriskInVertical(3);
        triangle.printRightTriangle(3);
        triangle.printIsoscelesTriangle(3);

        Diamond diamond = new Diamond();
        diamond.printDiamond(3);
        diamond.printDiamondWithName("Izael", 3);

        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.printFizzBuzz1To100();

        PrimeFactors primeFactors = new PrimeFactors();
        primeFactors.printPrimeFactors(30);
    }
}
