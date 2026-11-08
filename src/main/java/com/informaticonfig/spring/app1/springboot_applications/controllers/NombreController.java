package com.informaticonfig.spring.app1.springboot_applications.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/*
En este punto vamos a trabajar con vistas de Thymeleaf como en el video,
el objetivo es mostrar en la vista mi nombre, mi numero de control, la materia 
y mi numero de lista	
*/


/*En este controlador solo voy a manejar un endpoint, pero en los controladores REST usaré más*/

@Controller 
public class NombreController {
    @GetMapping("/NombreController")
    public String info(Model model){
        model.addAttribute("Nombre", "Oliver Gildardo Enriquez Valencia");
        model.addAttribute("Numero", "23160889");
        model.addAttribute("Lista", "8");
        return "TareaControlador1";
    }
}
