package com.informaticonfig.spring.app1.springboot_applications.controllersTarea;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.informaticonfig.spring.app1.springboot_applications.models.DTO.PizzaTareaDTO;

/*
En este controlador NO se usan vistas de Thymeleaf: se usa @RestController,
que devuelve datos en formato JSON. El navegador o Postman hace una petición
a una ruta (localhost:8082/api/pizzas), el controlador la recibe y devuelve
un objeto JSON.
*/

@RestController
@RequestMapping("/api")
public class PizzaRestController {

    
    @GetMapping("/pizzas")
    public PizzaTareaDTO info() {
        return new PizzaTareaDTO("Peperoni", "Queso, peperoni, salsa de tomate", 150.0);
    }

    
    @PostMapping("/pizzas")
    public PizzaTareaDTO crear(@RequestBody PizzaTareaDTO pizza) {
        System.out.println("Pizza recibida: " + pizza.getNombre());
        return pizza;
    }
}