package br.com.senai.pagamento.adapter.in.consumer.event;

import br.com.senai.pagamento.application.core.domain.enums.PaymentGateway;
import br.com.senai.pagamento.application.core.domain.enums.PaymentMethod;
import br.com.senai.pagamento.application.core.domain.enums.PaymentStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PaymentRequestEvent (
        PaymentGateway paymentGateway,
        String businessReference,
        String sourceSystem,
        String serviceName,
        BigDecimal amount,
        PaymentGateway gateway,
        PaymentMethod method,
        String customerName,
        String customerEmail,
        @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
        LocalDateTime createdAt,
        PaymentStatus status,
        String externalPaymentId,
        String qrCode,
        String pixCode,
        @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
        LocalDateTime updatedAt

){
}
