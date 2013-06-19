package com.khubla.osgiexample.basic.service.impl;

import java.util.Date;

import com.khubla.osgiexample.basic.service.HelloService;

/**
 * @author tome
 */
public class HelloServiceImpl implements HelloService {
   public String sayHello() {
      return "Hello.  The date is: " + new Date().toString();
   }
}
