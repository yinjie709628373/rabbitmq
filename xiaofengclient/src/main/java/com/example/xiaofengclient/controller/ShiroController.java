package com.example.xiaofengclient.controller;

import com.alibaba.fastjson.JSON;
import com.example.xiaofengclient.sendMsg.SendMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/test")
public class ShiroController {
    RestTemplate restTemplate=new RestTemplate();
    @Autowired
    private SendMessage sendMessage;
    @RequestMapping(value = {"/test"}, method = RequestMethod.GET)
    @ResponseBody
    public String welcome(Integer k) {
                 CountDownLatch cdl=new CountDownLatch( k);
        for (int i=0;i< k;i++){
           final int m=0;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        cdl.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    sendMessage.sendMsg("买票了"+(m));
                }
            }).start();

            cdl.countDown();
        }
        try {
            TimeUnit.MILLISECONDS.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return null;
      //  return  JSON.toJSONString(restTemplate.getForEntity("http://192.168.2.150:8860/test/test?k=20000",String.class).getBody());
    }

}
