package example.market_jpa.mapper;

import java.util.List;

public interface Mapper <D,R,E>{
    R toDTO(E e);
    List<R> toDTOs(List<E> e);
    E toENT(D d);
}
