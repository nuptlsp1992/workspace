package com.nowcoder.toutiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sx on 2017/5/15.
 */
@Controller
public class IndexController {
    @RequestMapping(path={"/","/index"})
    @ResponseBody
    public String index(){

        return "Hello Nowcoder!";
    }

}
