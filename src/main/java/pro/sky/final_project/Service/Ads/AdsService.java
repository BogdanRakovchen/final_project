package pro.sky.final_project.Service.Ads;

import org.springframework.stereotype.Service;

import pro.sky.final_project.Model.Ads.Ad;
import pro.sky.final_project.Model.Ads.Ads;
import pro.sky.final_project.Model.Ads.FullAd;
import pro.sky.final_project.Model.Comments.Comment;

@Service
public class AdsService implements AdsInterface {
    
    @Override
    public Ads getAds() {
        return new Ads();
    }

    @Override
    public Ad addAds() {
        return new Ad();
    }

    @Override
    public FullAd getFullAd(int id) {
        return new FullAd();
    }
    @Override
    public void removeAds(int id) {
        
    }

    @Override
    public FullAd updateAds(int id) {
        return new FullAd("descriptionupdate", 100, "titleupdate"); 
    }

    @Override
     public String updateAdsImage(int id) {
        return "image";
    }

   
}
