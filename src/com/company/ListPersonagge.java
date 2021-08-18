package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListPersonagge {
    List<Perssonage> perssonages = new ArrayList<>();

    public void addPersonagge(Perssonage perssonage ){

        this.perssonages.add(perssonage);

    }
     public void displayPersonnage(){
        perssonages.forEach(s->System.out.println(s.displayData()));

     }
}
