package com.atguigu.gulimall.thirdparty;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
//import com.atguigu.gulimall.thirdparty.component.SmsComponent;
//import com.atguigu.common..utils.HttpUtils;
import com.atguigu.gulimall.thirdparty.component.SmsComponent;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallThirdPartyApplicationTests {

//    @Resource
//    private SmsComponent smsComponent;
//
////    @Test
////    public void sendSmsCode() {
////        smsComponent.sendCode("15580220501", "134531");
////    }
//
//    @Test
//    public void testUpload() throws FileNotFoundException {
//
//    }
//
//
//    @Test
//    public void sendSms() {
//
//    }
    @Autowired
    SmsComponent smsComponent;
    @Test
    public void sendSmsCode() {
        smsComponent.sendCode("13286897756", "134531");
    }

}

