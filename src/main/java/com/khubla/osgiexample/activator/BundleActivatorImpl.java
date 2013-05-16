package com.khubla.osgiexample.activator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * @author tome
 */
public class BundleActivatorImpl implements BundleActivator {
   public void start(BundleContext bundleContext) throws Exception {
      System.out.println("Hello");
   }

   public void stop(BundleContext bundleContext) throws Exception {
      System.out.println("G'bye world");
   }
}
