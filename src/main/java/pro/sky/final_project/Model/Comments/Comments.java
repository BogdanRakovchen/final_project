package pro.sky.final_project.Model.Comments;

import java.util.List;

import lombok.Data;

@Data
public class Comments {
    
    private int count;
    private List<Comment> results;
}
