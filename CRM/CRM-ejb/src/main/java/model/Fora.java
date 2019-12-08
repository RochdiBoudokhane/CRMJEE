package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Fora database table.
 * 
 */
@Entity
@NamedQuery(name="Fora.findAll", query="SELECT f FROM Fora f")
public class Fora implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ForumId")
	private int forumId;

	@Column(name="Created")
	private String created;

	@Column(name="Descripition")
	private String descripition;

	@Column(name="ImageUrl")
	private String imageUrl;

	@Column(name="Title")
	private String title;

	//bi-directional many-to-one association to Posts
	@OneToMany(mappedBy="fora")
	private List<Posts> posts;

	public Fora() {
	}

	public int getForumId() {
		return this.forumId;
	}

	public void setForumId(int forumId) {
		this.forumId = forumId;
	}

	public String getCreated() {
		return this.created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getDescripition() {
		return this.descripition;
	}

	public void setDescripition(String descripition) {
		this.descripition = descripition;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Posts> getPosts() {
		return this.posts;
	}

	public void setPosts(List<Posts> posts) {
		this.posts = posts;
	}

	public Posts addPost(Posts post) {
		getPosts().add(post);
		post.setFora(this);

		return post;
	}

	public Posts removePost(Posts post) {
		getPosts().remove(post);
		post.setFora(null);

		return post;
	}

}