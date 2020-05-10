package com.zwyu.coupon.service;

import com.zwyu.coupon.dao.CouponTemplateDao;
import com.zwyu.coupon.entity.CouponTemplate;
import com.zwyu.coupon.vo.CouponTemplateVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class UserService {

    @Autowired
    private CouponTemplateDao templateDao;

    /**
     * 查找可以领取的优惠券
     * @return
     */
    public List<CouponTemplateVo> findAvailableTemplate() {

        // 查找所有可用的优惠券模板
        List<CouponTemplate> templates = templateDao.findAllByAvailableAndExpired(true, false);

        // 过滤过期的优惠券模板
        long curTime = new Date().getTime();
        templates = templates.stream()
                .filter(t -> t.getRule().getExpiration().getDeadline() > curTime)
                .collect(Collectors.toList());

        // 将CouponTemplate转换为CouponTemplateVo
        List<CouponTemplateVo> templateVos = templates.stream()
                .map(this::template2TemplateVo)
                .collect(Collectors.toList());

        return templateVos;
    }

    private CouponTemplateVo template2TemplateVo(CouponTemplate template) {
        return new CouponTemplateVo(
                template.getId(),
                template.getName(),
                template.getLogo(),
                template.getDesc(),
                template.getCategory(),
                template.getProductLine(),
                template.getKey(),
                template.getTarget(),
                template.getRule()
        );
    }
}
