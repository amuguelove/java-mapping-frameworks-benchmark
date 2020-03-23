package com.github.amuguelove.model.destination;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Review {

    int shippingGrade;
    int pricingGrade;
    int serviceGrade;
    User reviewingUser;
    String note;
}
