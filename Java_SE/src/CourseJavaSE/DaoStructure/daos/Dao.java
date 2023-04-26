package CourseJavaSE.DaoStructure.daos;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {

    void save(T t) throws Exception;
    List<T> getAll() throws Exception;
    Optional<T> search(long id) throws Exception;
    void update(T t) throws Exception;
    void delete(T t) throws Exception;
    public void deleteByCode(long code) throws Exception;


}
