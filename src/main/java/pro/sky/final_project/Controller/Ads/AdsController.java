package pro.sky.final_project.Controller.Ads;

import org.apache.catalina.connector.Response;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import pro.sky.final_project.Model.Ads.Ad;
import pro.sky.final_project.Model.Ads.Ads;
import pro.sky.final_project.Model.Ads.FullAd;
import pro.sky.final_project.Service.Ads.AdsService;

@RestController
@RequestMapping(value = "/ads")
@CrossOrigin(value = "http://localhost:3000")
public class AdsController {
    
    private AdsService adsUserService;

    public AdsController(AdsService adsUserService) {
        this.adsUserService = adsUserService;
    }

    @GetMapping("/")
    public Ads getAds() {
        return adsUserService.getAds();
    }

    
    @PostMapping("/")
    @ApiResponse(responseCode = "201", description = "Created")
    public ResponseEntity<Ad> addAds() {
        return ResponseEntity.status(201).body(adsUserService.addAds());
    }

    @GetMapping("/{id}")
    public ResponseEntity<FullAd> getFullAd(@PathVariable(required = true) int id) {
        return ResponseEntity.status(200).body(adsUserService.getFullAd(id));
    }

    @DeleteMapping("/{id}")
    @ApiResponse(responseCode = "204", description = "No content")
    public ResponseEntity<?> removeAds(@PathVariable(required = true) int id) {
        return ResponseEntity.status(204).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<FullAd> updateAds(@PathVariable(required = true) int id) {
        return ResponseEntity.status(200).body(adsUserService.updateAds(id));
    }

    @PutMapping(value = "/image/{id}")
    public ResponseEntity<String> updateAdsImage(@PathVariable(required = true) int id) {
        return ResponseEntity.status(200).body(adsUserService.updateAdsImage(id));
    }

    
}
