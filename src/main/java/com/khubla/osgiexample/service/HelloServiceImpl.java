package com.khubla.osgiexample.service;

import java.util.Date;

/**
 * @author tome
 */
public class HelloServiceImpl implements HelloService {
   public String sayHello() {
      return "Hello.  The date is: " + new Date().toString();
   }
}
