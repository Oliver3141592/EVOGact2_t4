package com.informaticonfig.spring.app1.springboot_applications.controllers;

//import java.util.HashMap;
//import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.informaticonfig.spring.app1.springboot_applications.models.Empleados;
import com.informaticonfig.spring.app1.springboot_applications.models.DTO.ClaseDTO;

/*
En este ejemplo NO vamos a trabajar con vistas de Thymeleaf, en su lugar usaremos
REST controllers lo que nos permite retornar datos en formato JSON, el navegador
hace una petición a una ruta (localhost:9525/dealles_info2), el controlador la
recibe y devuelve un objeto JSON correspondiente.
*/


@RestController 
@RequestMapping ("/api")

public class EjemploRestController {
    
    @GetMapping("/detalles_info2")

    public ClaseDTO info(){
        //Empleados empleado1=new Empleados("Oliver","Martinez","Calle 123","Programador",30,"9516088387",1);
        ClaseDTO usuario1=new ClaseDTO();
        usuario1.setTitulo("Administrador");
        usuario1.setUsaurio("InformaticConfig");


        //Map<String,Object> model = new HashMap<>();
        //model.put("Empleado",empleado1);
        
        
        return usuario1;
    }
}

