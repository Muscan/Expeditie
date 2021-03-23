package repo;

import model.Apa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileRepoApa {
    private final List<Apa> ape;
    private final String fileName;

    public FileRepoApa(String fileName){
        this.fileName = fileName;
        this.ape = new ArrayList<>();
        this.read();
    }

    public FileRepoApa(String fileName, List<Apa> ape){
        this.fileName = fileName;
        this.ape = ape;
    }

    public List<Apa> getApe() {
        return ape;
    }

    public void addApa(Apa apa){
        this.ape.add(apa);
    }

    public void write(){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(this.fileName, true))) {
            for(Apa apa: ape){
                bw.write(apa.getId() + " " + apa.getNume() + " " + apa.getCantitate());
                bw.newLine();
            }
            System.out.println("Apele au fost adaugate in fisierul " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void read(){
        try(BufferedReader br = new BufferedReader(new FileReader(this.fileName)))
        {
            String line;

            while((line = br.readLine()) != null)
            {
                String[] args = line.split(" ");
                this.ape.add(new Apa(Long.parseLong(args[0]), args[1], Integer.parseInt(args[2])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
