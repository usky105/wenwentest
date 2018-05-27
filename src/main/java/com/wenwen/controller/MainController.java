package com.wenwen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {
    @RequestMapping(value = "/test.do",method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @ResponseBody
    @RequestMapping(value="/body/{x}", method = RequestMethod.GET)
    public bodytest getBody(@PathVariable("x") String x){
        System.out.println("URI Part 1 : " + x);
        bodytest bt = new bodytest();
        bt.a = x;
        bt.b = "1234";

        return bt;
    }

    public class  bodytest
    {
        public  String a;
        public String b;
    }
}