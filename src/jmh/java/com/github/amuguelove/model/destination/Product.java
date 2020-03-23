package com.github.amuguelove.model.destination;

import com.google.common.base.Objects;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (o.getClass() == com.github.amuguelove.model.source.Product.class) {
            com.github.amuguelove.model.source.Product product =
              (com.github.amuguelove.model.source.Product) o;
            return quantity == product.getQuantity() &&
              available == product.isAvailable() &&
              Objects.equal(price, product.getPrice()) &&
              Objects.equal(name, product.getName()) &&
              Objects.equal(description, product.getDescription()) &&
              Objects.equal(refundPolicy, product.getRefundPolicy());
        }
        if(o.getClass() != getClass()) return false;
        Product product = (Product) o;
        return quantity == product.quantity &&
          available == product.available &&
          Objects.equal(price, product.price) &&
          Objects.equal(name, product.name) &&
          Objects.equal(description, product.description) &&
          Objects.equal(refundPolicy, product.refundPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(price, quantity, name, description, available, refundPolicy);
    }
}
