CREATE TABLE payments(
    payments_id UUID,
    business_reference VARCHAR(100) NOT NULL ,
    soucer_system VARCHAR(100) NOT NULL ,
    service_name VARCHAR(100) NOT NULL ,
    amout NUMERIC(19, 2) NOT NULL ,
    gateway VARCHAR(20) NOT NULL ,
    method VARCHAR(20) NOT NULL ,
    customer_name VARCHAR(100) NOT NULL ,
    customer_email VARCHAR(100) NOT NULL ,
    created_at TIMESTAMP NOT NULL ,
    external_payment_id VARCHAR(255) NOT NULL ,
    qr_code TEXT,
    pix_code TEXT,
    update_at TIMESTAMP,

    CONSTRAINT pk_payments PRIMARY KEY (payments_id)
);