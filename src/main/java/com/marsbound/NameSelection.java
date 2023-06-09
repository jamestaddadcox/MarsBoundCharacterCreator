package com.marsbound;

import java.util.List;
import java.util.Scanner;

public class NameSelection {

    public static String selectName() {
        String name;

        System.out.println("Do you care what your character's name is?");
        System.out.println("[1] yes, I have a name in mind");
        System.out.println("[2] not really");

        Scanner myScanner = new Scanner(System.in);
        int answer;

        answer = KeyboardInput.getAnswer(myScanner.nextLine());
//        int answer = Integer.parseInt(userInput);

        if (answer == 1) {
            System.out.println("Okay, what is it?");
            name = myScanner.nextLine();
            System.out.println(name + "? That's what we're going with?");
            System.out.println("[1] sure, what's wrong with " + name + "?");
            System.out.println("[2] I guess not...");
            answer = KeyboardInput.getAnswer(myScanner.nextLine());
            if (answer == 1) {
                return name;
            } else if (answer == 2) {
                while (answer != 1) {
                    System.out.println("Okay, so what are we calling them?");
                    name = myScanner.nextLine();
                    System.out.println(name + "? You sure this time?");
                    System.out.println("[1] sure I'm sure!");
                    System.out.println("[2] I suppose we could try something else");
                    answer = KeyboardInput.getAnswer(myScanner.nextLine());
                    if (answer == 1) {
                        return name;
                    }
                }
            }


        } else if (answer == 2) {
            List<String> names = List.of("Gerald", "Tommy", "Bethacca", "Becca", "Trenton", "Harold", "JoAnne", "Jessup", "Jay", "Jenkins", "Tommy Lee", "Sarah", "Sara", "Annie", "Jamms", "Cornswaller", "Derrick", "Ammie", "Emma", "Alma", "Buff Baby", "Pig Bodine", "Thrash", "Trash", "Sam", "Teeny", "Abigail", "Jane", "Not-Jane");
            // feel like it might be better to start w/ a random name and go in order after that?
            name = "";
            int nameIndex = -1;
            while (answer != 1) {
                int previousNameIndex = nameIndex;
                do {
                    nameIndex = (int) (Math.random() * names.size());
                } while (nameIndex == previousNameIndex);
                name = names.get(nameIndex);
                System.out.println("How's \"" + name + "\"?");  // let's put together a list of names to pull from
                System.out.println("[1] fine");
                System.out.println("[2] meh");
                answer = KeyboardInput.getAnswer(myScanner.nextLine());
            }
            return name;

        }
        return "No name yet";

    }
}
