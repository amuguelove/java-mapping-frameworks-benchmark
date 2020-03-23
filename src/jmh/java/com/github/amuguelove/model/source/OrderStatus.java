package com.github.amuguelove.model.source;

import lombok.Getter;

@Getter
public enum  OrderStatus {
    CREATED, CONFIRMED, COLLECTING, IN_TRANSPORT, FINISHED
}
