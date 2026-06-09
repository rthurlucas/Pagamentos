package br.com.senai.pagamento.adapter.out.repsitory.entity;

import br.com.senai.pagamento.application.core.domain.enums.PaymentGateway;
import br.com.senai.pagamento.application.core.domain.enums.PaymentMethod;
import br.com.senai.pagamento.application.core.domain.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "Payment")
@Table(name = "payments")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "paymentId")
public class PaymentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "payment_id")
    private UUID paymentId;


    @Enumerated(EnumType.STRING)
    private PaymentGateway paymentGateway;
    @Column(
            name = "business-reference",
    nullable = false,
    unique = true)
    private String businessReference;
    @Column(name = "source_system",
    nullable = false)
    private String sourceSystem;
    @Column(name = "service_name",
    nullable = false)
    private String serviceName;
    @Column(nullable = false)
    private BigDecimal amount;
    @Enumerated(EnumType.STRING)
    private PaymentGateway gateway;
    @Enumerated(EnumType.STRING)
    private PaymentMethod method;
    @Column(name = "customer_name",
    nullable = false)
    private String customerName;
    @Column(name = "customer_email", nullable = false)
    private String customerEmail;
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PaymentStatus status;
    @Column(name = "external_payment_id",
    unique = true)
    private String externalPaymentId;
    @Column(name = "qr_code")
    @Lob
    private String qrCode;
    @Column(name = "pix_code")
    private String pixCode;
    @Column(name = "update-at")
    private LocalDateTime updatedAt;

    public PaymentEntity(UUID paymentId, PaymentGateway paymentGateway, String businessReference, String sourceSystem, String serviceName, BigDecimal amount, PaymentMethod method, String customerName, String customerEmail, LocalDateTime localDateTime, PaymentStatus status, String externalPaymentId, String qrCode, String pixCode, LocalDateTime updatedAt) {
    }
}
