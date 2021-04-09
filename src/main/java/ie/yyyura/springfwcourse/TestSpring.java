package ie.yyyura.springfwcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        // we imported in pom.xml spring-context and we have access to this class
        // this class read applicationContext.xml and put all beans into Application Context
        // config location in folder mark as resources and same name
        ClassPathXmlApplicationContext cPxAcontext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 1. name of the Bean and 2. Class which we want to get an Object
        TestBean tb1 = cPxAcontext.getBean("testBean", TestBean.class);
        System.out.println(tb1.getName());

        cPxAcontext.close();
        /* it will release all the resources and locks that its implementation might hold
        and will also destroy all the cached singleton beans*/

    }
}
