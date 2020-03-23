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
public class Address {

    private String street;
    private String city;
    private String postalCode;
    private String country;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if(o.getClass() == com.github.amuguelove.model.source.Address.class) {
            com.github.amuguelove.model.source.Address address = (com.github.amuguelove.model.source.Address) o;
            return Objects.equals(street, address.getStreet()) &&
              Objects.equals(city, address.getCity()) &&
              Objects.equals(postalCode, address.getPostalCode()) &&
              Objects.equals(country, address.getCountry());
        }
        if(o.getClass() != getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(street, address.street) &&
          Objects.equals(city, address.city) &&
          Objects.equals(postalCode, address.postalCode) &&
          Objects.equals(country, address.country);
    }

    @Override
    public int hashCode() {

        return Objects.hash(street, city, postalCode, country);
    }
}
