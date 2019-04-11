package com.example.xiaofeng.receive;

import com.example.xiaofeng.entity.SysUser;
import com.example.xiaofeng.sendMsg.SendMessage;
import com.example.xiaofeng.service.ISysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TicketService {
    private Logger log= LoggerFactory.getLogger(getClass());
    @Autowired
    private ISysUserService sysUserService;
    @Autowired
    private SendMessage sendMessage;
    static int i=0;
    //消费
 @RabbitListener(queues = "ticket")
    public void process(String idCard){

     try {
         System.out.println("消费id"+idCard);
         System.out.println("模拟出票成功");
         //查询数据库是否出票成功这里就是查询用户
         SysUser user= sysUserService.findByUserid("zhangsan");
         log.info(user.getId()+" "+i++);
         sendMessage.sendMsg(user.getId());
     }catch (Exception e){
         log.info("失败");
       }
    }
}
