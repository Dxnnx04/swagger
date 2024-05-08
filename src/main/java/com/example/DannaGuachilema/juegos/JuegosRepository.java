package com.example.DannaGuachilema.juegos;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface JuegosRepository extends CrudRepository<Juegos, Long> {
    List<Juegos> findAll();
}
