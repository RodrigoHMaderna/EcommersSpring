package com.rodri.ecommers.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ordenes")
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numero;
    private Date fechaCreacion;
    private Date fechaRecibido;

    private double total;

    @ManyToOne
    private Usuario usuario;

    @OneToOne(mappedBy = "orden")
    private DetalleOrden detalle;


    public Orden() {
    }

    public Orden(Integer id, String numero, Date fechaCreacion, Date fechaRecibido, double total) {
        this.id = id;
        this.numero = numero;
        this.fechaCreacion = fechaCreacion;
        this.fechaRecibido = fechaRecibido;
        this.total = total;
    }
    

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", numero='" + getNumero() + "'" +
            ", fechaCreacion='" + getFechaCreacion() + "'" +
            ", fechaRecibido='" + getFechaRecibido() + "'" +
            ", total='" + getTotal() + "'" +
            "}";
    }
    

}
