package com.zq.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zq.springboot.model.Roles;
import com.zq.springboot.service.RolesService;

import java.util.List;
import java.util.Map;

@Service
public class RolesServiceImpl implements RolesService {
    @Override
    public int addRoles(Roles roles) {
        return 0;
    }

    @Override
    public int updateRoles(Roles roles) {
        return 0;
    }

    @Override
    public int delRoles(int id) {
        return 0;
    }

    @Override
    public List<Roles> getRolesByPage(Map<String, Object> paramMap) {
        return null;
    }

    @Override
    public Roles getRoles(int id) {
        return null;
    }
}
