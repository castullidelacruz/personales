package com.facturacion.gestionfacturas.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter @Setter
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idFactura;
    private int nroFactura;
    private int monto;
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "id_cliente")
    private Cliente unCliente;

    public Factura() {
    }

    public Factura(Long idFactura, int nroFactura, int monto, Cliente unCliente) {
        this.idFactura = idFactura;
        this.nroFactura = nroFactura;
        this.monto = monto;
        this.unCliente = unCliente;
    }
}
