package br.com.senai.pagamento.application.core.domain.model;

import br.com.senai.pagamento.application.core.domain.enums.PaymentGateway;
import br.com.senai.pagamento.application.core.domain.enums.PaymentMethod;
import br.com.senai.pagamento.application.core.domain.enums.PaymentStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;


public class PaymentDomain {
    private UUID paymentId;
    private PaymentGateway paymentGateway;
    private String businessReference;
    private String sourceSystem;
    private String serviceName;
    private BigDecimal amount;
    private PaymentGateway gateway;
    private PaymentMethod method;
    private String customerName;
    private String customerEmail;
    private LocalDateTime createdAt;
    private PaymentStatus status;
    private String externalPaymentId;
    private String qrCode;
    private String pixCode;
    private LocalDateTime updatedAt;


    public PaymentDomain() {
    }

    public PaymentDomain(UUID paymentId,
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
                         LocalDateTime updatedAt) {
        this.paymentId = paymentId;
        this.businessReference = businessReference;
        this.sourceSystem = sourceSystem;
        this.serviceName = serviceName;
        this.amount = amount;
        this.gateway = gateway;
        this.method = method;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.createdAt = createdAt;
        this.status = status;
        this.externalPaymentId = externalPaymentId;
        this.qrCode = qrCode;
        this.pixCode = pixCode;
        this.updatedAt = updatedAt;
    }

    public UUID getPaymentId() {
        return paymentId;
    }

    public PaymentGateway getPaymentGateway() {
        return paymentGateway;
    }

    public String getBusinessReference() {
        return businessReference;
    }

    public String getSourceSystem() {
        return sourceSystem;
    }

    public String getServiceName() {
        return serviceName;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public PaymentGateway getGateway() {
        return gateway;
    }

    public PaymentMethod getMethod() {
        return method;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public String getExternalPaymentId() {
        return externalPaymentId;
    }

    public String getQrCode() {
        return qrCode;
    }

    public String getPixCode() {
        return pixCode;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
