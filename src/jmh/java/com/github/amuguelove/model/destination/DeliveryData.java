package com.github.amuguelove.model.destination;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryData {

    private Address deliveryAddress;

    private boolean isPrePaid;

    private String trackingCode;
    private int expectedDeliveryTimeInDays;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if(o.getClass() == com.github.amuguelove.model.source.DeliveryData.class) {
            com.github.amuguelove.model.source.DeliveryData deliveryData =
              (com.github.amuguelove.model.source.DeliveryData) o;
            return isPrePaid == deliveryData.isPrePaid() &&
              expectedDeliveryTimeInDays == deliveryData.getExpectedDeliveryTimeInDays() &&
              Objects.equals(deliveryAddress, deliveryData.getDeliveryAddress()) &&
              Objects.equals(trackingCode, deliveryData.getTrackingCode());
        }
        if (o.getClass() != getClass()) return false;
        DeliveryData that = (DeliveryData) o;
        return isPrePaid == that.isPrePaid &&
          expectedDeliveryTimeInDays == that.expectedDeliveryTimeInDays &&
          Objects.equals(deliveryAddress, that.deliveryAddress) &&
          Objects.equals(trackingCode, that.trackingCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deliveryAddress, isPrePaid, trackingCode, expectedDeliveryTimeInDays);
    }
}
