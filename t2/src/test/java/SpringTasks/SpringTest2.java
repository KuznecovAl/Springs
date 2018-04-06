package SpringTasks;

import SpringTasks.beans.Address;
import SpringTasks.beans.User;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringTest2 {

    @Test
    public void factoryCreateBeansTest() {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spr.xml");
        User user = (User)context.getBean("user");
        user.setAddress(new Address("fff",67));
        System.out.println(user.toString());


        Address adr=(Address) context.getBean("address");
        System.out.println(adr.toString());



        context.close();
    }
}