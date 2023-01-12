package pro.sky.final_project.Controller.Users;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pro.sky.final_project.Model.Users.Password;
import pro.sky.final_project.Service.Users.PasswordService;

@RestController
@RequestMapping("/users")
@CrossOrigin(value = "http://localhost:3000")
public class PasswordController {

    private final PasswordService passwordUserService;

    public PasswordController(PasswordService passwordUserService) {
        this.passwordUserService = passwordUserService;
    }
    
    @PostMapping("/set_password")
    public Password setPassword() {
        return passwordUserService.setPassword();
    }
}
