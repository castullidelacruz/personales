package com.facturacion.gestionfacturas.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ClienteDto {
    private Long idCliente;
    private String razonSocial;
    private int cuit;
    private int telefono;
}
