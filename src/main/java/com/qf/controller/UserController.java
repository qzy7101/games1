package com.qf.controller;

import com.qf.pojo.User;
import com.qf.service.UserService;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import javax.servlet.http.HttpSession;

import java.util.List;

@Controller
public class UserController {
    @Resource
    private UserService userService;
    //查询所有用户
    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
    //根据uid查询用户信息
    @RequestMapping("/getuidAlluser")
    @ResponseBody
    public User getuidAlluser(int uid){
        uid = 1;
        return userService.getuidAlluser(uid);
    }

    //登陆
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public int login(@RequestParam String uname, @RequestParam String upass){
        User user = userService.login(uname);
        if (upass.equals(user.getUpass())){
          return 1;
        }else {
            return 2;
        }
    }

    //验证用户名是否存在
    @RequestMapping(value = "/yuname",method = RequestMethod.POST)
    @ResponseBody
    public int wangj(@RequestParam String uname){

        User yh = userService.login(uname);
        if (yh != null){

            return 2;
        }else {
            return 1;
        }
    }

    //验证邮箱是否存在
    @RequestMapping(value = "/email",method = RequestMethod.POST)
    @ResponseBody
    public int email(@RequestParam String email){
        User yh = userService.email(email);
        if (yh != null){
            return 1;
        }else {
            return 2;
        }
    }

    //发送验证码
    @RequestMapping(value = "/yzm",method = RequestMethod.POST)
    @ResponseBody
    public int yzm(@RequestParam String email,String code, HttpSession session) throws CloneNotSupportedException {

        //生成6位的随机码
         code = RandomStringUtils.randomAlphanumeric(6);
         //将验证码存入session
         session.setAttribute("yzm",code);

//        EmailUtil emailUtil = new EmailUtil();
//
//        System.out.println(emailUtil);
//
//        String yzm4 = emailUtil.toString();
//
//        System.out.println(yzm4);
//        //存入session
//         session.setAttribute("yzm",yzm4);

        //调用发送邮件的方法（填入页面传递的email地址、生成的随机验证码）
        EmailUtil.sendMail(email,code);

        return 1;
    }

    //检测验证码是否一致
    @RequestMapping(value = "/yzm2",method = RequestMethod.POST)
    @ResponseBody
    public int yzm2(@RequestParam String yzm ,@RequestParam String zhangh,HttpSession session){
        //获取当前需要更改密码的用户的用户名放入session
        session.setAttribute("zhangh",zhangh);
       //获取session中的验证码
        String yzm4=(String)session.getAttribute("yzm");
//        Object yzm4 = session.getAttribute("yzm");
        //String yzm1 = request.getSession().getAttribute("yzm").toString();

//        String yzm1=(String)session.getAttribute("yzm");

        if (yzm.equals(yzm4)){
            return 1;
        }else {
            return 2;
        }
    }

    //注册
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    @ResponseBody
    public int register(@RequestBody User user){
        userService.adduser(user);
        return 1;
    }

//根据用户id删除用户
    @RequestMapping("/deluser")
    @ResponseBody
    public void deluser(Integer uid){
         uid = 1;
       userService.deluser(uid);
    }

//修改密码
    @RequestMapping("/upuser")
    @ResponseBody
    public int upuser(@RequestParam String userpass5,HttpSession session){

        System.out.println(userpass5);
        //从session中取出修改密码用户的用户名
        String uname =(String)session.getAttribute("zhangh");
        //调用根据uname查询对象的方法
        User user = userService.login(uname);
        //将user中的密码更换为页面传递的
        user.setUpass(userpass5);
        System.out.println(user);
        //调用修改方法修改
        userService.upuser(user);

        return 1;
    }

    @RequestMapping("/bjpass")
    @ResponseBody
    public int bjpas(@RequestParam String upass1,@RequestParam String upass2){

        if (upass1.equals(upass2)){
            return 1;
        }else {
            return 2;
        }
    }

}
