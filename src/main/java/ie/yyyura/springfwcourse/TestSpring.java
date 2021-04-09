package ie.yyyura.springfwcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        // lesson 2 -> https://www.youtube.com/watch?v=nLCYk1ySY_U&list=PLAma_mKffTOR5o0WNHnY0mTjKxnCgSXrZ&index=2
        // we imported in pom.xml "spring-context" and we have access to this class CPXAC "ClassPathXmlApplicationContext"
        // this class read applicationContext.xml and put all beans into Application Context
        // config location in folder mark as resources and same name
        ClassPathXmlApplicationContext cpxaContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 1. name of the Bean and 2. we want to get an Object of this class
        TestBean tb1 = cpxaContext.getBean("testBean", TestBean.class);
        System.out.println(tb1.getName());

        cpxaContext.close();
        /* it will release all the resources and locks that its implementation might hold
        and will also destroy all the cached singleton beans*/

    }
}
