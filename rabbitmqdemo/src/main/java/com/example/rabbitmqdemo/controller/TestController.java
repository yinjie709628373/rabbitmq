package com.example.rabbitmqdemo.controller;

import com.example.rabbitmqdemo.Msg.MsgProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
 @Autowired
    private MsgProducer msgProducer;
 @GetMapping("test")
 public void send(){
     try {
         msgProducer.sendMsg("4");
         msgProducer.sendMsg("1");
         msgProducer.sendMsg("2");
         msgProducer.sendMsg("3");


     }catch (Exception e){
         System.out.println("失败");
     }
 }
}
