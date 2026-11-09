package com.informaticonfig.spring.app1.springboot_applications.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.informaticonfig.spring.app1.springboot_applications.models.Empleados;

/*
En este punto vamos a trabajar con vistas de Thymeleaf, se establece una
comunicación entre el controlador y la vista: el navegador hace una petición
a una ruta (localhost:9525/dealles_info), el controlador la recibe y devuelve la vista correspondiente.

Para ello se crean dos elementos:
- La vista: un archivo HTML (detalles_info.html) ubicado en la carpeta
  src/main/resources/templates.
- El controlador: una clase Java (EjemploController) ubicada en el paquete controllers.	
*/


@Controller 
public class EjemploController {
    @GetMapping("/detalles_info")
    
    public String info(Model model){
        Empleados empleado1=new Empleados("Oliver","Martinez","Riveras del Atoyac","Programador",30,"9516088387",1);

        //System.out.println("Hasta aqui si llega");
        model.addAttribute("Empleado", empleado1);
        return "TareaControlador1";
    }

    @ModelAttribute("Empleados")
    public List<Empleados> getEmpleados() {
        return Arrays.asList(
            new Empleados("María", "Perez", "Calle segunda no.2", "Secretaria", 20, "123654987", 2),
            new Empleados("Juan", "Rodriguez", "Calle primera no.1", "Gerente", 35, "123456789", 1),
            new Empleados("Luis", "Martínez", "Calle tercera no.3", "Contador", 28, "987654321", 3),
            new Empleados("Ana", "González", "Avenida central no.4", "Diseñadora", 30, "456789123", 4),
            new Empleados("Pedro", "Sánchez", "Boulevard no.5", "Analista", 25, "789123456", 5)
        );
    }
}
