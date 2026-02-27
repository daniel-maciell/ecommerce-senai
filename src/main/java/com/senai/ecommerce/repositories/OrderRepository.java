package com.senai.ecommerce.repositories;


import com.senai.ecommerce.entities.OrderEntity;
import org.hibernate.validator.constraints.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, UUID>{

    OrderEntity findAllBy(UUID id);
}
