package com.winnguyen1905.product.core.model.response;

import java.util.UUID;

import com.winnguyen1905.product.core.model.AbstractModel;

import lombok.Builder;

@Builder
public record PriceStatisticsResponse(
    Double totalPrice,
    UUID discountId,
    Double totalShipPrice,
    Double totalDiscountVoucher,
    Double amountShipReduced,
    Double amountProductReduced,
    Double finalPrice)
    implements AbstractModel {
}
