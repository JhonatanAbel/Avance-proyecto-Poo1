package org.example.servicio;

import org.example.model.Heroe;

import java.util.List;

public interface InterfaceHeroeServicio {
    public List<Heroe> listarHeroe();
    public Heroe agregarHeroe(Heroe heroe);
    public Heroe actulizarHeroe(Heroe heroe);
    public void eliminarHeroe(Long id);
    public Heroe buscarHeroe(Long id);

}