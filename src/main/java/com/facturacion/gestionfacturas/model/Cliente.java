package com.facturacion.gestionfacturas.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter @Setter
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idCliente;
    private String razonSocial;
    private int cuit;
    private int telefono;
    @OneToMany(mappedBy = "unCliente",fetch = FetchType.LAZY,
            cascade = {CascadeType.REMOVE,CascadeType.REFRESH})
    private List<Factura> facturas;
    /*
    @OneToOne
    @JoinColumn(name = "id_factura", referencedColumnName = "idFactura")
    private Factura factura;*/

    public Cliente() {
    }

    public Cliente(Long idCliente, String razonSocial, int cuit, int telefono) {
        this.idCliente = idCliente;
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.telefono = telefono;
    }
}
