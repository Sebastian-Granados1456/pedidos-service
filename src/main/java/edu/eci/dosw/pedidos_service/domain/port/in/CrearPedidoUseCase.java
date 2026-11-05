package edu.eci.dosw.pedidos_service.domain.port.in;

import edu.eci.dosw.pedidos_service.domain.model.CrearPedidoRequest;

public interface CrearPedidoUseCase {
    String crear(CrearPedidoRequest pedido);
}
