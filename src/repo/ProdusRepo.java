package repo;

import model.Produs;

import java.util.List;

public class ProdusRepo<T> implements Repository<T>{
    private List<T> elements;
    @Override
    public void save(T entity) {

    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public List<T> findAll() {
        return null;
    }

    /*private List<Produs> produse;

    @Override
    public void save(Produs entity) {
        this.produse.add(entity);
    }

    @Override
    public int count() {
        return this.produse.size();
    }

    @Override
    public List<Produs> findAll() {

        return this.produse;
    }*/


}
