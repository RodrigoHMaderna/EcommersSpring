package com.rodri.ecommers.ecommers.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Orden {
    private Integer id;
    private String numero;
    private Date fechaCreacion;
    private Date fechaRecibido;

    private double total;


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
