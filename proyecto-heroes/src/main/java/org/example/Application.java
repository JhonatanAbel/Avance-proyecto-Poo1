package org.example;

import org.example.model.Heroe;
import org.example.repositorio.CursoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private CursoRepositorio repositorio;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Heroe heroe1 = new Heroe("Axe", "Fuerza","Asesino","baja","C.a cuerpo");
        repositorio.save(heroe1);
        Heroe heroe2 = new Heroe("Io", "Inteligencia", "Soporte", "Avanzado", "A. a ditancia");
        repositorio.save(heroe2);
    }
}
