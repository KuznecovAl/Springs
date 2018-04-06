package SpringTasks.beans;

import SpringTasks.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

 private static User user=new User();


 private Long id;
 private String lastname;
 private String firstname;
 private String email;
 private Address address;
 private Order[] orders;

  public static User getInstance(){
   return user;
  }

 public void init(){
  System.out.println("init user");
 }

 public void destroy(){
  System.out.println("destroy user"+email.getClass());
 }

}
