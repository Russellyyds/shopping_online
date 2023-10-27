package com.atguigu.gulimall.auth.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class GulimallWebConfig implements WebMvcConfigurer {
    /**·
     * 视图映射:发送一个请求，直接跳转到一个页面
     * @param registry
     *
     *
     *     @GetMapping(value = "/login.html")
     *     public String loginPage(HttpSession session) {
     *
     *
     *         return "login";
     *     }
     *
     *     @GetMapping(value = "/reg.html")
     *     public String regPage(HttpSession session) {
     *
     *
     *         return "reg";
     *     }
     *
     *
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

//        registry.addViewController("/login.html").setViewName("login");
        registry.addViewController("/reg.html").setViewName("reg");
    }
}
