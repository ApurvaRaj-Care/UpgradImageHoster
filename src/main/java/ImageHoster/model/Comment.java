package ImageHoster.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comments")
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "text")
	private String text;

	@Column(name = "created_date ")
	private Date createdDate;

	@ManyToOne(fetch = FetchType.EAGER)
	// Below annotation indicates that the name of the column in 'images' table
	// referring the primary key in 'users' table will be 'user_id'
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne(fetch = FetchType.LAZY)
	private Image image;

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

	public Comment(Integer id, String text, Date createdDate, User user, Image image) {
		super();
		this.id = id;
		this.text = text;
		this.createdDate = createdDate;
		this.user = user;
		this.image = image;
	}

	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}	
}
