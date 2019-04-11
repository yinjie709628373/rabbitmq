package com.example.xiaofeng.service.impl;

import com.example.xiaofeng.dao.SysRoleMapper;
import com.example.xiaofeng.entity.SysRole;
import com.example.xiaofeng.service.ISysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysRoleServiceImpl implements ISysRoleService {
    @Autowired
    private SysRoleMapper sysRoleMapper;
    @Override
    public List<SysRole> findByUserId(String userid) {
        return sysRoleMapper.findByUserId(userid);
    }
}
