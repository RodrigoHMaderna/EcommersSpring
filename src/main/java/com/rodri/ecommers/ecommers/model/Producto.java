package com.rodri.ecommers.ecommers.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Producto {
    private Integer id;
    private String nombre;
    private String description;
    private String imagen;
    private double precio;
    private int cantidad;


    public Producto() {
    }

    public Producto(Integer id, String nombre, String description, String imagen, double precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.description = description;
        this.imagen = imagen;
        this.precio = precio;
        this.cantidad = cantidad;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", description='" + getDescription() + "'" +
            ", imagen='" + getImagen() + "'" +
            ", precio='" + getPrecio() + "'" +
            ", cantidad='" + getCantidad() + "'" +
            "}";
    }




    
}
