package com.mycompany.veterinaria.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mascota implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int num_cliente;
    private String nombre;
    private String color;
    private String raza;
    private String alergico;
    private String atencio_especial;
    private String observaciones;
    @OneToOne
    private Duenio unDuenio;

    public Mascota() {
    }

    public Mascota(int num_cliente, String nombre, String color, String raza, String alergico, String atencio_especial, String observaciones, Duenio unDuenio) {
        this.num_cliente = num_cliente;
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.alergico = alergico;
        this.atencio_especial = atencio_especial;
        this.observaciones = observaciones;
        this.unDuenio = unDuenio;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAtencio_especial() {
        return atencio_especial;
    }

    public void setAtencio_especial(String atencio_especial) {
        this.atencio_especial = atencio_especial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Duenio getUnDuenio() {
        return unDuenio;
    }

    public void setUnDuenio(Duenio unDuenio) {
        this.unDuenio = unDuenio;
    }

}
