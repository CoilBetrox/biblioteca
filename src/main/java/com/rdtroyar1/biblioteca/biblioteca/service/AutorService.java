package com.rdtroyar1.biblioteca.biblioteca.service;

import com.rdtroyar1.biblioteca.biblioteca.dto.AutorDTO;
import com.rdtroyar1.biblioteca.biblioteca.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    @Autowired
    private FabricaAutorService fabricaAutorService;

    @Autowired
    private AutorRepository autorRepository;

    public AutorDTO save(AutorDTO autorDTO){
        return fabricaAutorService.crearAutorDTO(autorRepository.save(fabricaAutorService.crearAutor(autorDTO)));
    }

    public List<AutorDTO> findAll(){
        return fabricaAutorService.crearAutoresDTO(autorRepository.findAll());
    }

    public AutorDTO findById(Integer id){
        return fabricaAutorService.crearAutorDTO(autorRepository.findById(id).get());
    }

    public void deleteById(Integer id){
        autorRepository.deleteById(id);
    }
}
