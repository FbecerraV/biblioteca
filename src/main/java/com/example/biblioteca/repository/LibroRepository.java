package com.example.biblioteca.repository;

import com.example.biblioteca.model.LibroModel;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class LibroRepository {

    private List<LibroModel> listaLibros = new ArrayList<>();

    @PostConstruct
    public void init(){
        listaLibros.add(new LibroModel(2, "19410629-7", "Harry Potter", "Ivrea", "JK Rowling", 2000))
    

    }


}
