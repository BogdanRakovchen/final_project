package pro.sky.final_project.Service.Users;

import org.springframework.stereotype.Service;

import pro.sky.final_project.Model.Ads.Ads;
import pro.sky.final_project.Model.Users.User;

@Service
public class UserService {
    
    public User getUser() {
        return new User();
    }
    
    public User updateUser() {
        return new User(1, "jon", "slith", "test@mail.ru", "89991234545",
        "123", "Moscow", "image" );
    }

    public User updateUserImage() {
        return new User("imageUpdate");
    }

    public Ads getAdsMe() {
        return new Ads();
    }
}
