package repo;

import model.Alpinist;

import java.util.List;

public class AlpinistRepo implements Repository<Alpinist>{
    private List<Alpinist> alpinisti;

    @Override
    public void save(Alpinist entity) {
        this.alpinisti.add(entity);
    }

    @Override
    public int count() {
        return this.alpinisti.size();
    }

    @Override
    public List<Alpinist> findAll()
    {
        return this.alpinisti;
    }
}
