package br.com.senai.pagamento.adapter.out.repsitory;

import br.com.senai.pagamento.adapter.out.repsitory.persistente.PaymentJpaRepository;
import br.com.senai.pagamento.application.port.out.PaymentRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentRepositoryImpl implements PaymentRepository {
    private final PaymentJpaRepository paymentJpaRepository;
}
