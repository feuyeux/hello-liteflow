package org.feuyeux.workflow;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloLiteFlow {

  public static void main(String[] args) {
    log.info("{}", String.join(" ", args));
  }
}
