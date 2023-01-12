package pro.sky.final_project.Service.Comments;

import org.springframework.stereotype.Service;

import pro.sky.final_project.Model.Comments.Comment;
import pro.sky.final_project.Model.Comments.Comments;

@Service
public class CommentsService {
    
    public Comments getComments(int ad_pk) {
        return new Comments();
    }

    public Comment addComments(int ad_pk) {
        return new Comment();
    }

    public Comment getComment(int pk, int id) {
        return new Comment();
    }

    public void removeComment(int pk, int id) {
        
    }

    public Comment updateComment(int pk, int id) {
        return new Comment(1, "create", 1, "text");
    }
}
