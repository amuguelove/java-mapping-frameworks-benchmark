package com.github.amuguelove.mapstruct;

import com.github.amuguelove.model.destination.AccountStatus;
import com.github.amuguelove.model.destination.Address;
import com.github.amuguelove.model.destination.DeliveryData;
import com.github.amuguelove.model.destination.DestinationCode;
import com.github.amuguelove.model.destination.Order;
import com.github.amuguelove.model.destination.RefundPolicy;
import com.github.amuguelove.model.destination.Review;
import com.github.amuguelove.model.destination.Shop;
import com.github.amuguelove.model.destination.User;
import com.github.amuguelove.model.source.Discount;
import com.github.amuguelove.model.source.OrderStatus;
import com.github.amuguelove.model.source.PaymentType;
import com.github.amuguelove.model.source.Product;
import com.github.amuguelove.model.source.SourceCode;
import com.github.amuguelove.model.source.SourceOrder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-03-22T17:00:45+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_181 (Oracle Corporation)"
)
public class MapStructConverterImpl implements MapStructConverter {

    @Override
    public Order convert(SourceOrder sourceOrder) {
        if ( sourceOrder == null ) {
            return null;
        }

        Order order = new Order();

        order.setOrderStatus( orderStatusToOrderStatus( sourceOrder.getStatus() ) );
        order.setOrderingUser( userToUser( sourceOrder.getOrderingUser() ) );
        order.setOrderedProducts( productListToProductList( sourceOrder.getOrderedProducts() ) );
        order.setOrderDate( sourceOrder.getOrderDate() );
        order.setOrderFinishDate( sourceOrder.getOrderFinishDate() );
        order.setPaymentType( paymentTypeToPaymentType( sourceOrder.getPaymentType() ) );
        order.setDiscount( discountToDiscount( sourceOrder.getDiscount() ) );
        order.setOrderId( sourceOrder.getOrderId() );
        order.setDeliveryData( deliveryDataToDeliveryData( sourceOrder.getDeliveryData() ) );
        order.setOfferingShop( shopToShop( sourceOrder.getOfferingShop() ) );

        return order;
    }

    @Override
    public DestinationCode convert(SourceCode sourceCode) {
        if ( sourceCode == null ) {
            return null;
        }

        DestinationCode destinationCode = new DestinationCode();

        destinationCode.setCode( sourceCode.getCode() );

        return destinationCode;
    }

    protected com.github.amuguelove.model.destination.OrderStatus orderStatusToOrderStatus(OrderStatus orderStatus) {
        if ( orderStatus == null ) {
            return null;
        }

        com.github.amuguelove.model.destination.OrderStatus orderStatus1;

        switch ( orderStatus ) {
            case CREATED: orderStatus1 = com.github.amuguelove.model.destination.OrderStatus.CREATED;
            break;
            case CONFIRMED: orderStatus1 = com.github.amuguelove.model.destination.OrderStatus.CONFIRMED;
            break;
            case COLLECTING: orderStatus1 = com.github.amuguelove.model.destination.OrderStatus.COLLECTING;
            break;
            case IN_TRANSPORT: orderStatus1 = com.github.amuguelove.model.destination.OrderStatus.IN_TRANSPORT;
            break;
            case FINISHED: orderStatus1 = com.github.amuguelove.model.destination.OrderStatus.FINISHED;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + orderStatus );
        }

        return orderStatus1;
    }

    protected AccountStatus accountStatusToAccountStatus(com.github.amuguelove.model.source.AccountStatus accountStatus) {
        if ( accountStatus == null ) {
            return null;
        }

        AccountStatus accountStatus1;

        switch ( accountStatus ) {
            case ACTIVE: accountStatus1 = AccountStatus.ACTIVE;
            break;
            case NOT_ACTIVE: accountStatus1 = AccountStatus.NOT_ACTIVE;
            break;
            case BANNED: accountStatus1 = AccountStatus.BANNED;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + accountStatus );
        }

        return accountStatus1;
    }

    protected User userToUser(com.github.amuguelove.model.source.User user) {
        if ( user == null ) {
            return null;
        }

        User user1 = new User();

        user1.setUsername( user.getUsername() );
        user1.setEmail( user.getEmail() );
        user1.setUserAccountStatus( accountStatusToAccountStatus( user.getUserAccountStatus() ) );

        return user1;
    }

    protected RefundPolicy refundPolicyToRefundPolicy(com.github.amuguelove.model.source.RefundPolicy refundPolicy) {
        if ( refundPolicy == null ) {
            return null;
        }

        RefundPolicy refundPolicy1 = new RefundPolicy();

        refundPolicy1.setRefundable( refundPolicy.isRefundable() );
        refundPolicy1.setRefundTimeInDays( refundPolicy.getRefundTimeInDays() );
        List<String> list = refundPolicy.getNotes();
        if ( list != null ) {
            refundPolicy1.setNotes( new ArrayList<String>( list ) );
        }

        return refundPolicy1;
    }

    protected com.github.amuguelove.model.destination.Product productToProduct(Product product) {
        if ( product == null ) {
            return null;
        }

        com.github.amuguelove.model.destination.Product product1 = new com.github.amuguelove.model.destination.Product();

        product1.setPrice( product.getPrice() );
        product1.setQuantity( product.getQuantity() );
        product1.setName( product.getName() );
        product1.setDescription( product.getDescription() );
        product1.setAvailable( product.isAvailable() );
        product1.setRefundPolicy( refundPolicyToRefundPolicy( product.getRefundPolicy() ) );

        return product1;
    }

    protected List<com.github.amuguelove.model.destination.Product> productListToProductList(List<Product> list) {
        if ( list == null ) {
            return null;
        }

        List<com.github.amuguelove.model.destination.Product> list1 = new ArrayList<com.github.amuguelove.model.destination.Product>( list.size() );
        for ( Product product : list ) {
            list1.add( productToProduct( product ) );
        }

        return list1;
    }

    protected com.github.amuguelove.model.destination.PaymentType paymentTypeToPaymentType(PaymentType paymentType) {
        if ( paymentType == null ) {
            return null;
        }

        com.github.amuguelove.model.destination.PaymentType paymentType1;

        switch ( paymentType ) {
            case CASH: paymentType1 = com.github.amuguelove.model.destination.PaymentType.CASH;
            break;
            case CARD: paymentType1 = com.github.amuguelove.model.destination.PaymentType.CARD;
            break;
            case TRANSFER: paymentType1 = com.github.amuguelove.model.destination.PaymentType.TRANSFER;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + paymentType );
        }

        return paymentType1;
    }

    protected com.github.amuguelove.model.destination.Discount discountToDiscount(Discount discount) {
        if ( discount == null ) {
            return null;
        }

        com.github.amuguelove.model.destination.Discount discount1 = new com.github.amuguelove.model.destination.Discount();

        discount1.setStartTime( discount.getStartTime() );
        discount1.setEndTime( discount.getEndTime() );
        discount1.setDiscountPrice( discount.getDiscountPrice() );

        return discount1;
    }

    protected Address addressToAddress(com.github.amuguelove.model.source.Address address) {
        if ( address == null ) {
            return null;
        }

        Address address1 = new Address();

        address1.setStreet( address.getStreet() );
        address1.setCity( address.getCity() );
        address1.setPostalCode( address.getPostalCode() );
        address1.setCountry( address.getCountry() );

        return address1;
    }

    protected DeliveryData deliveryDataToDeliveryData(com.github.amuguelove.model.source.DeliveryData deliveryData) {
        if ( deliveryData == null ) {
            return null;
        }

        DeliveryData deliveryData1 = new DeliveryData();

        deliveryData1.setDeliveryAddress( addressToAddress( deliveryData.getDeliveryAddress() ) );
        deliveryData1.setPrePaid( deliveryData.isPrePaid() );
        deliveryData1.setTrackingCode( deliveryData.getTrackingCode() );
        deliveryData1.setExpectedDeliveryTimeInDays( deliveryData.getExpectedDeliveryTimeInDays() );

        return deliveryData1;
    }

    protected Review reviewToReview(com.github.amuguelove.model.source.Review review) {
        if ( review == null ) {
            return null;
        }

        Review review1 = new Review();

        review1.setShippingGrade( review.getShippingGrade() );
        review1.setPricingGrade( review.getPricingGrade() );
        review1.setServiceGrade( review.getServiceGrade() );
        review1.setReviewingUser( userToUser( review.getReviewingUser() ) );
        review1.setNote( review.getNote() );

        return review1;
    }

    protected List<Review> reviewListToReviewList(List<com.github.amuguelove.model.source.Review> list) {
        if ( list == null ) {
            return null;
        }

        List<Review> list1 = new ArrayList<Review>( list.size() );
        for ( com.github.amuguelove.model.source.Review review : list ) {
            list1.add( reviewToReview( review ) );
        }

        return list1;
    }

    protected Shop shopToShop(com.github.amuguelove.model.source.Shop shop) {
        if ( shop == null ) {
            return null;
        }

        Shop shop1 = new Shop();

        shop1.setShopName( shop.getShopName() );
        shop1.setShopAddres( addressToAddress( shop.getShopAddres() ) );
        shop1.setShopUrl( shop.getShopUrl() );
        shop1.setReviews( reviewListToReviewList( shop.getReviews() ) );

        return shop1;
    }
}
