package pro.sky.final_project.Service.Autorization;

import org.springframework.stereotype.Service;

import pro.sky.final_project.Model.Autorization.Register;

@Service
public class RegisterService {
    
    public Register getDataRegisterUser() {
        return new Register();
    }
}
