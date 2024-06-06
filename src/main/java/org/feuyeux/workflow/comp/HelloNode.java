package org.feuyeux.workflow.comp;

import com.yomahub.liteflow.core.NodeComponent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloNode extends NodeComponent {

    @Override
    public void process() {
        String nodeId = this.getNodeId();
        String message = this.getSlot().getRequestData();
        log.info("nodeId:{} requestData:{}", nodeId, message);
        String responseMessage = String.format("HelloNode[%s] say %s", nodeId, message);
        this.getSlot().setOutput(nodeId, responseMessage);
    }
}