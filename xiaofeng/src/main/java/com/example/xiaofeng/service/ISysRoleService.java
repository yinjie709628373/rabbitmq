package com.example.xiaofeng.service;


import com.example.xiaofeng.entity.SysRole;

import java.util.List;

public interface ISysRoleService {
    //根据用户id查询角色
    public List<SysRole> findByUserId(String userid);
}
