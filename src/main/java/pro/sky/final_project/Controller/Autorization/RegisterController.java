package pro.sky.final_project.Controller.Autorization;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import pro.sky.final_project.Model.Autorization.Register;
import pro.sky.final_project.Service.Autorization.RegisterService;

@RestController
@CrossOrigin(value = "http://localhost:3000")
public class RegisterController {

    private final RegisterService registerUserService;

    public RegisterController(RegisterService registerUserService) {
        this.registerUserService = registerUserService;
    }
    

    @PostMapping("/register")
    @ApiResponse(responseCode = "201", description = "Created")
    public ResponseEntity<Register> getDataRegisterUser() {
        return ResponseEntity.status(201).body(registerUserService.getDataRegisterUser());
    }
}
