package br.com.senai.pagamento.adapter.in.consumer;

import br.com.senai.pagamento.adapter.in.consumer.event.PaymentRequestEvent;
import br.com.senai.pagamento.adapter.in.consumer.event.RefundRequestEvent;
import br.com.senai.pagamento.application.port.in.EventConsumer;
import org.springframework.stereotype.Component;

@Component
public class EventConsumerImpl implements EventConsumer {

    @Override
    public void paymentConsumer(PaymentRequestEvent event) {

    }

    @Override
    public void refundConsumer(RefundRequestEvent event) {

    }
}
