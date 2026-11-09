package com.informaticonfig.spring.app1.springboot_applications.controllersTarea;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.informaticonfig.spring.app1.springboot_applications.models.DTO.PizzaTareaDTO;

@Controller
public class PizzaController {

    
    private List<PizzaTareaDTO> pizzas = new ArrayList<>(List.of(
        new PizzaTareaDTO("Peperoni", "Queso, peperoni, salsa de tomate", 150.0),
        new PizzaTareaDTO("Hawaiana", "Jamón, piña, queso", 130.0)
    ));

    
    @GetMapping("/pizzas_info")
    public String mostrar(Model model) {
        model.addAttribute("pizzaForm", new PizzaTareaDTO("", "", 0.0));
        model.addAttribute("pizzas", pizzas);
        return "PizzaVista";
    }

    
    @PostMapping("/pizzas_info")
    public String guardar(@ModelAttribute("pizzaForm") PizzaTareaDTO pizzaForm, Model model) {
        pizzas.add(pizzaForm);

        model.addAttribute("pizzaForm", new PizzaTareaDTO("", "", 0.0));  // formulario limpio
        model.addAttribute("pizzas", pizzas);
        return "PizzaVista";
    }
}