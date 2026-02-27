package com.senai.ecommerce.entities;


import com.senai.ecommerce.enums.StatusDoPedido;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private LocalDate moment;
    private StatusDoPedido status;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private UserEntity client;
}
