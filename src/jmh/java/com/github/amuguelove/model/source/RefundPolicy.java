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
public class RefundPolicy {

    private boolean isRefundable;
    private int refundTimeInDays;
    private List<String> notes;
}
