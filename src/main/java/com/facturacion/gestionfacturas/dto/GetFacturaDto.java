package com.facturacion.gestionfacturas.dto;

import com.facturacion.gestionfacturas.model.Cliente;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class GetFacturaDto {
    private int nroFactura;
    private int monto;
    private ClienteDto unCliente;

    public GetFacturaDto() {
    }

    public GetFacturaDto(int nroFactura, int monto, ClienteDto unCliente) {
        this.nroFactura = nroFactura;
        this.monto = monto;
        this.unCliente = unCliente;
    }
}
