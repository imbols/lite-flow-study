package com.example.lite.flow.component;

import com.example.lite.flow.controller.LiteFlowParam;
import com.yomahub.liteflow.core.NodeSwitchComponent;
import org.springframework.stereotype.Component;

@Component("c")
public class CCmp extends NodeSwitchComponent {
    @Override
    public String processSwitch() throws Exception {
        System.out.println("run CCmp ...");
        LiteFlowParam param = this.getRequestData();
        if (param.getRandomInt() >= 5) {
            return "d";
        }
        return "e";
    }
}
