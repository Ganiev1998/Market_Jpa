package example.market_jpa.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface
Controller <A,B,C>{
    A getById(C id);
    List<A> getAll();
    A create(B b);
    A update(C id,B b);
    void delete(C id);
}
