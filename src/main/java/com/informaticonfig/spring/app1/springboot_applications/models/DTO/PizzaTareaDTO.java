package com.informaticonfig.spring.app1.springboot_applications.models.DTO;

public class PizzaTareaDTO {
    private String nombre;
    private String ingredientes;
    private double precio;

    public PizzaTareaDTO(String nombre, String ingredientes, double precio) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.precio = precio;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getIngredientes() { return ingredientes; }
    public void setIngredientes(String ingredientes) { this.ingredientes = ingredientes; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
}