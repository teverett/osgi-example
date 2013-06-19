package com.khubla.osgiexample.restlet.activator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.restlet.Application;
import org.restlet.Component;
import org.restlet.data.Protocol;

import com.khubla.osgiexample.restlet.restlet.HelloServiceApplication;

/**
 * @author tome
 */
public class BundleActivatorImpl implements BundleActivator {
   /**
    * restlet component
    */
   private Component component;

   public void start(BundleContext bundleContext) throws Exception {
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