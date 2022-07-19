package com.example.lite.flow.controller;

import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class TestController {
    @Resource
    private FlowExecutor flowExecutor;

    @GetMapping
    public String test() {
        int randomInt = (int) (Math.random() * 10);
        System.out.println("random integer is " + randomInt);
        LiteFlowParam param = new LiteFlowParam();
        param.setRandomInt(randomInt);
        LiteflowResponse response = this.flowExecutor.execute2Resp("chain1", param);
        return "success";
    }
}
