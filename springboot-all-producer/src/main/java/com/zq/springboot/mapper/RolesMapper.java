package com.zq.springboot.mapper;

import com.zq.springboot.model.Roles;

import java.util.List;
import java.util.Map;

public interface RolesMapper {
    int addRoles(Roles roles);

    int updateRoles(Roles roles);

    int delRoles(int id);

    Roles getRoles(int id);

    List<Roles> getRolesByPage(Map<String,Object> paramMap);
}
