package com.khubla.osgiexample.restlet.restlet;

import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleReference;
import org.osgi.framework.ServiceReference;
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
   private HelloService helloService;

   public HelloService getHelloService() {
      return helloService;
   }

   /**
    * ctor
    */
   public HelloServiceResource() {
      BundleContext bundleContext = BundleReference.class.cast(HelloService.class.getClassLoader()).getBundle().getBundleContext();
      ServiceReference<HelloService> serviceReference = bundleContext.getServiceReference(HelloService.class);
      helloService = bundleContext.getService(serviceReference);
   }

   @Get
   public String sayHello() {
      if (null != helloService) {
         return helloService.sayHello();
      } else {
         return "helloService has not been bound";
      }
   }

   public void setHelloService(HelloService helloService) {
      this.helloService = helloService;
   }
}
