package com.khubla.osgiexample.sling.service.impl;

import java.util.Date;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Deactivate;
import org.apache.felix.scr.annotations.Service;

import com.khubla.osgiexample.sling.service.HelloService;

/**
 * @author tome
 */
@Component
@Service
public class HelloServiceImpl implements HelloService {
   public String sayHello() {
      return "Hello.  The date is: " + new Date().toString();
   }

   @Activate
   void activate() {
      System.out.println("Activated: " + this.getClass().getCanonicalName());
   }

   @Deactivate
   void deactivate() {
      System.out.println("Deactivated: " + this.getClass().getCanonicalName());
   }
}
