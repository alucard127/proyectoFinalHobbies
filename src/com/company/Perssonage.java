package com.company;

public class Perssonage {
    String namePersonnage;
    String item;
    int cantLives;

    public Perssonage(String namePersonnage, String item, int cantLives) {
        this.namePersonnage = namePersonnage;
        this.item = item;
        this.cantLives = cantLives;

    }

    public String getNamePersonnage() {
        return namePersonnage;
    }

    public String getItem() {
        return item;
    }

    public int getCantLives() {
        return cantLives;
    }

    public String displayData() {
        return "the name of personnage is : " + getNamePersonnage() + " \n" +
                "the personnage got the item : " + getItem() + " \n" +
                "the personnage got number of the lifes :  " + getCantLives()+"\n";
    }
}

