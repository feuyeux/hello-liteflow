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
        LiteflowConfig config=new LiteflowConfig();
        config.setRuleSource("flow.xml");
        FlowExecutor flowExecutor= FlowExecutorHolder.loadInstance(config);
        LiteflowResponse resp = flowExecutor.execute2Resp("hello-sequential-chain", "hello");
        String a = resp.getSlot().getOutput("a").toString();
        log.info("node a output:{}", a);

        flowExecutor.execute2Resp("hello-sequential-switch-chain", "hello");
    }
}
