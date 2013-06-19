package com.khubla.osgiexample.rest.activator;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.restlet.Application;
import org.restlet.Component;
import org.restlet.data.Protocol;

import com.khubla.osgiexample.rest.restlet.HelloServiceApplication;
import com.khubla.osgiexample.rest.service.HelloService;
import com.khubla.osgiexample.rest.service.impl.HelloServiceImpl;

/**
 * @author tome
 */
public class BundleActivatorImpl implements BundleActivator {
   /**
    * the registration interface for the hello service
    */
   private ServiceRegistration<HelloService> helloServiceRegistration;
   /**
    * restlet component
    */
   private Component component;

   public ServiceRegistration<HelloService> getHelloServiceRegistration() {
      return helloServiceRegistration;
   }

   public void setHelloServiceRegistration(ServiceRegistration<HelloService> helloServiceRegistration) {
      this.helloServiceRegistration = helloServiceRegistration;
   }

   @SuppressWarnings("unchecked")
   public void start(BundleContext bundleContext) throws Exception {
      /*
       * set up the service
       */
      final Dictionary<String, String> properties = new Hashtable<String, String>();
      properties.put("Language", "English");
      helloServiceRegistration = (ServiceRegistration<HelloService>) bundleContext.registerService(HelloService.class.getName(), new HelloServiceImpl(), properties);
      System.out.println("Registered the HelloService");
      /*
       * create the restlet component
       */
      component = new Component();
      component.getServers().add(Protocol.HTTP, 8182);
      /*
       * attach application and start
       */
      final Application application = new HelloServiceApplication();
      component.getDefaultHost().attachDefault(application);
      component.start();
      System.out.println("Started Restlet application");
   }

   public void stop(BundleContext bundleContext) throws Exception {
      component.stop();
      System.out.println("G'bye world");
   }
}
