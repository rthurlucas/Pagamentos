package br.com.senai.pagamento.adapter.in.controller.resquest;

import br.com.senai.pagamento.application.core.domain.enums.PaymentGateway;
import br.com.senai.pagamento.application.core.domain.enums.PaymentMethod;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record CreatePaymentRequest (
    @NotBlank
    String businessReference,
    @NotBlank
    String sourceSystem,
    @NotBlank
    String serviceName,
    @NotNull
    BigDecimal amount,
    @NotNull
    PaymentGateway gateway,
    @NotNull
    PaymentMethod method,
    @NotBlank
    String customerName,
    @NotBlank
    String customerEmail,
    @NotNull
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    LocalDateTime createdAt
){
}
