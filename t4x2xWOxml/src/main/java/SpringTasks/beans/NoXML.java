package SpringTasks.beans;


import lombok.Data;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Data
@Configuration
@ComponentScan(basePackages = "SpringTasks.beans"/*,
        excludeFilters = {
        @ComponentScan.Filter(
                value = SpringTasks.beans.Address.class,
                type = FilterType.ASSIGNABLE_TYPE,
                pattern = {}
                )
        }*/)
public class NoXML implements ApplicationContextAware{

    private ApplicationContext applicationContext;

}
