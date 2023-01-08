package com.rodri.ecommers.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String description;
    private String imagen;
    private double precio;
    private int cantidad;

    @ManyToOne
    private Usuario usuario;

    public Producto() {
    }

    public Producto(Integer id, String nombre, String description, String imagen, double precio, int cantidad, Usuario usuario) {
        this.id = id;
        this.nombre = nombre;
        this.description = description;
        this.imagen = imagen;
        this.precio = precio;
        this.cantidad = cantidad;
        this.usuario = usuario;
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
            ", usuario='" + getUsuario() + "'" +
            "}";
    }
 




    
}
