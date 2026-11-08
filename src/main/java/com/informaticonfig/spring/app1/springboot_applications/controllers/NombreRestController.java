package com.informaticonfig.spring.app1.springboot_applications.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/*
Este ejemplo propio no trabaja con vistas de thymeleaf, en 
vez de eso la información retornará en formato JSON

En este punto crearé un HashMap con valores por defecto, tambien tendré
3 endpoints, 2 serán de tipo get (el primero retorna mis datos y el segundo retorna el map)
y el tercero retorna un valor del map cuando se ingresa un id en especifico

Los endpoints son simples entonces no es una buena practica usarlos tal cual están para un proyecto real 
*/



@RestController 
public class NombreRestController {
    //atributo privado de la clase
    private Map<Integer,Object> Comidas = new HashMap<>();

    //constructor para inicializar el HashMap con valores X
    public NombreRestController() {
        Comidas.put(1, "Tacos");
        Comidas.put(2, "Pizza");
        Comidas.put(3, "Hamburguesa");
    }


    @GetMapping("/NombreRestController")
    public Map<String,Object> info(){
        Map<String,Object> model = new HashMap<>();
        model.put("Materia","Programación Web");
        model.put("Horario", "10:00 a 11:00");
        model.put("Nombre", "Oliver Gildardo Enriquez Valencia");
        model.put("Numero", "23160889");
        model.put("Lista", "8");
        return model;
    }

    @GetMapping("/NombreRestControllerComida")
    public Map<Integer,Object> comida(){
        return Comidas;
    }

    @GetMapping("/NombreRestControllerComida/id/{id}")
    public Object obtenerComidaPorId(@PathVariable Integer id) {
        if (Comidas.containsKey(id)) {
            return Comidas.get(id);
        }
        return "NO existe una comida con ese id";
    }
    
}

