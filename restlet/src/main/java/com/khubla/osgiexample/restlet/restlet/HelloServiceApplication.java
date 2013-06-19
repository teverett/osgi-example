package com.khubla.osgiexample.restlet.restlet;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

/**
 * @author tome
 */
public class HelloServiceApplication extends Application {
   /**
    * set up inbound routes
    */
   public synchronized Restlet createInboundRoot() {
      final Router router = new Router(getContext());
      router.attach("/hello", HelloServiceResource.class);
      return router;
   }
}
