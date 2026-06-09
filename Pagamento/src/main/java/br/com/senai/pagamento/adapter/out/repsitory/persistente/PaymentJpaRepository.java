package br.com.senai.pagamento.adapter.out.repsitory.persistente;

import br.com.senai.pagamento.adapter.out.repsitory.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PaymentJpaRepository extends JpaRepository<PaymentEntity, UUID> {
}
