package example.market_jpa.mappers;

import java.util.List;

public interface EntityMapper <D,E,R>{
    R toDTO(E e);
    List<R> toDTOs(List<E> es);
    E toENT(D d);
}
