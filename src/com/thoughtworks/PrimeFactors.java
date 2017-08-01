package com.thoughtworks;

import java.util.List;
import java.util.ArrayList;

public class PrimeFactors {

    private List<Integer> primes;
    private List<Integer> primeFactors;

    public PrimeFactors (){
        this.primes = new ArrayList<Integer>();
        this.primeFactors = new ArrayList<Integer>();
    }

    public void printPrimeFactors(int number){
        generatePrimes(number);
        checkDividingNumbers(number);
        if (primeFactors != null && primeFactors.size() != 0){
            for (Integer n: primeFactors) {
                System.out.print(n + " ");
            }
            System.out.println("");
        }
    }

    private void checkDividingNumbers(int number){
        while (number != 1) {
            for (Integer numberPrime : primes) {
                if (number % numberPrime == 0) {
                    number = number / numberPrime;
                    primeFactors.add(numberPrime);
                    break;
                }
            }
        }
    }

    private void generatePrimes (int desiredNumber){
        for (int i = 1; i<= desiredNumber; i++){
            if(isPrime(i)){
                primes.add(i);
            }
        }
    }

    private boolean isPrime(int number){
        if (number > 1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

}

