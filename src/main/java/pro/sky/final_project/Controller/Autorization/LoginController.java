package pro.sky.final_project.Controller.Autorization;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import pro.sky.final_project.Model.Autorization.Login;
import pro.sky.final_project.Service.Autorization.LoginService;

@RestController
@CrossOrigin(value = "http://localhost:3000")
public class LoginController {

    private final LoginService loginUserService;

    public LoginController(LoginService loginUserService) {
        this.loginUserService = loginUserService;
    }
    
    @PostMapping("/login")
    public Login getDataLoginUser() {
        return loginUserService.getDataLoginUser();
    }
}
