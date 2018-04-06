package SpringTasks;

import SpringTasks.beans.MyAspect;
import SpringTasks.beans.NoXML;
import SpringTasks.beans.User;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SpringTest6 {

    @Test
    public void noXmlTest() {


        final AnnotationConfigApplicationContext AC = new AnnotationConfigApplicationContext();

        AC.register(NoXML.class);
        //AC.register(SpringTest6.class);

        AC.refresh();
        AC.start();

        User user = (User)AC.getBean("user");
        System.out.println(user.getFirstname());

    }
}