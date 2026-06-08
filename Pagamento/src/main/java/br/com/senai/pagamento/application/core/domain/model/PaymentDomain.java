package br.com.senai.pagamento.application.core.domain.model;

import br.com.senai.pagamento.application.core.domain.enums.PaymentGateway;
import br.com.senai.pagamento.application.core.domain.enums.PaymentMethod;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PaymentDomain {
    private String businessReference;
    private String sourceSystem;
    private String serviceName;
    private BigDecimal amount;
    private PaymentGateway gateway;
    private PaymentMethod method;
    private String customerName;
    private String customerEmail;
    private LocalDateTime createdAt;
}
