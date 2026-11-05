package edu.eci.dosw.pedidos_service.infraestructure.adapter.out.messaging;

import edu.eci.dosw.pedidos_service.domain.model.PedidoCreadoEvent;
import edu.eci.dosw.pedidos_service.domain.port.out.PedidoEventPublisher;
import edu.eci.dosw.pedidos_service.infraestructure.config.RabbitConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class RabbitPedidoEventPublisherImpl implements PedidoEventPublisher {
    private final RabbitTemplate rabbit;

    public RabbitPedidoEventPublisherImpl(RabbitTemplate rabbit) { this.rabbit = rabbit; }

    @Override
    public void publicarPedidoCreado(PedidoCreadoEvent evento) {
        rabbit.convertAndSend(RabbitConfig.EXCHANGE, "pedido.creado", evento);
    }
}