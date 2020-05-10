package com.zwyu.coupon.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 用户优惠券的状态
 */
@Getter
@AllArgsConstructor
public enum CouponStatus {

    USABLE("可用的", 1),
    USED("已使用的", 2),
    EXPIRED("过期的(未被使用的)", 3);

    private String description;
    private Integer code;
}
