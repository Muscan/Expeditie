package main;
import model.*;
import repo.TRepo;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //obiectele declarate(testing scope -> will be moved to Service
        Produs apa = new Apa("Dorna ", 3);
        Produs conservaLegume = new Ambalate("Conserva legume ", 5);
        Produs suc = new Ambalate("Suc energizant", 1);
        Articol rucsac = new Articol("Rucsac ");
        Articol bocanci = new Articol("Bocanci de tura ");
        Produs batoane = new Ambalate("Caloric100% ", 2);
        VremeZi v1 = new VremeZi(LocalDate.of(2021, 3,17),5);

        //Initializez si declar un Repo de obiecte de tip produs
        TRepo<Produs> ProdusRepo = new TRepo<Produs>();
        ProdusRepo.save(batoane);
        ProdusRepo.save(apa);
        ProdusRepo.save(conservaLegume);
        ProdusRepo.save(suc);

        for(Produs p: ProdusRepo.findAll()){
            System.out.println(p);
        }

        //Initializez si declar un Repo de obiecte de tip articol
        TRepo<Articol> ArticolRepo = new TRepo<Articol>();
        ArticolRepo.save(bocanci);
        ArticolRepo.save(rucsac);

        for (Articol a: ArticolRepo.findAll()){
            System.out.println(a);
        }

        //Initializez si declar un Repo de obiecte de tip VremeZi
        TRepo<VremeZi> VremeZiRepo = new TRepo<VremeZi>();
        VremeZiRepo.save(v1);

        for (VremeZi v: VremeZiRepo.findAll()){
            System.out.println(v);
        }


       /* List<Produs> produse = new ArrayList<>();

        produse.add(apa);
        produse.add(conservaLegume);

        List<Articol> articole = new ArrayList<>();
        articole.add(rucsac);


        for(Produs produs: produse){
            System.out.println(produs);
        }

        for(Articol articol: articole)
            System.out.println(articol);*/
    }
}
