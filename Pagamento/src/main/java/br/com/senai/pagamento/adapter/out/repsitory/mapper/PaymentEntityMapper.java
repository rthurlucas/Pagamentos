package br.com.senai.pagamento.adapter.out.repsitory.mapper;

import br.com.senai.pagamento.adapter.out.repsitory.entity.PaymentEntity;
import br.com.senai.pagamento.application.core.domain.model.PaymentDomain;

import java.time.LocalDateTime;

public class PaymentEntityMapper {
    public PaymentDomain toDomain(PaymentEntity paymentEntity) {
        return new PaymentDomain(
                paymentEntity.getPaymentId(),
                paymentEntity.getBusinessReference(),
                paymentEntity.getSourceSystem(),
                paymentEntity.getServiceName(),
                paymentEntity.getAmount(),
                paymentEntity.getPaymentGateway(),
                paymentEntity.getMethod(),
                paymentEntity.getCustomerName(),
                paymentEntity.getCustomerEmail(),
                paymentEntity.getCreatedAt(),
                paymentEntity.getStatus(),
                paymentEntity.getExternalPaymentId(),
                paymentEntity.getQrCode(),
                paymentEntity.getPixCode(),
                paymentEntity.getUpdatedAt()
                );
    }

    public PaymentEntity toEntity(PaymentDomain paymentDomain) {
        if (paymentDomain.getStatus() == null){
            throw new IllegalArgumentException("Status is null");
        }
        if (paymentDomain.getGateway() == null){
            throw new IllegalArgumentException("Gateway is null");
        }

        return new PaymentEntity(
                paymentDomain.getPaymentId(),
                paymentDomain.getPaymentGateway(),
                paymentDomain.getBusinessReference(),
                paymentDomain.getSourceSystem(),
                paymentDomain.getServiceName(),
                paymentDomain.getAmount(),
                paymentDomain.getMethod(),
                paymentDomain.getCustomerName(),
                paymentDomain.getCustomerEmail(),
                paymentDomain.getCreatedAt() != null ? paymentDomain.getCreatedAt() : LocalDateTime.now(),
                paymentDomain.getStatus(),
                paymentDomain.getExternalPaymentId(),
                paymentDomain.getQrCode(),
                paymentDomain.getPixCode(),
                paymentDomain.getUpdatedAt()
        );
    }
}
