package com.github.amuguelove.model.source;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Shop {

    private String shopName;
    private Address shopAddres;
    private String shopUrl;
    private List<Review> reviews;
}
