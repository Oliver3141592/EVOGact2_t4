package com.informaticonfig.spring.app1.springboot_applications.controllers;

import java.util.HashMap;
import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
En este ejemplo NO vamos a trabajar con vistas de Thymeleaf, en su lugar usaremos
REST controllers lo que nos permite retornar datos en formato JSON, el navegador
hace una petición a una ruta (localhost:9525/dealles_info2), el controlador la
recibe y devuelve un objeto JSON correspondiente.
*/


@RestController 
public class EjemploRestController {
    @GetMapping("/detalles_info2")
    
    public Map<String,Object> info(){
        Map<String,Object> model = new HashMap<>();
        model.put("Formato","Formato tipo JSON");
        model.put("Titulo", "Servidor en linea");
        model.put("Servidor", "Informaticonfig");
        model.put("Ip", "192.168.10.1");
        return model;
    }
}

