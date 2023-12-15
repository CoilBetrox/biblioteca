package com.rdtroyar1.biblioteca.biblioteca.service;

import com.rdtroyar1.biblioteca.biblioteca.dto.AutorDTO;
import com.rdtroyar1.biblioteca.biblioteca.model.Autor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FabricaAutorService {
    public Autor crearAutor(AutorDTO autorDTO){
        return new Autor(autorDTO);
    }

    public AutorDTO crearAutorDTO(Autor autor){
        return new AutorDTO(autor);
    }

    public List<AutorDTO> crearAutoresDTO(List<Autor> listaAutores){
        List<AutorDTO> autorDTOS = new ArrayList<>();
        listaAutores.forEach(
                autor -> {
                    autorDTOS.add(crearAutorDTO(autor));
                }
        );
        return autorDTOS;
    }
}
