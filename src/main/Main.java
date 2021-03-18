package main;
import enums.VarfMunteEnum;
import model.*;
import repo.FileRepoApa;
import repo.TRepo;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //obiectele declarate(testing scope -> will be moved to Service
//        Produs apa = new Apa("Dorna ", 3);
//        Produs conservaLegume = new Ambalate("Conserva legume ", 5);
//        Produs suc = new Ambalate("Suc energizant", 1);
//        Articol rucsac = new Articol("Rucsac ");
//        Articol bocanci = new Articol("Bocanci de tura ");
//        Produs batoane = new Ambalate("Caloric100% ", 2);
//        VremeZi v1 = new VremeZi(LocalDate.of(2021, 3,17),5);
//        VarfMunte m1 = new VarfMunte(VarfMunteEnum.Moldoveanu, 2450);
//        VarfMunte m2 = new VarfMunte(VarfMunteEnum.Vladeasa, 2200);
//
//        //Initializez si declar un Repo de obiecte de tip produs
//        TRepo<Produs> ProdusRepo = new TRepo<Produs>();
//        ProdusRepo.save(batoane);
//        ProdusRepo.save(apa);
//        ProdusRepo.save(conservaLegume);
//        ProdusRepo.save(suc);
//
//        for(Produs p: ProdusRepo.findAll()){
//            System.out.println(p);
//        }
//
//        //Initializez si declar un Repo de obiecte de tip articol
//        TRepo<Articol> ArticolRepo = new TRepo<Articol>();
//        ArticolRepo.save(bocanci);
//        ArticolRepo.save(rucsac);
//
//        for (Articol a: ArticolRepo.findAll()){
//            System.out.println(a);
//        }
//
//        //Initializez si declar un Repo de obiecte de tip VremeZi
//        TRepo<VremeZi> VremeZiRepo = new TRepo<VremeZi>();
//        VremeZiRepo.save(v1);
//
//        for (VremeZi v: VremeZiRepo.findAll()){
//            System.out.println(v);
//        }
//        TRepo<VarfMunte> VarfMunte = new TRepo<VarfMunte>();
//        m1.addVremeZi(v1);
//        VarfMunte.save(m1);
//
//        for (VarfMunte vf: VarfMunte.findAll()){
//            System.out.println(vf);
//        }

        // OBIECTE DE TIPUL APA + SCRIS IN FISIER
        Apa apa1 = new Apa(1L, "Dorna", 4);
        Apa apa2 = new Apa(2L, "Bucovina", 3);
        Apa apa3 = new Apa(5L, "Perla", 100);
        FileRepoApa fileRepoApa = new FileRepoApa("ape.txt");
        fileRepoApa.addApa(apa1);
        fileRepoApa.addApa(apa2);
        fileRepoApa.addApa(apa3);
         fileRepoApa.write();

        FileRepoApa fileRepoApa2 = new FileRepoApa("ape.txt");

        //fileRepoApa2.read();

        for(Apa apa: fileRepoApa2.getApe())
            System.out.println(apa);
    }
}
