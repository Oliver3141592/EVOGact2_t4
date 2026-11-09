package com.informaticonfig.spring.app1.springboot_applications.controllersTarea;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.informaticonfig.spring.app1.springboot_applications.models.PizzaTarea;
import com.informaticonfig.spring.app1.springboot_applications.models.DTO.PizzaTareaDTO;

@RestController
@RequestMapping("/api/pizzas/variable")
public class PizzaPathVariableController {

    private List<PizzaTarea> pizzas = Arrays.asList(
        new PizzaTarea(1, "Peperoni", "Queso, peperoni, salsa de tomate", "Grande", 150.0),
        new PizzaTarea(2, "Hawaiana", "Jamón, piña, queso", "Mediana", 130.0),
        new PizzaTarea(3, "Mexicana", "Chorizo, jalapeño, frijoles, queso", "Grande", 165.0),
        new PizzaTarea(4, "Vegetariana", "Pimiento, champiñón, cebolla, aceituna", "Chica", 110.0),
        new PizzaTarea(5, "Cuatro quesos", "Mozzarella, cheddar, parmesano, gorgonzola", "Mediana", 145.0)
    );

    
    @GetMapping("/detalle/{id}")
    public PizzaTareaDTO detalle(@PathVariable int id) {
        for (PizzaTarea p : pizzas) {
            if (p.getId() == id) {
                return new PizzaTareaDTO(p.getNombre(), p.getIngredientes(), p.getPrecio());
            }
        }
        return null;   
    }
}