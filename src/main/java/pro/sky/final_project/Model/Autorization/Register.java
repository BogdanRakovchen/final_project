package pro.sky.final_project.Model.Autorization;

import lombok.AllArgsConstructor;
import lombok.Data;
import pro.sky.final_project.Model.Users.User;

@Data
public class Register {
    private String userName;
    private String firstName;
    private String lastName;
    private String password;
    private String phone;
    private User role;
}
