package com.thoughtworks;

public class Triangle {

    public void printOneAsterisk(){
        System.out.print("*");
    }

    public void printNAsteriskOnOneLine(Integer numberOfAsterisk){
        for (int i = 1; i <= numberOfAsterisk; i++){
            System.out.print("*");
        }
    }

    public void printNAsteriskInVertical(Integer numberOfAsterisk){
        for (int i = 1; i <= numberOfAsterisk; i++){
            System.out.println("*");
        }
    }

    public void printRightTriangle(Integer numberOfAsterisks){
        for (int i = 1; i <= numberOfAsterisks; i++ ){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void printIsoscelesTriangle(int numberOfAsterisks){
        for (int i = 1; i < numberOfAsterisks * 2; i += 2) {
            for (int j = 1; j < (numberOfAsterisks - (i / 2)); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }


}
