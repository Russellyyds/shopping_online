package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 商品库存
 * 
 * @author Russell
 * @email 954013384@qq.com
 * @date 2023-03-19 17:13:39
 */
@Mapper

public interface WareSkuDao extends BaseMapper<WareSkuEntity> {

    void addStock(@Param("skuId") Long skuId, @Param("wareId") Long wareId,@Param("skuNum") Integer skuNum);

    Long getSkuStock(@Param("skuId") Long item);
}
