package pro.sky.final_project.Service.Users;

import org.springframework.stereotype.Service;

import pro.sky.final_project.Model.Users.Password;

@Service
public class PasswordService {
    
    public Password setPassword() {
        return new Password();
    }
}
