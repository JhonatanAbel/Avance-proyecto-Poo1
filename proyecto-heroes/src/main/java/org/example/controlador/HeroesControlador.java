package org.example.controlador;

import org.example.model.Heroe;
import org.example.servicio.HeroeServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HeroesControlador {

    @Autowired
    private HeroeServicio servicio;

    @GetMapping({ "/heroes/index"})
    public String listarHeroes(Model model) {
        model.addAttribute("heroes", servicio.listarHeroe());
        return "heroe/index"; // nos retorna al archivo estudiantes
    }

    @GetMapping("/heroes/nuevo")
    public String mostrarFormularioDeRegistrtarHeroes(Model model) {
        Heroe heroe = new Heroe();
        model.addAttribute("heroe", heroe);
        return "heroe/create";
    }

    @PostMapping("/heroes")
    public String guardarHeroe(@ModelAttribute("heroe") Heroe heroe) {
        servicio.agregarHeroe(heroe);
        return "redirect:/heroe/index";
    }

    @GetMapping("/heroes/editar/{id}")
    public String mostrarFormularioEditarHeroes(@PathVariable Long id, Model modelo) {
        modelo.addAttribute("heroe", servicio.buscarHeroe(id));
        return "heroe/editar";
    }

    @PostMapping("/heroes/{id}")
    public String actualizarHeroe(@PathVariable Long id, @ModelAttribute("heroe") Heroe heroe, Model modelo) {
        Heroe heroeexist = servicio.buscarHeroe(id);
        heroeexist.setId(id);
        heroeexist.setNombre(heroe.getNombre());
        heroeexist.setAtributo(heroe.getAtributo());
        heroeexist.setTipo(heroe.getTipo());
        heroeexist.setComplejidad(heroe.getComplejidad());
        heroeexist.setEtiqueta(heroe.getEtiqueta());

        servicio.actulizarHeroe(heroeexist);
        return "redirect:/heroe/index";
    }

    @GetMapping("/heroes/{id}")
    public String eliminarHeroe(@PathVariable Long id) {
        servicio.eliminarHeroe(id);
        return "redirect:/heroe/index";
    }
}

