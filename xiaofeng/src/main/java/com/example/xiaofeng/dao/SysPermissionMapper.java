package com.example.xiaofeng.dao;

import com.example.xiaofeng.entity.SysPermission;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface SysPermissionMapper extends Mapper<SysPermission> {
    List<SysPermission> findUrlByUserId(@Param("userid") String userid);
}
