package com.github.amuguelove.model.source;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryData {

    private Address deliveryAddress;

    private boolean isPrePaid;

    private String trackingCode;
    private int expectedDeliveryTimeInDays;

}
