package com.facturacion.gestionfacturas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FacturaController {
    @GetMapping("/facturas")
    public String getFacturas(){
        return "Hola Mundo";
    }
}
