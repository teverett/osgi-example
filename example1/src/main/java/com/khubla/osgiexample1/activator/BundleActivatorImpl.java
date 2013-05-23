package com.khubla.osgiexample1.activator;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.khubla.osgiexample1.service.HelloService;
import com.khubla.osgiexample1.service.impl.HelloServiceImpl;

/**
 * @author tome
 */
public class BundleActivatorImpl implements BundleActivator {
   /**
    * the registration interface for the hello service
    */
   private ServiceRegistration<HelloService> helloServiceRegistration;

   public ServiceRegistration<HelloService> getHelloServiceRegistration() {
      return helloServiceRegistration;
   }

   public void setHelloServiceRegistration(ServiceRegistration<HelloService> helloServiceRegistration) {
      this.helloServiceRegistration = helloServiceRegistration;
   }

   @SuppressWarnings("unchecked")
   public void start(BundleContext bundleContext) throws Exception {
      final Dictionary<String, String> properties = new Hashtable<String, String>();
      properties.put("Language", "English");
      helloServiceRegistration = (ServiceRegistration<HelloService>) bundleContext.registerService(HelloService.class.getName(), new HelloServiceImpl(), properties);
      System.out.println("Registered the HelloService");
   }

   public void stop(BundleContext bundleContext) throws Exception {
      System.out.println("G'bye world");
   }
}
