package com.lannister.spring.factory;


import com.lannister.spring.service.UserService;
import com.lannister.spring.service.impl.UserServiceImpl;

/**
 * Created by hp on 2019/9/26.
 */
public class InstanceFactory {

  public UserService createService(){
    return new UserServiceImpl();
  }
}
