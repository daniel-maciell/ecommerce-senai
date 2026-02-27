package com.senai.ecommerce.dto;

import com.senai.ecommerce.entities.PaymentEntity;
import com.senai.ecommerce.entities.UserEntity;
import com.senai.ecommerce.enums.StatusDoPedido;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class OrderEntityDto {
    private LocalDate moment;
    @NotNull
    private StatusDoPedido status;
    @NotNull
    private UserEntity client;
    @NotNull
    private PaymentEntity payment;
}
