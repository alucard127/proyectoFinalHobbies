package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        ListPersonagge personagges = new ListPersonagge();

        Person person = new Person("carlos", "cuba", "cochabamba", 33, 1234567);
        System.out.println(person.displayDataPerson());

        Fitness fitness = new Fitness("arms", "GRECOS", "dumbbells", 20, 1.73);
        System.out.println(fitness.displayData());

        Running running = new Running("treadmill", 4.5, 1.5);
        System.out.println(running.displayData());

        Music music = new Music("pop", "eminem", "closeth");
        System.out.println(music.displayData());

        System.out.println("enter the name game : ");
        String name = ReadKeyboard.readString();

        System.out.println("enter the type gender: ");
        String gender = ReadKeyboard.readString();

        System.out.println("enter the description game: ");
        String description = ReadKeyboard.readString();

        System.out.println("enter the level of the game: ");
        int levels = ReadKeyboard.readInt();

        VideoGame videoGame = new VideoGame(name, gender, description, levels);


        System.out.println(videoGame.displayData());

        boolean follow = true;

        while (follow) {
            System.out.println("enter the name personnage : ");
            String namePersonnage = ReadKeyboard.readString();

            System.out.println("enter the item : ");
            String item = ReadKeyboard.readString();

            System.out.println("enter the quantity of lives : ");
            int cantLives = ReadKeyboard.readInt();

            personagges.addPersonagge(new Perssonage(namePersonnage, item, cantLives));

            System.out.println("you want continue adding personages.Enter true or false ");
            follow = ReadKeyboard.readBoolean();

        }
        personagges.displayPersonnage();
    }
}
