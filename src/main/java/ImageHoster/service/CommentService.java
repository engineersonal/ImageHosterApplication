package ImageHoster.service;

import ImageHoster.model.Comment;
import ImageHoster.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    //The method calls the saveComment() method in the Repository and passes the comment to be persisted in the database
    public Comment saveComment(Comment comment) {
        return commentRepository.saveComment(comment);
    }



}

