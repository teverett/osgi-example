package com.khubla.osgiexample2.service.impl;

import java.util.Date;

import com.khubla.osgiexample2.service.HelloService;

/**
 * @author tome
 */
public class HelloServiceImpl implements HelloService {
   public String sayHello() {
      return "Hello.  The date is: " + new Date().toString();
   }
}
