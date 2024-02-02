package example.market_jpa.service;

import java.util.List;

public interface Service <A,B>{
    A getById(Long id);
    List<A> getAll();
    A create(B b);
    A update(Long id,B b);
    void delete(Long id);
}
