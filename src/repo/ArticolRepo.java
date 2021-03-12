package repo;
import model.Articol;
import java.util.List;

public class ArticolRepo implements Repository<Articol>{
    private List<Articol> articole;

    @Override
    public void save(Articol entity) {
        this.articole.add(entity);
    }

    @Override
    public int count() {
        return this.articole.size();
    }

    @Override
    public List<Articol> findAll() {
        return this.articole;
    }
}
