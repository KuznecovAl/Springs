package SpringTasks.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class Address implements InitializingBean, DisposableBean, IAdr{

    private String street;
    private Integer value;

    public void afterPropertiesSet() throws Exception {
        System.out.println("Init Address");
    }

    public void destroy() throws Exception {
        System.out.println("Destroy Address"+value.getClass());

    }
}
