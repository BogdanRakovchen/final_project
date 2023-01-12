package pro.sky.final_project.Service.Ads;

import pro.sky.final_project.Model.Ads.Ad;
import pro.sky.final_project.Model.Ads.Ads;
import pro.sky.final_project.Model.Ads.FullAd;

public interface AdsInterface {
    
    Ads getAds();
    Ad addAds();
    FullAd getFullAd(int id);
    void removeAds(int id);
    FullAd updateAds(int id);
    String updateAdsImage(int id);
}
