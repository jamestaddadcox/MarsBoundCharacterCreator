package com.marsbound;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// to run: navigate to com.lights/target in terminal
// type: java -jar marsbound-1.0-SNAPSHOT.jar

public class CharacterCreator {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String name = NameSelection.selectName();

        System.out.println("Alright, I suppose we'll call this character \"" + name + ".\"");
        int answer = 0;
        String nomPronoun = "";
        String accPronoun = "";
        String possPronoun = "";
        while (answer == 0) {

            System.out.println("Does this character go by \"she\" or \"he\" or should we just stick with \"they\"?");
            System.out.println("[1] \"she\"");
            System.out.println("[2] \"he\"");
            System.out.println("[3] \"they\"");
            answer = KeyboardInput.getAnswer(myScanner.nextLine());

            if (answer == 1) {
                nomPronoun = "She";
                accPronoun = "Her";
                possPronoun = "Her";
            } else if (answer == 2) {
                nomPronoun = "He";
                accPronoun = "Him";
                possPronoun = "His";
            } else if (answer == 3) {
                nomPronoun = "They";
                accPronoun = "Them";
                possPronoun = "Their";
            } else {
                answer = 0;
                System.out.println("I'm sorry, I didn't quite catch that.");
            }
        }
        System.out.println("Okay, so " + name + " is a \"" + accPronoun.toLowerCase() + ".\" That's cool.");



        String main = "";
        String secondary = "";

        int sportiness;
        int deviousness;
        int obliviousness;
        int luck;

        do {
            List<String> notReally = new ArrayList<>();
            int[] attributeArray = AttributesGeneration.generateAttributes();
            sportiness = attributeArray[0];
            if (attributeArray[0] == 2) {
                main = "sporty";
            } else if (attributeArray[0] == 1) {
                secondary = "sporty";
            } else {
                notReally.add("sporty");
            }

            deviousness = attributeArray[1];
            if (attributeArray[1] == 2) {
                main = "devious";
            } else if (attributeArray[1] == 1) {
                secondary = "devious";
            } else {
                notReally.add("devious");
            }

            obliviousness = attributeArray[2];
            if (attributeArray[2] == 2) {
                main = "oblivious";
            } else if (attributeArray[2] == 1) {
                secondary = "oblivious";
            } else {
                notReally.add("oblivious");
            }

            luck = attributeArray[3];
            if (attributeArray[3] == 2) {
                main = "lucky";
            } else if (attributeArray[3] == 1) {
                secondary = "lucky";
            } else {
                notReally.add("lucky");
            }

            System.out.println("So it looks like " + name + " is pretty " + main + ", a little bit " + secondary + ",");
            System.out.println("and not really " + notReally.get(0) + " or " + notReally.get(1) + ".");
            System.out.println("Does that sound right?");
            System.out.println("[1] yes");
            System.out.println("[2] let's try something else");
            answer = KeyboardInput.getAnswer(myScanner.nextLine());

        } while (answer == 2);

        System.out.println("Sounds good.");
        System.out.println("Oh! One last question. What's " + name + "'s favorite thing?");

        String favoriteThing = "";

        do {
            System.out.println("[Please type " + name + "'s favorite thing here and hit \"return\":]");
            favoriteThing = myScanner.nextLine();

            System.out.println("I see. So " + name + "'s favorite thing in the whole world is " + favoriteThing + ".");
            System.out.println("Does that sound correct?");
            System.out.println("[1] yes");
            System.out.println("[2] maybe something else...");
            answer = KeyboardInput.getAnswer(myScanner.nextLine());
            if (answer == 2) {
                System.out.println("Yes, that sounded wrong to me, too.");
            }
        } while (answer == 2);

        System.out.println("Great! Welcome, " + name + ", lover of " + favoriteThing + "! Let's get started.");

        System.out.println("");



        // answer = KeyboardInputs.getAnswer(myScanner.nextLine());

        // System.out.println("What is your character's favorite thing in the world?");

        Character myCharacter = new Character(name, nomPronoun, luck, obliviousness, sportiness, deviousness, favoriteThing);

        myCharacter.lookAtCharacter();
    }



}
