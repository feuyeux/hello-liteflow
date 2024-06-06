import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.core.FlowExecutorHolder;
import com.yomahub.liteflow.flow.LiteflowResponse;
import com.yomahub.liteflow.property.LiteflowConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class HelloTest {
    @Test
    public void testHelloNode() {
        LiteflowConfig config=new LiteflowConfig();
        config.setRuleSource("flow.xml");
        FlowExecutor flowExecutor= FlowExecutorHolder.loadInstance(config);
        LiteflowResponse resp = flowExecutor.execute2Resp("hello-sequential-chain", "hello");
        String output = resp.getSlot().getOutput("a").toString();
        log.info("output:{}", output);
        resp = flowExecutor.execute2Resp("hello-sequential-switch-chain", "hello");
        log.info("{}", resp.isSuccess());
    }
}
