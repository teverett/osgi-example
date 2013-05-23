package com.khubla.osgiexample1.service.impl;

import java.util.Date;

import com.khubla.osgiexample1.service.HelloService;

/**
 * @author tome
 */
public class HelloServiceImpl implements HelloService {
   public String sayHello() {
      return "Hello.  The date is: " + new Date().toString();
   }
}
