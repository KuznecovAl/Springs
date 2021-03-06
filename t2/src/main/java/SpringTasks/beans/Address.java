package SpringTasks.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address implements InitializingBean, DisposableBean{

    private String street;
    private Integer value;

    public void afterPropertiesSet() throws Exception {
        System.out.println("Init Address");
    }

    public void destroy() throws Exception {
        System.out.println("Destroy Address"+value.getClass());

    }
}
