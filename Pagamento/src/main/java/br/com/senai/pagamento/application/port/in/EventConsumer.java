package br.com.senai.pagamento.application.port.in;

import br.com.senai.pagamento.adapter.in.consumer.event.PaymentRequestEvent;
import br.com.senai.pagamento.adapter.in.consumer.event.RefundRequestEvent;

public interface EventConsumer {
    void paymentConsumer(PaymentRequestEvent event);
    void refundConsumer(RefundRequestEvent event);
}
