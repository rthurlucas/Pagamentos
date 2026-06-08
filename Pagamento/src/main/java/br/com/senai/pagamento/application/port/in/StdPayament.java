package br.com.senai.pagamento.application.port.in;

import br.com.senai.pagamento.adapter.in.controller.response.PaymentDetailsResponse;
import br.com.senai.pagamento.adapter.in.controller.resquest.CreatePaymentRequest;
import br.com.senai.pagamento.adapter.in.controller.resquest.RefundPaymentRequest;
import org.springframework.http.ResponseEntity;

public interface StdPayament {
    ResponseEntity<PaymentDetailsResponse> toPay(CreatePaymentRequest data);

    ResponseEntity<Void> toRefund(RefundPaymentRequest data);
}
