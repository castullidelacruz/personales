package com.facturacion.gestionfacturas.controller;

import com.facturacion.gestionfacturas.dto.GetClienteDto;
import com.facturacion.gestionfacturas.model.Cliente;
import com.facturacion.gestionfacturas.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {
    @Autowired
    private IClienteService clienteServ;

    @GetMapping("/clientes")
    public List<Cliente> getClientes(){
        return clienteServ.getClientes();
    }

    @GetMapping("/clientes/{idCliente}")
    public Cliente getCliente(@PathVariable Long idCliente){
        return clienteServ.getCliente(idCliente);
    }

    @PostMapping("/clientes/create")
    public Cliente saveFactura(@RequestBody Cliente unCliente){
        return clienteServ.saveCliente(unCliente);
    }

    @DeleteMapping("/clientes/delete/{idCliente}")
    public void deleteCliente(@PathVariable Long idCliente){
        clienteServ.deleteCliente(idCliente);
    }

    @PutMapping("/clientes/edit")
    public Cliente editCliente(@RequestBody Cliente unCliente){
        return clienteServ.editCliente(unCliente);
    }

    @GetMapping("/cliente/{idCliente}")
    public GetClienteDto getClienteDto(@PathVariable Long idCliente){
        Cliente nuevo = this.getCliente(idCliente);
    //    FacturaDto facturaDto = new FacturaDto();
        GetClienteDto getClienteDto = new GetClienteDto();

        getClienteDto.setCuit(nuevo.getCuit());
        getClienteDto.setRazonSocial(nuevo.getRazonSocial());
        getClienteDto.setTelefono(nuevo.getTelefono());
        return getClienteDto;
    }
}
