package com.zwyu.coupon.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 优惠券规则
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TemplateRule {

    /** 优惠券过期规则 */
    private Expiration expiration;

    /** 商品类型, list[文娱, 生鲜, 家居, 全品类] */
    private String goodsType;

    /**
     * 有效期限规则
     */
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Expiration {

        /** 有效期规则 */
        private Integer period;

        /** 有效期间隔: 只对变动性有效期有效 */
        private Integer gap;

        /** 优惠券模板的失效日期, 两类规则都有效 */
        private Long deadline;
    }
}
