package SpringTasks;

import SpringTasks.beans.Address;
import SpringTasks.beans.IAdr;
import SpringTasks.beans.User;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringTest3 {

    @Test
    public void factoryCreateBeansTest() {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spr3.xml");
        User user = (User)context.getBean("user");
        System.out.println(user.toString());


        IAdr adr=(IAdr) context.getBean("address");
        System.out.println(adr.toString());



        context.close();
    }
}