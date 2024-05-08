package com.example.DannaGuachilema.juegos;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class JuegosService {
    @Autowired
    private JuegosRepository juegosRepository;

    //create
    public Juegos save(Juegos entity)
    {
        return juegosRepository.save(entity);
    }


    //findbyid
    public Juegos findById(Long id)
    {
        return juegosRepository.findById(id).orElse(null);
    }

    //delete

    public void deleteById( long id)
    {
        juegosRepository.deleteById(id);
        {
            juegosRepository.deleteById(id);
        }
    }

    //select all
    public List<Juegos> findAll()
    {
        return juegosRepository.findAll();
    }
        
}
