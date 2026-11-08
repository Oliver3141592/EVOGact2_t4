package com.informaticonfig.spring.app1.springboot_applications.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
        model.addAttribute("Titulo", "Servidor en linea");
        model.addAttribute("Servidor", "Informaticonfig");
        model.addAttribute("Ip", "192.168.10.1");
        return "detalles_info";
    }
}
