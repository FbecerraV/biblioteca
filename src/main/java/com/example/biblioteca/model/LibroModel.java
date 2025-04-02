package com.example.biblioteca.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LibroModel { 

    private int id;
    private String isbn;
    private String titulo;
    private String editorial;
    private String autor;
    private int fechaPublicacion;

}
