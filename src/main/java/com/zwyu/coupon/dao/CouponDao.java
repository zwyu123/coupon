package com.zwyu.coupon.dao;

import com.zwyu.coupon.entity.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponDao extends JpaRepository<Coupon, Integer> {
}
