package com.example.xiaofeng.service;


import com.example.xiaofeng.entity.SysUser;

public interface ISysUserService {
    //通过账号密码查询用户
    SysUser getByUsercodeAndPassword(String usercode, String password);

    //通过id查询用户以及角色权限
    public SysUser findByUserid(String userid);

    public  SysUser findByUsercode(String usercode);
}
