package com.zwyu.coupon.controller;

import com.zwyu.coupon.service.UserService;
import com.zwyu.coupon.vo.CouponTemplateVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/distribution")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查找可以领取的优惠券
     * @return
     */
    @GetMapping("/template")
    public List<CouponTemplateVo> findAvailableTemplate() {
        return userService.findAvailableTemplate();
    }
}
