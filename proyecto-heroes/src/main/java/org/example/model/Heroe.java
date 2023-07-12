package org.example.model;

import javax.persistence.*;

@Entity
@Table(name = "heroes")
public class Heroe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombre", nullable = true, length = 180)
    private String nombre;

    @Column(name = "atributo", nullable = true, length = 180)
    private String atributo;

    @Column(name = "tipo", nullable = true, length = 180)
    private String tipo;

    @Column(name = "complejidad", nullable = true, length = 180)
    private String complejidad;

    @Column(name = "etiqueta", nullable = true, length = 180)
    private String etiqueta;

    public Heroe() {

    }
    public Heroe(Long id, String nombre, String atributo, String tipo, String complejidad, String etiqueta) {
        this.id = id;
        this.nombre = nombre;
        this.atributo = atributo;
        this.tipo = tipo;
        this.complejidad = complejidad;
        this.etiqueta = etiqueta;
    }
    public Heroe(String nombre, String atributo, String tipo, String complejidad, String etiqueta) {
        this.nombre = nombre;
        this.atributo = atributo;
        this.tipo = tipo;
        this.complejidad = complejidad;
        this.etiqueta = etiqueta;
    }

    public Heroe(String nombre, String atributo) {
        this.nombre = nombre;
        this.atributo = atributo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(String complejidad) {
        this.complejidad = complejidad;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }
}
