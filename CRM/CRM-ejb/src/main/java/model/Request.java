package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Requests database table.
 * 
 */
@Entity
@Table(name="Requests")
@NamedQuery(name="Request.findAll", query="SELECT r FROM Request r")
public class Request implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="RequestId")
	private int requestId;

	@Column(name="Age")
	private int age;

	@Column(name="Description")
	private String description;

	@Column(name="FirstName")
	private String firstName;

	private String lastName;

	@Column(name="State")
	private String state;

	//bi-directional many-to-one association to Project
	@ManyToOne
	@JoinColumn(name="Project_ProjectId")
	private Project project1;

	//bi-directional many-to-one association to Project
	@ManyToOne
	@JoinColumn(name="ProjectId")
	private Project project2;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="UserId")
	private User user;

	public Request() {
	}

	public int getRequestId() {
		return this.requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Project getProject1() {
		return this.project1;
	}

	public void setProject1(Project project1) {
		this.project1 = project1;
	}

	public Project getProject2() {
		return this.project2;
	}

	public void setProject2(Project project2) {
		this.project2 = project2;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}