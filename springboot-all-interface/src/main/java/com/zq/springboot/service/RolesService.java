package com.zq.springboot.service;

import com.zq.springboot.model.Roles;

import java.util.List;
import java.util.Map;

public interface RolesService {
    /**
    * @Description:    新增角色
    * @Author:         zq
    * @CreateDate:     2018/8/15 14:27
    * @UpdateUser:     zq
    * @UpdateDate:     2018/8/15 14:27
    */
    int addRoles(Roles roles);
    /**
    * @Description:    修改角色
    * @Author:         zq
    * @CreateDate:     2018/8/15 14:28
    * @UpdateUser:     zq
    * @UpdateDate:     2018/8/15 14:28
    */
    int updateRoles(Roles roles);

    /**
    * @Description:    删除角色
    * @Author:         zq
    * @CreateDate:     2018/8/15 14:29
    * @UpdateUser:     zq
    * @UpdateDate:     2018/8/15 14:29
    */
    int delRoles(int id);
    /**
    * @Description:    分页展示角色
    * @Author:         zq
    * @CreateDate:     2018/8/15 14:30
    * @UpdateUser:     zq
    * @UpdateDate:     2018/8/15 14:30
    */
    List<Roles> getRolesByPage(Map<String,Object> paramMap);

    /**
    * @Description:    根据角色Id查询角色
    * @Author:         zq
    * @CreateDate:     2018/8/15 14:31
    * @UpdateUser:     zq
    * @UpdateDate:     2018/8/15 14:31
    */
    Roles getRoles(int id);


}
