package br.com.senai.pagamento.adapter.in.controller;

import br.com.senai.pagamento.adapter.in.controller.response.PaymentDetailsResponse;
import br.com.senai.pagamento.adapter.in.controller.resquest.CreatePaymentRequest;
import br.com.senai.pagamento.adapter.in.controller.resquest.RefundPaymentRequest;
import br.com.senai.pagamento.application.port.in.StdPayament;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController implements StdPayament {
    @Override
    public ResponseEntity<PaymentDetailsResponse> toPay(CreatePaymentRequest data) {
        return null;
    }

    @Override
    public ResponseEntity<Void> toRefund(RefundPaymentRequest data) {
        return null;
    }
}
