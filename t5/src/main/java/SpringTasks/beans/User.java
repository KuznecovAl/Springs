package SpringTasks.beans;

import SpringTasks.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component

public class User {

    private static User user = new User();


    private Long id;
    @Value("Kuznecov")
    private String lastname;
    @Value("Alex")
    private String firstname;
    private String email;
    private IAdr address;
    private Order[] orders;


    public String returnFullName(String flag) {
        return lastname + " " + firstname;
    }

    public static User getInstance() {
        return user;
    }

    public void init() {
        System.out.println("init user");
    }

    public void destroy() {
        System.out.println("destroy user");
    }

}
