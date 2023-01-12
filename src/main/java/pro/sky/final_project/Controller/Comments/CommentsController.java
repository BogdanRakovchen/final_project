package pro.sky.final_project.Controller.Comments;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pro.sky.final_project.Model.Comments.Comment;
import pro.sky.final_project.Model.Comments.Comments;
import pro.sky.final_project.Service.Comments.CommentsService;

@RestController
@RequestMapping("/ads")
@CrossOrigin(value = "http://localhost:3000")
public class CommentsController {
    
    private final CommentsService commentsUserService;

    public CommentsController(CommentsService commentsUserService) {
        this.commentsUserService = commentsUserService;
    }

    @GetMapping("/{ad_pk}/comments")
    public ResponseEntity<Comments> getComments(@PathVariable(required = true) int ad_pk) {
        return ResponseEntity.status(200).body(commentsUserService.getComments(ad_pk));
    }

    @PostMapping("/{ad_pk}/comments")
    public ResponseEntity<Comment> addComments(@PathVariable(required = true) int ad_pk) {
        return ResponseEntity.status(200).body(commentsUserService.addComments(ad_pk));
    }

    @GetMapping("/{ad_pk}/comments/{id}")
    public ResponseEntity<Comment> getComments(
        @PathVariable(required = true) int ad_pk, 
        @PathVariable(required = true) int id) {
        return ResponseEntity.status(200).body(commentsUserService.getComment(ad_pk, id));
    }

    @DeleteMapping("/{ad_pk}/comments")
    public ResponseEntity<?> removeComments(
        @PathVariable(required = true) int ad_pk, 
        @PathVariable(required = true) int id) {
        return ResponseEntity.status(200).build();
    }

    @PutMapping("/{ad_pk}/comments/{id}")
    public ResponseEntity<Comment> updateComments(
        @PathVariable(required = true) int ad_pk, 
        @PathVariable(required = true) int id
        ) {
        return ResponseEntity.status(200).body(commentsUserService.updateComment(ad_pk, id));
    }
}
