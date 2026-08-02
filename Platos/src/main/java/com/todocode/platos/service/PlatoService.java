package com.todocode.platos.service;

import com.todocode.platos.model.Plato;
import com.todocode.platos.repository.IPlatoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PlatoService implements IPlatoService {

    @Autowired
    private IPlatoRepository platoRepo;

    @Override
    public List<Plato> getPlatos() {
        return platoRepo.findAll();
    }

    @Override
    public void savePlato(Plato plato) {
        platoRepo.save(plato);
    }

    @Override
    public void deletePlato(Long id) {
        platoRepo.deleteById(id);
    }

    @Override
    public Plato findPlato(Long id) {
        return platoRepo.findById(id).orElse(null);
    }

    @Override
    public void editPlato(Long id_original, Plato plato){
        this.savePlato(plato);
    }

    @Override
    public Plato findPlatoNombre(String nombre) {
        return platoRepo.findByNombre(nombre);
    }
}
