package com.zwyu.coupon.controller;

import com.zwyu.coupon.entity.Coupon;
import com.zwyu.coupon.exception.CouponException;
import com.zwyu.coupon.service.UserService;
import com.zwyu.coupon.vo.AcquireTemplateRequest;
import com.zwyu.coupon.vo.CouponTemplateVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    /**
     * 用户领取优惠券
     * @param request
     * @return
     * @throws CouponException
     */
    @PostMapping("/acquire/template")
    public Map acquireTemplate(@RequestBody AcquireTemplateRequest request) throws CouponException {
        userService.acquireTemplate(request);
        Map<String, Object> map = new HashMap<>();
        map.put("code", 1);
        map.put("msg", "acquire coupon successful");
        return map;
    }
}
