package com.todocode.platos.service;

import com.todocode.platos.model.Plato;

import java.util.List;

public interface IPlatoService {
    public List<Plato> getPlatos();
    public void savePlato(Plato plato);
    public void deletePlato(Long id);
    public Plato findPlato(Long id);
    public void editPlato(Long id_original, Plato plato);
    public Plato findPlatoNombre(String nombre);

}
