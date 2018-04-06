package SpringTasks.beans;

import SpringTasks.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component

public class User {

 private static User user=new User();


 private Long id;
 private String lastname;
@Value("Kuznecov")
 private String firstname;
 private String email;
 private IAdr address;
 private Order[] orders;



 public static User getInstance(){
   return user;
  }

 public void init(){
  System.out.println("init user");
 }

 public void destroy(){
  System.out.println("destroy user");
 }

}
