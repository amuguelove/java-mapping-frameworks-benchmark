package com.github.amuguelove.model.destination;

import com.github.amuguelove.model.source.SourceOrder;
import com.google.common.base.Objects;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private User orderingUser;
    private List<Product> orderedProducts;
    private OrderStatus orderStatus;
    private String orderDate;
    private String orderFinishDate;
    private PaymentType paymentType;
    private Discount discount;
    private int orderId;
    private DeliveryData deliveryData;
    private Shop offeringShop;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (o.getClass() == SourceOrder.class) {
            SourceOrder order =
              (SourceOrder) o;
            return Objects.equal(orderingUser, order.getOrderingUser()) &&
                    Objects.equal(orderedProducts, order.getOrderedProducts()) &&
                    orderStatus.ordinal() == order.getStatus().ordinal() &&
                    Objects.equal(orderDate, order.getOrderDate()) &&
                    Objects.equal(orderFinishDate, order.getOrderFinishDate()) &&
                    paymentType.ordinal() == order.getPaymentType().ordinal() &&
                    Objects.equal(discount, order.getDiscount()) &&
                    Objects.equal(deliveryData, order.getDeliveryData());
        }
        if (o.getClass() != getClass()) return false;
        Order order = (Order) o;
        return Objects.equal(orderingUser, order.orderingUser) &&
                Objects.equal(orderedProducts, order.orderedProducts) &&
                orderStatus == order.orderStatus &&
                Objects.equal(orderDate, order.orderDate) &&
                Objects.equal(orderFinishDate, order.orderFinishDate) &&
                paymentType == order.paymentType &&
                Objects.equal(discount, order.discount) &&
                Objects.equal(deliveryData, order.deliveryData);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(orderingUser, orderedProducts, orderStatus, orderDate, orderFinishDate, paymentType, discount, deliveryData);
    }
}
