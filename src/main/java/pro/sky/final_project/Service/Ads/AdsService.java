package pro.sky.final_project.Service.Ads;

import org.springframework.stereotype.Service;

import pro.sky.final_project.Model.Ads.Ad;
import pro.sky.final_project.Model.Ads.Ads;
import pro.sky.final_project.Model.Ads.FullAd;
import pro.sky.final_project.Model.Comments.Comment;

@Service
public class AdsService {
    
    public Ads getAds() {
        return new Ads();
    }

    public Ad addAds() {
        return new Ad();
    }

    public FullAd getFullAd(int id) {
        return new FullAd();
    }

    public void removeAds(int id) {
        
    }

    public FullAd updateAds(int id) {
        return new FullAd("descriptionupdate", 100, "titleupdate"); 
    }

     public String updateAdsImage(int id) {
        return "image";
    }

   
}
