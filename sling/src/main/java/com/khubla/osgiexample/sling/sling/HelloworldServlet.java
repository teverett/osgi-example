package com.khubla.osgiexample.sling.sling;

import java.io.IOException;

import javax.servlet.ServletException;

import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;

/**
 * @author tome
 */
@SlingServlet(paths = "/foo/bar/my-servlet")
public class HelloworldServlet extends SlingSafeMethodsServlet {
   /**
    * 
    */
   private static final long serialVersionUID = 1L;

   @Override
   protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
      response.getWriter().println("hello world");
   }
}
