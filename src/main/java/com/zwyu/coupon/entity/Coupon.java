package com.zwyu.coupon.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * 优惠券(用户领取的优惠券记录)实体表
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "coupon")
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /** 关联优惠券模板的主键(逻辑外键) */
    private Integer templateId;

    /** 领取用户 */
    private Long userId;

    /** 领取时间 */
    @CreatedDate
    private Date assignTime;

    private Integer status;

    public Coupon(Integer templateId, Long userId, Integer status) {
        this.templateId = templateId;
        this.userId = userId;
        this.status = status;
    }
}
