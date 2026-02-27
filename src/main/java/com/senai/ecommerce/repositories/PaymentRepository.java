package com.senai.ecommerce.repositories;

import com.senai.ecommerce.entities.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentEntity, UUID> {
    PaymentEntity findAllById(UUID id);
}
