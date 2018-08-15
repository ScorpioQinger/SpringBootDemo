package com.zq.springboot.service;

import com.zq.springboot.model.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    /**
    * @Description:    分页查询
    * @Author:         zq
    * @CreateDate:     2018/6/28 11:32
    * @UpdateUser:     zq
    * @UpdateDate:     2018/6/28 11:32
    * @UpdateRemark:
    */
    List<User> getUserByPage(Map<String,Object> paramMap);
    /**
    * @Description:    查询总条数
    * @Author:         zq
    * @CreateDate:     2018/6/28 11:32
    * @UpdateUser:     zq
    * @UpdateDate:     2018/6/28 11:32
    * @UpdateRemark:
    */
    int getUserByTotal();

    /**
    * @Description:    新增用户
    * @Author:         zq
    * @CreateDate:     2018/7/4 15:18
    * @UpdateUser:     zq
    * @UpdateDate:     2018/7/4 15:18
    * @UpdateRemark:   修改内容
    */
    int addUser(User user);

    /**
    * @Description:    修改用户
    * @Author:         zq
    * @CreateDate:     2018/7/4 15:39
    * @UpdateUser:     zq
    * @UpdateDate:     2018/7/4 15:39
    * @UpdateRemark:   修改内容
    */
    int updateUser(User user);

    /**
    * @Description:    删除用户
    * @Author:         zq
    * @CreateDate:     2018/7/4 15:39
    * @UpdateUser:     zq
    * @UpdateDate:     2018/7/4 15:39
    * @UpdateRemark:   修改内容
    */
    int delUser(int id);
    /**
    * @Description:    根据Id查询用户信息
    * @Author:         zq
    * @CreateDate:     2018/7/5 10:29
    * @UpdateUser:     zq
    * @UpdateDate:     2018/7/5 10:29
    * @UpdateRemark:   修改内容
    */
    User getUserByUid(int uid);
}
