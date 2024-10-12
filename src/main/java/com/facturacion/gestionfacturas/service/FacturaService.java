package com.facturacion.gestionfacturas.service;

import aj.org.objectweb.asm.commons.TryCatchBlockSorter;
import com.facturacion.gestionfacturas.model.Factura;
import com.facturacion.gestionfacturas.repository.IFacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaService implements IFacturaService {
    @Autowired
    private IFacturaRepository facturaRepo;

    @Override
    public List<Factura> getFacturas() {
        return facturaRepo.findAll();
    }

    @Override
    public Factura getFactura(Long idFactura) {
        return this.findFactura(idFactura);
    }

    @Override
    public Factura findFactura(Long idFactura) {
        return facturaRepo.findById(idFactura).orElse(null);
    }

    @Override
    public void deleteFactura(Long idFactura) {
        facturaRepo.deleteById(idFactura);
    }

    @Override
    public Factura saveFactura(Factura unaFactura) {
        return facturaRepo.save(unaFactura);
    }

    @Override
    public Factura editFactura(Factura unaFactura) {
        return this.saveFactura(unaFactura);
    }
}
