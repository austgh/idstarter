package com.testid.idstarter.controller;

import com.sue.IdGenerateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author think
 * @version 1.0
 * @date 2021/11/18 20:25
 */
@RestController
@RequestMapping("/test")
public class IdStarterController {
    @Autowired
    private IdGenerateService idGenerateService;
    @RequestMapping("hello")
    public String test(){
        Long id=idGenerateService.generate();
        System.out.println(id);
        return "hello";
    }
}
