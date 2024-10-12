package com.arfathMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.invoke.MethodType;

@Controller
public class MyController {

    @ResponseBody
    @RequestMapping(value = "/hello",method= RequestMethod.GET)
    public String Call()
    {
        return "Hello world!";
    }
}
