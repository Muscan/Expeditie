package repo;

import java.util.ArrayList;
import java.util.List;

public class TRepo<T> implements Repository<T>{
    private List<T> elements;
    public TRepo(){
        this.elements = new ArrayList<>();
    }

    @Override
    public void save(T entity) {
        this.elements.add(entity);

    }

    @Override
    public int count() {
        return this.elements.size();
    }

    @Override
    public List<T> findAll() {
        return this.elements;
    }
}
