package repo;
import java.util.List;

public interface Repository<E> {
    void save(E entity);
    int count();
    List<E> findAll();
}
