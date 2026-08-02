package com.todocode.ingredientes.service;

import com.todocode.ingredientes.model.Ingrediente;

import java.util.List;

public interface IingredientesService {
    public List<Ingrediente> getIngredientes();
    public void saveIngrediente(Ingrediente ingrediente);
    public void deleteIngrediente(Long id);
    public Ingrediente findIngrediente(Long id);
    public void editIngrediente(Long id_original, Ingrediente ingrediente);
    public Ingrediente findIngredienteNombre(String nombre);
}
