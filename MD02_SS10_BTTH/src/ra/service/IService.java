package ra.service;

import java.util.List;

public interface IService<T>{
    List<T> findAll();
    void save(T t);
    T findById(int id);
    int findIndexById(int id);
    int autoId();

}
