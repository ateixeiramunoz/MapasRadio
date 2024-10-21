package com.example.Mapasradio.controladores;

import com.example.Mapasradio.repositorios.EstacionRepository;
import com.example.Mapasradio.servicios.EstacionService;
import com.example.Mapasradio.entidades.Estacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class EstacionesController {

    @Autowired
    private EstacionService estacionService;

    @Autowired
    private EstacionRepository estacionRepository;

    @GetMapping("/estaciones")
    public List<Estacion> getEstaciones() {
        estacionService.init();
        return estacionRepository.findAll();
    }


}