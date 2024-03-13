package com.sbapp.sbapp.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
// import org.thymeleaf.TemplateEngine;
// import org.thymeleaf.spring6.view.ThymeleafView;
// import org.thymeleaf.templateresolver.StringTemplateResolver;

import com.sbapp.sbapp.DBObj.Person;
import com.sbapp.sbapp.DBServices.RepoService;

@Controller
public class DbDemoController {
    
    @Autowired
    RepoService serv;

    @GetMapping("/db")
    public String dbview(Map<String, Object> model)
    {
        model.put("db", serv.list());
        return "db";
    }

    @PostMapping("/db1")
    public String dbsave(Person person)
    {
        return "saved";
    }
}
