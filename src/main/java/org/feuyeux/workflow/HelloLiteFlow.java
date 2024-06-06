package org.feuyeux.workflow;


import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.core.FlowExecutorHolder;
import com.yomahub.liteflow.flow.LiteflowResponse;
import com.yomahub.liteflow.property.LiteflowConfig;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloLiteFlow {

    public static void main(String[] args) {
        log.info("{}", String.join(" ", args));
    }
}
