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
public class Discount {
    private String startTime;
    private String endTime;
    private BigDecimal discountPrice;
}
