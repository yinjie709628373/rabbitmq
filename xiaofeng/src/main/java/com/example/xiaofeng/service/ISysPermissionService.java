package com.example.xiaofeng.service;


import com.example.xiaofeng.entity.SysPermission;

import java.util.List;

public interface ISysPermissionService {
    public List<SysPermission> findUrlByUserId(String userid);
}
