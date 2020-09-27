package iserver;

import java.util.List;

public interface IService<T> {
    void add(T object);
    void update(Integer id, T newObject);
    void delete(Integer id);
    T findByID(Integer id);
    List<T> findByName(String name);
    List<T> findAll();
    List<T> sortByPrice();
}
