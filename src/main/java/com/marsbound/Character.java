package com.marsbound;

import java.util.ArrayList;
import java.util.List;

public class Character {
    private String name;
    private String nomPronoun;  // keep these first-upper, because in-line you can always .toLowerCase
    private int luck;           // chance of things missing or finding things
    private int obliviousness;  // chance of not noticing bad things --> "A small tentacled thing approaches! Fortunately, [name] doesn't notice them."
    private int sportiness;     // health, chance of dealing damage
    private int deviousness;    // chance of figuring things out
    private String favoriteThing; // just comes up from time to time, why not


    // some potential skills/actions: make friends, run away, search, ponder, bore, steal, fight, intimidate
    // "Jane considers the nature of the small tentacled thing."
    // "She comes to a deeper understanding of the universe."


    // CONSTRUCTOR

    public Character(String name, String nomPronoun, int luck, int obliviousness, int sportiness, int deviousness, String favoriteThing) {
        this.name = name;
        this.nomPronoun = nomPronoun;
        this.luck = luck;
        this.obliviousness = obliviousness;
        this.sportiness = sportiness;
        this.deviousness = deviousness;
        this.favoriteThing = favoriteThing;
    }


    // GETTERS and SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNomPronoun() {
        return nomPronoun;
    }

    public void setNomPronoun(String nomPronoun) {
        this.nomPronoun = nomPronoun;
    }

    public String getAccPronoun() {
        if (nomPronoun.equals("He")) {
            return "Him";
        } else if (nomPronoun.equals("She")) {
            return "Her";
        } else {
            return "Them";
        }
    }

    public String getPossPronoun() {
        if (nomPronoun.equals("He")) {
            return "His";
        } else if (nomPronoun.equals("She")) {
            return "Her";
        } else {
            return "Their";
        }
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public int getObliviousness() {
        return obliviousness;
    }

    public void setObliviousness(int obliviousness) {
        this.obliviousness = obliviousness;
    }

    public int getSportiness() {
        return sportiness;
    }

    public void setSportiness(int sportiness) {
        this.sportiness = sportiness;
    }

    public int getDeviousness() {
        return deviousness;
    }

    public void setDeviousness(int deviousness) {
        this.deviousness = deviousness;
    }

    public String getFavoriteThing() {
        return favoriteThing;
    }

    public void setFavoriteThing(String favoriteThing) {
        this.favoriteThing = favoriteThing;
    }

    public void lookAtCharacter() {
        // basically, need some way to assign words to the quantities of each attribute
        // ideally without being crazy verbose
        List<Integer> attributeList = List.of(sportiness, deviousness, obliviousness, luck);
        List<String> descriptiveList = new ArrayList<>();
        for (int attribute : attributeList) {
            switch (attribute) {
                case 0:
                    descriptiveList.add("not especially");
                    break;
                case 1:
                    descriptiveList.add("kind of");
                    break;
                case 2:
                    descriptiveList.add("pretty");
                    break;
                case 3:
                    descriptiveList.add("very");
                    break;
                case 4:
                    descriptiveList.add("extremely");
                    break;
                default:
                    descriptiveList.add("ridiculously");
                    break;
            }

        }

        System.out.println(name + " is " + descriptiveList.get(0) + " sporty, " + descriptiveList.get(1) + " devious, " + descriptiveList.get(2) + " oblivious, and " + descriptiveList.get(3) + " lucky.");
        System.out.println(getPossPronoun() + " favorite thing in the entire world is " + favoriteThing + ".");
    }
}
