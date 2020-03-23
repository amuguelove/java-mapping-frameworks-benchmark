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
public class Discount {

    private String startTime;
    private String endTime;
    private BigDecimal discountPrice;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (o.getClass() == com.github.amuguelove.model.source.Discount.class) {
            com.github.amuguelove.model.source.Discount discount =
              (com.github.amuguelove.model.source.Discount) o;
            return Objects.equal(startTime, discount.getStartTime()) &&
              Objects.equal(endTime, discount.getEndTime()) &&
              Objects.equal(discountPrice, discount.getDiscountPrice());
        }
        if(o.getClass() != getClass()) return false;
        Discount discount = (Discount) o;
        return Objects.equal(startTime, discount.startTime) &&
                Objects.equal(endTime, discount.endTime) &&
                Objects.equal(discountPrice, discount.discountPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(startTime, endTime, discountPrice);
    }
}
