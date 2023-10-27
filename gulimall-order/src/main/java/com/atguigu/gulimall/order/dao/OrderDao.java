package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Russell
 * @email 954013384@qq.com
 * @date 2023-03-19 17:05:51
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
