package com.todocode.ingredientes.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ingrediente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id_ingrediente;
    private String nombre_ingrediente;
    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> platos;
}
