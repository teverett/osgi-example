package com.khubla.osgiexample.restlet.restlet;

import org.apache.felix.scr.annotations.Reference;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

import com.khubla.osgiexample.restlet.service.HelloService;

/**
 * @author tome
 */
public class HelloServiceResource extends ServerResource {
   /**
    * the hello service
    */
   @Reference
   private HelloService helloService;

   public HelloService getHelloService() {
      return helloService;
   }

   public void setHelloService(HelloService helloService) {
      this.helloService = helloService;
   }

   @Get
   public String sayHello() {
      if (null != helloService) {
         return helloService.sayHello();
      } else {
         return "helloService has not been bound";
      }
   }
}
