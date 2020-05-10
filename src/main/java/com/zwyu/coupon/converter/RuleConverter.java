package com.zwyu.coupon.converter;

import com.alibaba.fastjson.JSON;
import com.zwyu.coupon.vo.TemplateRule;

import javax.persistence.AttributeConverter;

/**
 * 优惠券规则属性转换器
 */
public class RuleConverter implements AttributeConverter<TemplateRule, String> {
    @Override
    public String convertToDatabaseColumn(TemplateRule rule) {
        return JSON.toJSONString(rule);
    }

    @Override
    public TemplateRule convertToEntityAttribute(String rule) {
        return JSON.parseObject(rule, TemplateRule.class);
    }
}
