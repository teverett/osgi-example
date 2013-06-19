package com.khubla.osgiexample.rest.restlet;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

import com.khubla.osgiexample.rest.service.HelloService;
import com.khubla.osgiexample.rest.service.impl.HelloServiceImpl;

/**
 * @author tome
 */
public class HelloServiceResource extends ServerResource {
   /**
    * the hello service
    */
   private static HelloService helloService = new HelloServiceImpl();

   public static HelloService getHelloService() {
      return helloService;
   }

   public static void setHelloService(HelloService helloService) {
      HelloServiceResource.helloService = helloService;
   }

   @Get
   public String sayHello() {
      return "hi there";
   }
}
