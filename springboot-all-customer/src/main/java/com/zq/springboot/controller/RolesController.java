package com.zq.springboot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;

@Controller
public class RolesController {
    @Reference(version = "1.0.0")



}
