package com.example.Mapasradio.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @GetMapping("")
    public String muestraMapaJson(Model model)
    {
        return "mapajson";
    }


}
