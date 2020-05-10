package com.zwyu.coupon.entity;

import com.zwyu.coupon.converter.RuleConverter;
import com.zwyu.coupon.vo.TemplateRule;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "coupon_template")
public class CouponTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /** 是否可用 */
    private Boolean available;

    /** 是否过期 */
    private Boolean expired;

    private String name;

    private String logo;

    @Column(name = "intro")
    private String desc;

    private String category;

    /** 总数 */
    @Column(name = "coupon_count")
    private Integer count;

    private Date createTime;

    /** 创建用户 */
    private Long userId;

    /** 优惠券模板编码 */
    @Column(name = "template_key")
    private String key;

    /** 目标用户 */
    private Integer target;

    /** 优惠券规则 */
    @Convert(converter = RuleConverter.class)
    private TemplateRule rule;
}
