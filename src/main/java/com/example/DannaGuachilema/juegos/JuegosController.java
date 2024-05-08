package com.example.DannaGuachilema.juegos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping
public class JuegosController {
    
    @Autowired
    private JuegosService juegosService;

    // create
    @PostMapping(value = "juegos")
    public Juegos save(@RequestBody Juegos entity) {
        return juegosService.save(entity);
    }

    // select by id
    @GetMapping(value = "juegos/{id}")
    public Juegos findById(@PathVariable Long id) {
        return juegosService.findById(id);
    }

    // update
    @PutMapping(value = "juegos")
    public Juegos Update(@RequestBody Juegos entity) {
        return juegosService.save(entity);
    }

    // Delete
    @DeleteMapping(value = "juegos/{id}")
    public void deleteById(@PathVariable Long id) {
        juegosService.deleteById(id);
    }

    // select all
    @GetMapping(value = "juegos")
    public List<Juegos> findAll() {
        return juegosService.findAll();
    }
}
