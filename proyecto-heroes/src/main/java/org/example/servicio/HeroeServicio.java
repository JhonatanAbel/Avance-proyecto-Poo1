package org.example.servicio;

import org.example.repositorio.CursoRepositorio;
import org.example.model.Heroe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroeServicio implements InterfaceHeroeServicio {
    @Autowired
    private CursoRepositorio repositorio;
    @Override
    public List<Heroe> listarHeroe() {
        return (List<Heroe>) repositorio.findAll();
    }
    /*
    @Override
    public Curso agregarCurso(Curso curso) {
        curso.setId(curso.getId());
        curso.setCredito(curso.getCredito());
        curso.setNombre(curso.getCredito());
        return this.repositorio.save(curso);
        //return repositorio.save(curso);
    }*/
    public Heroe agregarHeroe(Heroe heroe){
        return repositorio.save(heroe);
    }
    @Override
    public Heroe actulizarHeroe(Heroe heroe) {
        return this.repositorio.save(heroe);
    }
    public Heroe buscarHeroe(Long id){
        return this.repositorio.findById(id).get();
    }
    @Override
    public void eliminarHeroe(Long id) {
        repositorio.deleteById(id);
    }
}
