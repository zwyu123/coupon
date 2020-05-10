package com.zwyu.coupon.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 获取优惠券请求对象
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AcquireTemplateRequest {

    /** 用户id */
    private Long userId;

    /** 优惠券模板信息 */
    private CouponTemplateVo templateVo;
}
