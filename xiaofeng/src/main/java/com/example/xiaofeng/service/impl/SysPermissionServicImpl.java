package com.example.xiaofeng.service.impl;

import com.example.xiaofeng.dao.SysPermissionMapper;
import com.example.xiaofeng.entity.SysPermission;
import com.example.xiaofeng.service.ISysPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SysPermissionServicImpl implements ISysPermissionService {
    @Autowired
    private SysPermissionMapper sysPermissionMapper;
    @Override
    public List<SysPermission> findUrlByUserId(String userid) {
        return sysPermissionMapper.findUrlByUserId(userid);
    }

}
