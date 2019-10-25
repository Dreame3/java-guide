package com.lannister.springboot.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Created by Lannister on 2019/10/22.
 */
public class HelloSpringApplicationRunListener implements SpringApplicationRunListener {

  public HelloSpringApplicationRunListener(SpringApplication application,String[] args){

  }

  @Override
  public void starting() {
    System.out.println("SpringApplicationRunListener...starting...");
  }

  @Override
  public void environmentPrepared(ConfigurableEnvironment environment) {
    Object o = environment.getSystemProperties().get("os.name");
    System.out.println("SpringApplicationRunListener...environmentPrepared..." + o);
  }

  @Override
  public void contextPrepared(ConfigurableApplicationContext context) {
    System.out.println("SpringApplicationRunListener...contextPrepared...");
  }

  @Override
  public void contextLoaded(ConfigurableApplicationContext context) {
    System.out.println("SpringApplicationRunListener...contextLoaded...");
  }

  @Override
  public void finished(ConfigurableApplicationContext context, Throwable exception) {
    System.out.println("SpringApplicationRunListener...finished...");
  }
}
