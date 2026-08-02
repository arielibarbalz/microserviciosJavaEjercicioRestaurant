package com.todocode.ingredientes.service;

import com.todocode.ingredientes.model.Ingrediente;
import com.todocode.ingredientes.repository.IingredientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientesService implements IingredientesService{
    @Autowired
    private IingredientesRepository ingredientesRepo;
    @Override
    public List<Ingrediente> getIngredientes() {
        return ingredientesRepo.findAll();
    }

    @Override
    public void saveIngrediente(Ingrediente ingrediente) {
        ingredientesRepo.save(ingrediente);
    }

    @Override
    public void deleteIngrediente(Long id) {
        ingredientesRepo.deleteById(id);
    }

    @Override
    public Ingrediente findIngrediente(Long id) {
        return ingredientesRepo.findById(id).orElse(null);
    }

    @Override
    public void editIngrediente(Long id_original, Ingrediente ingrediente) {
        this.saveIngrediente(ingrediente);
    }

    @Override
    public Ingrediente findIngredienteNombre(String nombre) {
        return ingredientesRepo.findByNombre(nombre);
    }
}
