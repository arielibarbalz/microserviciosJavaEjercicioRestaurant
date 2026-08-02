package com.todocode.ingredientes.controller;

import com.todocode.ingredientes.model.Ingrediente;
import com.todocode.ingredientes.service.IingredientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredientes")
public class IngredienteController {
    @Autowired
    private IingredientesService ingredientesService;

    @PostMapping("/crear")
    public String crearIngrediente(@RequestBody Ingrediente ingrediente){
        ingredientesService.saveIngrediente(ingrediente);
        return "Ingrediente creado correctamente";
    }
    @GetMapping("/traer")
    public List<Ingrediente> traerIngredientes(){
        return ingredientesService.getIngredientes();
    }
    @DeleteMapping
    public String deleteIngrediente(@PathVariable Long id){
        ingredientesService.deleteIngrediente(id);
        return "Ingrediente borrado correctamente";
    }
    @PutMapping("/editar/{id}")
    public Ingrediente editIngrediente(@PathVariable Long id_original, @RequestBody Ingrediente ingredienteEditar){
        ingredientesService.editIngrediente(id_original, ingredienteEditar);
        Ingrediente ingredienteEditado = ingredientesService.findIngrediente(id_original);
        return ingredienteEditado;
    }
    @GetMapping("/traer/{id}")
    public Ingrediente traerIngrediente(@PathVariable Long id){
        return ingredientesService.findIngrediente(id);
}
    @GetMapping("/traernombre/{nombre}")
    public Ingrediente traerIngredienteNombre(@PathVariable String nombre){
        return ingredientesService.findIngredienteNombre(nombre);
    }
}
