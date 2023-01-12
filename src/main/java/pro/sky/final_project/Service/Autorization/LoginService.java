package pro.sky.final_project.Service.Autorization;

import org.springframework.stereotype.Service;

import pro.sky.final_project.Model.Autorization.Login;

@Service
public class LoginService {
    
    public Login getDataLoginUser() {
        return new Login();
    }
}
