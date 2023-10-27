package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author Russell
 * @email 954013384@qq.com
 * @date 2023-03-19 16:08:13
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
