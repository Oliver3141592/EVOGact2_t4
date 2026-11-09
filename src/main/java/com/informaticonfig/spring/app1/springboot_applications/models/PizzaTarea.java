package com.informaticonfig.spring.app1.springboot_applications.models;

public class PizzaTarea {
    private int id;
    private String nombre;
    private String ingredientes;
    private String tamaño;
    private double precio;


    public PizzaTarea(int id, String nombre, String ingredientes, String tamaño, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.tamaño = tamaño;
        this.precio = precio;
    }


    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getIngredientes() { return ingredientes; }
    public void setIngredientes(String ingredientes) { this.ingredientes = ingredientes; }

    public String getTamaño() { return tamaño; }
    public void setTamaño(String tamaño) { this.tamaño = tamaño; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
}