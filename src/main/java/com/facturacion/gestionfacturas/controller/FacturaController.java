package com.facturacion.gestionfacturas.controller;

import com.facturacion.gestionfacturas.dto.ClienteDto;
import com.facturacion.gestionfacturas.dto.GetFacturaDto;
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

    @GetMapping("/factura/{idFactura}")
    public GetFacturaDto getFacturaDto(@PathVariable Long idFactura){
        Factura nueva = this.getFactura(idFactura);
        GetFacturaDto nuevoDto = new GetFacturaDto();
        ClienteDto clienteDto = new ClienteDto();
        clienteDto.setIdCliente(nueva.getUnCliente().getIdCliente());
        clienteDto.setCuit(nueva.getUnCliente().getCuit());
        clienteDto.setRazonSocial(nueva.getUnCliente().getRazonSocial());
        clienteDto.setTelefono(nueva.getUnCliente().getTelefono());
        nuevoDto.setNroFactura(nueva.getNroFactura());
        nuevoDto.setMonto(nueva.getMonto());
        nuevoDto.setUnCliente(clienteDto);
        return nuevoDto;
    }
}
