package com.zwyu.coupon.dao;

import com.zwyu.coupon.entity.CouponTemplate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CouponTemplateDao extends JpaRepository<CouponTemplate, Integer> {

    List<CouponTemplate> findAllByAvailableAndExpired(Boolean available, Boolean expired);
}
