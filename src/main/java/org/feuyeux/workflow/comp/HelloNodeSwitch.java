package org.feuyeux.workflow.comp;

import com.yomahub.liteflow.core.NodeSwitchComponent;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
public class HelloNodeSwitch extends NodeSwitchComponent {
    private final Random random=new Random();
    @Override
    public String processSwitch() throws Exception {
        String nodeId = this.getNodeId();
        String message = this.getSlot().getRequestData();
        log.info("{} input:{}", nodeId, message);
        if (random.nextBoolean()) {
            return "tag:dog";
        }
        return "tag:cat";
    }
}