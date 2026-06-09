package br.com.senai.pagamento.application.core.mapper;

import br.com.senai.pagamento.adapter.in.controller.resquest.CreatePaymentRequest;
import br.com.senai.pagamento.application.core.domain.enums.PaymentGateway;
import br.com.senai.pagamento.application.core.domain.enums.PaymentMethod;
import br.com.senai.pagamento.application.core.domain.enums.PaymentStatus;
import br.com.senai.pagamento.application.core.domain.model.PaymentDomain;
import org.springframework.stereotype.Component;

@Component
public class PaymentMapper {
    public PaymentDomain toDomain(CreatePaymentRequest data) {
        return new PaymentDomain(
               null,
                data.businessReference(),
                data.sourceSystem(),
                data.serviceName(),
                data.amount(),
                data.gateway(),
                data.method(),
                data.customerName(),
                data.customerEmail(),
                data.createdAt(),
                data.status(),
                data.externalPaymentId(),
                data.qrCode(),
                data.pixCode(),
                data.createdAt()
        );
    }
}
