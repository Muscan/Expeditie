package repo;

import model.Ambalate;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class FileRepoAmbalate {
    private final List<Ambalate> ambalate;
    private final String fileName;

    public FileRepoAmbalate(String fileName){
        this.fileName = fileName;
        this.ambalate = new ArrayList<>();
        this.read();
    }
    public void write(){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(this.fileName, true))){
            for(Ambalate ambalate: ambalate){
                bw.write(ambalate.getId() + " " + ambalate.getNume() + " " + ambalate.getCantitate());
                bw.newLine();
            }
            System.out.println("Produsele ambalate au fost adaugate in fisierul " +fileName);

            } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Ambalate> getAmbalate(){return ambalate;}
    public void addAmbalate(Ambalate ambalate) {this.ambalate.add(ambalate);}

    public void read(){
        try(BufferedReader br = new BufferedReader(new FileReader(this.fileName)))
        {
            String line;

            while((line = br.readLine()) != null){
                String[] args = line.split(" ");
                this.ambalate.add(new Ambalate(Long.parseLong(args[0]), args[1], Integer.parseInt(args[2])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
