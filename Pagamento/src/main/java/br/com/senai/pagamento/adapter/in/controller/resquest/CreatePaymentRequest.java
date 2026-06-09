package br.com.senai.pagamento.adapter.in.controller.resquest;

import br.com.senai.pagamento.application.core.domain.enums.PaymentGateway;
import br.com.senai.pagamento.application.core.domain.enums.PaymentMethod;
import br.com.senai.pagamento.application.core.domain.enums.PaymentStatus;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public record CreatePaymentRequest (
         PaymentGateway paymentGateway,
         String businessReference,
         String sourceSystem,
         String serviceName,
         BigDecimal amount,
         PaymentGateway gateway,
         PaymentMethod method,
         String customerName,
         String customerEmail,
         LocalDateTime createdAt,
         PaymentStatus status,
         String externalPaymentId,
         String qrCode,
         String pixCode,
         LocalDateTime updatedAt
){
}
