package Daos;

import java.util.List;
import java.util.Optional;

public interface DAO<T> {

    public void save(T t) throws Exception;
    public void update(T t) throws Exception;
    public void delete(T t) throws Exception;
    public void deleteByNumberId(long n) throws Exception;
    public List<T> getAll() throws Exception;
    public Optional<T> search(long id) throws Exception;
}
