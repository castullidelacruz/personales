package com.facturacion.gestionfacturas.controller;

import com.facturacion.gestionfacturas.model.Factura;
import com.facturacion.gestionfacturas.service.IFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FacturaController {
    @Autowired
    private IFacturaService facturaServ;

    @GetMapping("/facturas")
    public List<Factura> getFacturas(){
        return facturaServ.getFacturas();
    }

    @GetMapping("/facturas/{idFactura}")
    public Factura getFactura(@PathVariable Long idFactura){
        return facturaServ.getFactura(idFactura);
    }

    @PostMapping("/facturas/create")
    public Factura saveFactura(@RequestBody Factura unaFactura){
        return facturaServ.saveFactura(unaFactura);
    }

    @DeleteMapping("/facturas/delete/{idFactura}")
    public void deleteFactura(@PathVariable Long idFactura){
        facturaServ.deleteFactura(idFactura);
    }

    @PutMapping("/facturas/edit")
    public Factura editFactura(@RequestBody Factura unaFactura){
        return facturaServ.editFactura(unaFactura);
    }

}
