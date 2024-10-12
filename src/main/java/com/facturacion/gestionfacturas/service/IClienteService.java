package com.facturacion.gestionfacturas.service;

import com.facturacion.gestionfacturas.model.Cliente;
import com.facturacion.gestionfacturas.model.Factura;

import java.util.List;

public interface IClienteService {
    public List<Cliente> getClientes();

    public Cliente getCliente(Long idCliente);

    public Cliente findCliente(Long idCliente);

    public void deleteCliente(Long idCliente);

    public Cliente saveCliente(Cliente unCliente);

    public Cliente editCliente(Cliente unCliente);
}
