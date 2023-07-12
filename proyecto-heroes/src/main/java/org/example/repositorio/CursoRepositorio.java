package org.example.repositorio;

import org.example.model.Heroe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepositorio extends CrudRepository<Heroe, Long> {
}
