package com.thoughtworks;

public class FizzBuzz {

    public void printFizzBuzz1To100(){

        for (int i = 1; i<=100; i++){
            if (isDivisibleFor3And5(i)){
                System.out.println("FizzBuzz");
            } else if(isDivisibleFor3(i)){
                System.out.println("Fizz");
            } else if (isDivisibleFor5(i)){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }

    private boolean isDivisibleFor3 (int number){
        if (number % 3 == 0){
            return true;
        }
        return false;
    }

    private boolean isDivisibleFor5 (int number){
        if (number % 5 == 0){
            return true;
        }
        return false;
    }

    private boolean isDivisibleFor3And5 (int number){
        if (number % 3 == 0 && number % 5 == 0){
            return true;
        }
        return false;
    }
}
