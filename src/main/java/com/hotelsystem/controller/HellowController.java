package com.hotelsystem.controller;

import com.hotelsystem.dao.IpUserDao;
import com.hotelsystem.dao.UserDao;
import com.hotelsystem.entity.Ip_User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author liuy
 * @Date 2019/4/25-11:14
 */
@Controller
public class HellowController {

    @Autowired
    UserDao userDao;

    @Autowired
    IpUserDao ipUserDao;
    @GetMapping("/dept/{id}")
    @ResponseBody
    public Ip_User cc(@PathVariable("id") Integer id){

        return ipUserDao.getUserbyId(id);
    }
    @GetMapping("/")
    public String aa(HttpServletRequest request){
          request.setAttribute("user","进入！！");
        return "commodity/add.html";
    }

    @GetMapping("/data")
    public String cc(){

          System.out.println("cc");
        return "cc";
    }
}
