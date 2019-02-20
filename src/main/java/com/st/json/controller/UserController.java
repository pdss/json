package com.st.json.controller;

import com.st.json.entity.UserInformation;
import com.st.json.result.StatuResult;
import com.st.json.service.UserInformationService;
import com.st.json.service.impl.UserInformationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/json")
public class UserController {

    @Autowired
    private UserInformationService service;
    @GetMapping("/user")
    public UserInformation test(){
        //System.out.println(userInformation.getUsername());

        return service.findOne(1);
    }
    @PostMapping("/username")
    public StatuResult test1(HttpServletRequest request){
        String username = request.getParameter("username");
        System.out.println(username);
        StatuResult statuResult = new StatuResult();
        int i = (int)(Math.random()*2);
        System.out.println(i);
        statuResult.setStatu(i);
        return statuResult;
    }

}
