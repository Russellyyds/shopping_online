package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Russell
 * @email 954013384@qq.com
 * @date 2023-03-19 00:49:41
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
