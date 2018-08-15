package com.zq.springboot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zq.springboot.model.User;
import com.zq.springboot.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class UserController {
    @Reference(version = "1.0.0")
    private UserService userService;
    private final  static Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/index")
    public String index(Model model,@RequestParam(value = "curPage",required = false) Integer curPage){
        int pageSize = 3;
        int total = userService.getUserByTotal();
        int totalPage = total/pageSize;
        logger.trace("trace级别日志");
        logger.debug("debug级别的日志");
        logger.info("info级别日志");
        logger.warn("warn级别日志");
        logger.error("error级别日志");

        if(total%pageSize > 0){
            totalPage = totalPage+1;
        }

        if(null == curPage || curPage < 1){
            curPage = 1;
        }
        if(curPage > totalPage){
            curPage = totalPage;
        }
        int pageNumber  = (curPage - 1)*pageSize;
        Map<String,Object> paramMap = new HashMap<>();
        paramMap.put("pageNumber",pageNumber);//当前页数
        paramMap.put("pageSize",pageSize);//每页条数
        List<User> userList = userService.getUserByPage(paramMap);
        model.addAttribute("userList",userList);
        model.addAttribute("totalPage",totalPage);
        model.addAttribute("curPage",curPage);
        return "index";
    }

    @RequestMapping("/toJumpAddUser")
    public String toJumpAddUser(){
        return "addUser";
    }
    @RequestMapping("/addUser")
    public String toAddUser(User user){
        Integer uid = user.getUid();
        if(null == uid){
            userService.addUser(user);
        }else{
            userService.updateUser(user);
        }

        return "redirect:/index";
    }
    @RequestMapping("/toUserUpdate")
    public String toUpdateUser(Model model,@RequestParam("uid") int uid){
        User user = userService.getUserByUid(uid);
        model.addAttribute("user",user);
        return "addUser";
    }
    @RequestMapping("delUser")
    public String delUser(@RequestParam("uid") int uid){
        userService.delUser(uid);
        return "redirect:/index";
    }


}
