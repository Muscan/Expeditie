package repo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public abstract class TFileRepo<E> extends TRepo<E>{
    // declarare camp fileName de tipul string
    // constructor
    // functie de read ( va citii din fisier )
    // functie de write ( va scrie in fisier )

    private String fileName;

    public TFileRepo(String fileName) {
        this.fileName = fileName;
    }

    public abstract E extractEntity(List<String> args);

    public abstract String createEntityAsString(E e);

    private void read(){

    }

    private void write(){
        List<E> elems = super.findAll();

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(this.fileName, true))) {
            for (E e : elems) {
                bw.write(createEntityAsString(e));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
