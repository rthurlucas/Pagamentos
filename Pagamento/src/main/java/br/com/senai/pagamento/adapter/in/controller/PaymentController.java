package br.com.senai.pagamento.adapter.in.controller;

import br.com.senai.pagamento.adapter.in.controller.response.PaymentDetailsResponse;
import br.com.senai.pagamento.adapter.in.controller.resquest.CreatePaymentRequest;
import br.com.senai.pagamento.adapter.in.controller.resquest.RefundPaymentRequest;
import br.com.senai.pagamento.application.port.in.StdPayament;
import br.com.senai.pagamento.application.service.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pagameto/payment")
public class PaymentController implements StdPayament {
    private final PaymentService service;

    public PaymentController(PaymentService service){
        this.service = service;
    }
    @Override
    @PostMapping("/toPay")
    public ResponseEntity<PaymentDetailsResponse> toPay(CreatePaymentRequest data) {
        return ResponseEntity.ok(service.cretePayment(data);
    }

    @Override
    @PostMapping("/refund")
    public ResponseEntity<Void> toRefund(RefundPaymentRequest data) {
        service.refundPayment(data);
        return ResponseEntity.ok().build();
    }
}
