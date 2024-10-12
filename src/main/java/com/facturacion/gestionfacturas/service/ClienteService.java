package com.facturacion.gestionfacturas.service;

import com.facturacion.gestionfacturas.model.Cliente;
import com.facturacion.gestionfacturas.model.Factura;
import com.facturacion.gestionfacturas.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements IClienteService {
    @Autowired
    private IClienteRepository clienteRepo;
    @Override
    public List<Cliente> getClientes() {
        return clienteRepo.findAll();
    }

    @Override
    public Cliente getCliente(Long idCliente) {
        return this.findCliente(idCliente);
    }

    @Override
    public Cliente findCliente(Long idCliente) {
        return clienteRepo.findById(idCliente).orElse(null);
    }

    @Override
    public void deleteCliente(Long idCliente) {
    clienteRepo.deleteById(idCliente);
    }

    @Override
    public Cliente saveCliente(Cliente unCliente) {
        return clienteRepo.save(unCliente);
    }

    @Override
    public Cliente editCliente(Cliente unCliente) {
        return this.saveCliente(unCliente);
    }
}
