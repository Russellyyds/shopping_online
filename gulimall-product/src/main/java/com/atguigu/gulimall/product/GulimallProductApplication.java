package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


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
//@EnableRedisHttpSession     //开启springsession
@EnableCaching      //开启缓存功能
@EnableFeignClients(basePackages = "com.atguigu.gulimall.product.feign")
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.atguigu.gulimall.product.dao")
public class GulimallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallProductApplication.class, args);
	}

}
