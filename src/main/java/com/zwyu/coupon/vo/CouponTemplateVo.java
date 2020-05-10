package com.zwyu.coupon.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CouponTemplateVo {

    private Integer id;

    private String name;

    private String logo;

    private String desc;

    private String category;

    /** 优惠券模板的编码 **/
    private String key;

    /** 目标用户 */
    private Integer target;

    private TemplateRule rule;

}
