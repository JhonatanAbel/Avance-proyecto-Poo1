package org.example.controlador;

import org.example.model.Heroe;
import org.example.servicio.HeroeServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/heroe")
public class HeroeControlador {
    @Autowired
    private HeroeServicio servicio;

    @GetMapping
    public List<Heroe> index(){
        return servicio.listarHeroe();
    }
    @PostMapping
    public Heroe store(@RequestBody Heroe heroe){
        return servicio.agregarHeroe(heroe);
    }
    @PutMapping("/{id}")
    public Heroe update(@PathVariable("id") Long id, @RequestBody Heroe heroe){
        Heroe c = new Heroe();
        c.setId(id);
        c.setNombre(heroe.getNombre());
        c.setAtributo(heroe.getAtributo());
        c.setTipo(heroe.getTipo());
        c.setComplejidad(heroe.getComplejidad());
        c.setEtiqueta(heroe.getEtiqueta());

        return servicio.actulizarHeroe(c);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        servicio.eliminarHeroe(id);
    }
}
