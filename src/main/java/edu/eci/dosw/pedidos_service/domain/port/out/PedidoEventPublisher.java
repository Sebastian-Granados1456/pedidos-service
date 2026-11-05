package edu.eci.dosw.pedidos_service.domain.port.out;

import edu.eci.dosw.pedidos_service.domain.model.PedidoCreadoEvent;

public interface PedidoEventPublisher {
    void publicarPedidoCreado(PedidoCreadoEvent evento);
}
