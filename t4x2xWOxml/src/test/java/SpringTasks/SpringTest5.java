package SpringTasks;

import SpringTasks.beans.NoXML;
import SpringTasks.beans.User;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringTest5 {

    @Test
    public void noXmlTest() {


        final AnnotationConfigApplicationContext AC = new AnnotationConfigApplicationContext();

        AC.register(NoXML.class);
        AC.refresh();
        AC.start();

        User user = (User)AC.getBean("user");
        System.out.println(user.getFirstname());

    }
}