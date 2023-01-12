package pro.sky.final_project.Model.Ads;

import java.util.List;

import lombok.Data;

@Data
public class Ads {
    private int count;
    private List<Ad> results;
}
