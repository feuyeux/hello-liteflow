package org.feuyeux.workflow.comp;

import com.yomahub.liteflow.core.NodeSwitchComponent;
import java.util.Random;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloNodeSwitch extends NodeSwitchComponent {
  private final Random random = new Random();

  @Override
  public String processSwitch() {
    String nodeId = this.getNodeId();
    String message = this.getSlot().getRequestData();
    String tag = buildTag();
    log.info("nodeId:{} requestData:{}, tag:{}", nodeId, message, tag);
    return tag;
  }

  private String buildTag() {
    if (random.nextBoolean()) {
      return "tag:dog";
    }
    return "tag:cat";
  }
}
