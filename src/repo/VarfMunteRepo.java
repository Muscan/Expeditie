package repo;
import model.VarfMunte;
import java.util.List;

public class VarfMunteRepo implements Repository<VarfMunte>{
    private List<VarfMunte> varfMunti;
    @Override
    public void save(VarfMunte entity) {
        this.varfMunti.add(entity);
    }
    @Override
    public int count() {
        return this.varfMunti.size();
    }

    @Override
    public List<VarfMunte> findAll() {
        return this.varfMunti;
    }
}
