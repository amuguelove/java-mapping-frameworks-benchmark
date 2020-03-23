package com.github.amuguelove.model.source;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private BigDecimal price;
    private int quantity;
    private String name;

    String description;
    boolean available;
    private RefundPolicy refundPolicy;
}
