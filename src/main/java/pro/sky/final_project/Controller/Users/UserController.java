package pro.sky.final_project.Controller.Users;

import javax.servlet.annotation.MultipartConfig;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartRequest;

import pro.sky.final_project.Model.Ads.Ads;
import pro.sky.final_project.Model.Users.User;
import pro.sky.final_project.Service.Ads.AdsService;
import pro.sky.final_project.Service.Users.UserService;

@RestController
@CrossOrigin(value = "http://localhost:3000")
public class UserController {
    
    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/me")
    public User getUser() {
        return userService.getUser();
    }

    @PutMapping("/users/me")
    public User updateUser() {
        return userService.updateUser();
    }

    @PutMapping("/users/me/image")
    public User updateUserImage() {
        return userService.updateUserImage();
    }

    @GetMapping("/ads/me")
    public ResponseEntity<Ads> getAdsMe() {
        return ResponseEntity.status(200).body(userService.getAdsMe());
    }

}
