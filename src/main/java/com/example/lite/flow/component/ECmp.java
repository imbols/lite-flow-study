package com.example.lite.flow.component;

import com.yomahub.liteflow.core.NodeComponent;
import org.springframework.stereotype.Component;

@Component("e")
public class ECmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        System.out.println("run ECmp ...");
    }
}
