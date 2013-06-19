package test.com.khubla.osgiexample.basic.service.impl;

import org.junit.Assert;
import org.junit.Test;

import com.khubla.osgiexample.basic.service.HelloService;
import com.khubla.osgiexample.basic.service.impl.HelloServiceImpl;

/**
 * @author tome
 */
public class TestHelloServiceImpl {
   @Test
   public void test1() {
      try {
         final HelloService helloService = new HelloServiceImpl();
         final String hello = helloService.sayHello();
         Assert.assertNotNull(hello);
         Assert.assertTrue(hello.length() > 0);
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }
}
