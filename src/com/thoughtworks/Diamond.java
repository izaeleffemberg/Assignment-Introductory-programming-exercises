package com.thoughtworks;

public class Diamond {

    public void printDiamond(int numberOfAsterisks){
        for (int i = numberOfAsterisks * 2; i > 1; i -= 2) {
            for (int j = (numberOfAsterisks - (i / 2) + 1); j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = i; j > 1; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void printDiamondWithName(String name, int numberOfAsterisks){

        createTopOfDiamond(numberOfAsterisks - 1);
        System.out.println(name);
        printDiamond(numberOfAsterisks - 1);

    }

    private void createTopOfDiamond(int numberOfAsterisks){
        for (int i = 1; i < numberOfAsterisks * 2; i += 2) {
            for (int j = 1; j < (numberOfAsterisks - (i / 2) + 1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}
