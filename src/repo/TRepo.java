package repo;

import java.util.ArrayList;
import java.util.List;

public class TRepo<E> implements Repository<E>{
    private final List<E> elements;
    public TRepo(){
        this.elements = new ArrayList<>();
    }

    @Override
    public void save(E entity) {
        this.elements.add(entity);

    }

    @Override
    public int count() {
        return this.elements.size();
    }

    @Override
    public List<E> findAll() {
        return this.elements;
    }
}
