package com.example.xiaofeng.controller;

import com.alibaba.fastjson.JSON;
import com.example.xiaofeng.entity.SysPermission;
import com.example.xiaofeng.entity.SysRole;
import com.example.xiaofeng.entity.SysUser;
import com.example.xiaofeng.service.ISysPermissionService;
import com.example.xiaofeng.service.ISysRoleService;
import com.example.xiaofeng.service.ISysUserService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/test")
public class ShiroController {
    @Autowired
    private ISysRoleService sysRoleService;
    @Autowired
    private ISysPermissionService sysPermissionService;
    @Autowired
    private ISysUserService sysUserService;


    @RequestMapping(value = {"/test"}, method = RequestMethod.GET)
    @ResponseBody
    public String welcome(Integer k) {
//         CountDownLatch cdl=new CountDownLatch( k);
//        for (int i=0;i< k;i++){
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        cdl.await();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    SysUser user=sysUserService.findByUserid("zhangsan");
//                    System.out.println(user);
//                }
//            }).start();
//            cdl.countDown();
//        }
//        try {
//            TimeUnit.MILLISECONDS.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        SysUser user=sysUserService.findByUserid("zhangsan");
        System.out.println("被请求了");
        return  JSON.toJSONString(user);
    }

}
