package ImageHoster.model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="text")
    private String text;

    @Column(name = "date")
    private Date createdDate;


    //It should be of type User. The ‘comment’ table is mapped to ‘users’ table through this attribute.
    // One user can post multiple comments but one comment should belong to one user.
    // Write the suitable annotation to map the ‘comment’ table to ‘users’ table through this attribute.
    //FetchType is EAGER
    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="user_id")
    private User user;

    //It should be of type Image. The ‘comment’ table is mapped to ‘images’ table through this attribute.
    // One image can have multiple comments but one comment can only belong to one image.
    // Write the suitable annotation to map the ‘comment’ table to ‘images’ table through this attribute.
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="image_id")
    private Image image;;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}

