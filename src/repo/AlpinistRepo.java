package repo;

import model.Alpinist;

import java.util.List;

public class AlpinistRepo implements Repository<Alpinist>{
    private List<Alpinist> alpinist;

    @Override
    public void save(Alpinist entity) {

    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public List<Alpinist> findAll() {
        return null;
    }
}
