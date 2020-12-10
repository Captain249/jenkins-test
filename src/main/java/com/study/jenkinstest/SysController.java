package com.study.jenkinstest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/sys")
public class SysController {

    @RequestMapping("/ok")
    public Map ok(){
        HashMap<String, String> map = new HashMap<>();
        map.put("code","0");
        map.put("msg","OK");
        return map;
    }
}
