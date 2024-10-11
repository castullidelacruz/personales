package com.facturacion.gestionfacturas.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idFactura;
    private int nroFactura;
    private int monto;

    public Factura() {
    }

    public Factura(Long idFactura, int nroFactura, int monto) {
        this.idFactura = idFactura;
        this.nroFactura = nroFactura;
        this.monto = monto;
    }
}
