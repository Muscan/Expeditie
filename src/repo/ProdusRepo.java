package repo;

import model.Produs;

import java.util.List;

public class ProdusRepo implements Repository<Produs>{
    private List<Produs> produse;

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
    }


}
