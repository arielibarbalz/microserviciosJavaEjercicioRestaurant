package com.todocode.ingredientes.repository;

import com.todocode.ingredientes.model.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IingredientesRepository extends JpaRepository<Ingrediente, Long> {
    @Query("SELECT ing FROM Ingrediente ing WHERE ing.nombre_ingrediente= :nombre")
    Ingrediente findByNombre(String nombre);
}
