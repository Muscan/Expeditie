package main;

import model.Ambalate;
import model.Apa;
import model.Articol;
import model.Produs;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Produs apa = new Apa("Dorna", 3);
        Produs conservaLegume = new Ambalate("Conserva legume", 5);
        Articol rucsac = new Articol("Rucsac");

        // declarare si initializare lista ( prima data e goala, n-are nimic in ea )
        // dar ceea ce e fain la List, ca nu tre' sa-ti bati capul de nimic, de exemplu
        // cata memorie se aloca
        List<Produs> produse = new ArrayList<>();


        produse.add(apa);
        produse.add(conservaLegume);

        List<Articol> articole = new ArrayList<>();
        articole.add(rucsac);


        for(Produs produs: produse){
            System.out.println(produs);
        }

        for(Articol articol: articole)
            System.out.println(articol);
    }
}
