import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.core.FlowExecutorHolder;
import com.yomahub.liteflow.flow.LiteflowResponse;
import com.yomahub.liteflow.property.LiteflowConfig;
import com.yomahub.liteflow.slot.DefaultContext;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class HelloTest {
  @Test
  public void testHelloNode() {
    LiteflowConfig config = new LiteflowConfig();
    config.setRuleSource("flow.xml");
    FlowExecutor flowExecutor = FlowExecutorHolder.loadInstance(config);
    LiteflowResponse resp = flowExecutor.execute2Resp("hello-sequential-chain", "hello");
    DefaultContext ctx = resp.getFirstContextBean();
    String output = ctx.getData("hello");
    log.info("output:{}", output);
    resp = flowExecutor.execute2Resp("hello-sequential-switch-chain", "hello");
    log.info("{}", resp.getExecuteStepStrWithTime());
  }
}
