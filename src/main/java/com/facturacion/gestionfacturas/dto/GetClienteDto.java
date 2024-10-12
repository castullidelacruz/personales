package com.facturacion.gestionfacturas.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class GetClienteDto {
    private String razonSocial;
    private int cuit;
    private int telefono;

    public GetClienteDto() {
    }

    public GetClienteDto(String razonSocial, int cuit, int telefono) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.telefono = telefono;
    }
}
