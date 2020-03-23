package com.github.amuguelove.model.destination;

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
public class RefundPolicy {

    private boolean isRefundable;
    private int refundTimeInDays;
    private List<String> notes;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (o.getClass() == com.github.amuguelove.model.source.RefundPolicy.class) {
            com.github.amuguelove.model.source.RefundPolicy that = (com.github.amuguelove.model.source.RefundPolicy) o;
            return isRefundable == that.isRefundable() &&
                    refundTimeInDays == that.getRefundTimeInDays() &&
                    Objects.equal(notes, that.getNotes());
        }
        if (o.getClass() != getClass()) return false;
        RefundPolicy that = (RefundPolicy) o;
        return isRefundable == that.isRefundable &&
                refundTimeInDays == that.refundTimeInDays &&
                Objects.equal(notes, that.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isRefundable, refundTimeInDays, notes);
    }
}
