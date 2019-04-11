package com.example.xiaofeng.dao;

import com.example.xiaofeng.entity.SysRole;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface SysRoleMapper  extends Mapper<SysRole> {
    public List<SysRole> findByUserId(String userid);
}
