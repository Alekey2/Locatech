package br.com.fiap.locatech.repository;


import br.com.fiap.locatech.entities.Aluguel;

import java.util.List;
import java.util.Optional;

public interface AluguelRepository {

    Optional<Aluguel> findById(Long id);

    List<Aluguel> findAll(int size, int offset);

    Integer save(Aluguel pessoa);

    Integer update(Aluguel pessoa, Long id);

    Integer delete(Long id);
}
