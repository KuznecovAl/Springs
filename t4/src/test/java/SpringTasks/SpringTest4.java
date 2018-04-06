package SpringTasks;

import SpringTasks.beans.IAdr;
import SpringTasks.beans.User;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringTest4 {

    @Test
    public void factoryCreateBeansTest() {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spr.xml");
        User user = (User)context.getBean("user");
        System.out.println(user.toString());


        IAdr adr=(IAdr) context.getBean("address");
        System.out.println(adr.toString());



        context.close();
    }
}