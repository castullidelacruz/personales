package com.facturacion.gestionfacturas.service;

import com.facturacion.gestionfacturas.model.Factura;

import java.util.List;

public interface IFacturaService {
    public List<Factura> getFacturas();

    public Factura getFactura(Long idFactura);

    public Factura findFactura(Long idFactura);

    public void deleteFactura(Long idFactura);

    public Factura saveFactura(Factura unaFactura);

    public Factura editFactura(Factura unaFactura);

}
