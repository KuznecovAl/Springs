package SpringTasks;

import SpringTasks.beans.Address;
import SpringTasks.beans.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringTest1 {

    @Test
    public void createBeansTest() {

        ApplicationContext context = new ClassPathXmlApplicationContext("spr.xml");
        User user = context.getBean("user", User.class);
        user.setAddress(new Address("fff"));
        System.out.println(user.toString());

    }
}
