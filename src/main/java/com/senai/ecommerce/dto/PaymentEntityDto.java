package com.senai.ecommerce.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.time.LocalDate;

@Value
public class PaymentEntityDto {
    @NotNull
    LocalDate moment;
    @NotNull
    OrderEntityDto
}
