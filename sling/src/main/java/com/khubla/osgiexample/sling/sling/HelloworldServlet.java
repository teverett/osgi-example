package com.khubla.osgiexample.sling.sling;

import java.io.IOException;

import javax.servlet.ServletException;

import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;

import com.khubla.osgiexample.sling.service.HelloService;

/**
 * @author tome
 */
@SlingServlet(paths = "/hello")
public class HelloworldServlet extends SlingSafeMethodsServlet {
   /**
    * 
    */
   private static final long serialVersionUID = 1L;
   /**
    * the hello service
    */
   private static HelloService helloService;

   public static HelloService getHelloService() {
      return helloService;
   }

   public static void setHelloService(HelloService helloService) {
      HelloworldServlet.helloService = helloService;
   }

   @Override
   protected void doGet(SlingHttpServletRequest slingHttpServletRequest, SlingHttpServletResponse slingHttpServletResponse) throws ServletException, IOException {
      if (null != helloService) {
         slingHttpServletResponse.getWriter().println(helloService.sayHello());
      } else {
         slingHttpServletResponse.getWriter().println("helloService has not been bound");
      }
   }
}
