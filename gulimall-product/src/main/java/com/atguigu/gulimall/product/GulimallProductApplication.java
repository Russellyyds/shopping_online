package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**1整合mybatis-plus-boot-starter依赖  在common模块中导入version 3.2.0
 * 配置数据源
 * 导入数据库相关驱动
 * 在application.yml配置数据源相关信息
 *
 * 配置mybatisplus
 * 使用@MapperScan  告诉Mybatis-plus,sql映射文件位置
 *
 *
 */


@SpringBootApplication
@MapperScan("com.atguigu.gulimall.product.dao")
public class GulimallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallProductApplication.class, args);
	}

}
