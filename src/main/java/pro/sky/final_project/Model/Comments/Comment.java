package pro.sky.final_project.Model.Comments;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    private int author;
    private String createdAt;
    private int pk;
    private String text;
}
