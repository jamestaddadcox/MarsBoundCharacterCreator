package com.marsbound;

import java.util.Scanner;

public class AttributesGeneration {

    public static int[] generateAttributes() {

        int[] attributeArray = new int[4];

        System.out.println("Would you like to choose your character's strengths, or should we throw the dice?");
        System.out.println("[1] choose strengths");
        System.out.println("[2] throw the dice");

        Scanner myScanner = new Scanner(System.in);
        int answer;

        answer = KeyboardInput.getAnswer(myScanner.nextLine());

        if (answer == 1) {
            answer = 0;
            System.out.println("Okay. Which word would you say BEST describes this character?");
            while (answer == 0) {
                System.out.println("[1] sporty");
                System.out.println("[2] devious");
                System.out.println("[3] oblivious");
                System.out.println("[4] lucky");
                answer = KeyboardInput.getAnswer(myScanner.nextLine());
                if (answer == 1) {
                    attributeArray[0] = 2;
                } else if (answer == 2) {
                    attributeArray[1] = 2;
                } else if (answer == 3) {
                    attributeArray[2] = 2;
                } else if (answer == 4) {
                    attributeArray[3] = 2;
                } else {
                    answer = 0;
                    System.out.println("Come on, now, that wasn't one of the options.");
                    System.out.println("Let's try this again. Which word would you say BEST");
                    System.out.println("describes this character?");
                }
            }
            System.out.println("Great. Now if you had to choose a second word to describe this character, it would be...");
            answer = 0;
            while (answer == 0) {
                System.out.println("[1] sporty");
                System.out.println("[2] devious");
                System.out.println("[3] oblivious");
                System.out.println("[4] lucky");
                answer = KeyboardInput.getAnswer(myScanner.nextLine());
                if (answer == 1) {
                    attributeArray[0] = 1;
                } else if (answer == 2) {
                    attributeArray[1] = 1;
                } else if (answer == 3) {
                    attributeArray[2] = 1;
                } else if (answer == 4) {
                    attributeArray[3] = 1;
                } else {
                    answer = 0;
                    System.out.println("Come on, now, that wasn't one of the options.");
                    System.out.println("Let's try this again. What's another word you would pick");
                    System.out.println("to describe this character?");
                }

            }


        } else if (answer == 2) {
            answer = 0;
            int main = (int) (Math.random() * 4);
            int secondary = (int) (Math.random() * 4);
            while (main == secondary) {
                secondary = (int) (Math.random() * 4);
            }
            attributeArray[main] = 2;
            attributeArray[secondary] = 1;

        }


        return attributeArray;
    }
}
