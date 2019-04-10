package com.yang.proxy.dynamicproxy.jdkproxy;

import com.yang.proxy.Person;
import com.yang.proxy.dynamicproxy.pgproxy.GPMeipo;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

public class JdkProxyTest {
    public static void main(String[] args) throws Exception {
        Person person = (Person) new JdkMeipo().getInstance(new Gril());
//        Person person = (Person) new GPMeipo().getInstance(new Gril());
        person.findLove();
        person.work ();
        //$Proxy0
//            byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
//            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
//            os.write(bytes);
//            os.close();

    }
}
