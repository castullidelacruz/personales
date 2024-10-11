package com.facturacion.gestionfacturas.repository;

import com.facturacion.gestionfacturas.model.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFacturaRepository extends JpaRepository<Factura,Long> {
}
