package model;

import java.io.Serializable;
import javax.persistence.*;

import enumerates.Role;

import java.util.List;


/**
 * The persistent class for the Users database table.
 * 
 */
@Entity
@Table(name="Users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="UserId")
	private int userId;

	@Column(name="Address")
	private String address;

	@Column(name="Cin")
	private int cin;

	@Column(name="ConfirmPassword")
	private String confirmPassword;

	@Column(name="CustomerId")
	private int customerId;

	@Column(name="Discriminator")
	private String discriminator;

	@Column(name="Email")
	private String email;

	@Column(name="FirstName")
	private String firstName;

	@Column(name="ImageUrl")
	private String imageUrl;

	@Column(name="LastName")
	private String lastName;

	@Column(name="Password")
	private String password;

	@Column(name="Phone")
	private int phone;

	@Column(name="Points")
	private int points;

	

	@Column(name="Type")
	private int type;
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Enumerated(EnumType.STRING)
	private Role role;

	//bi-directional many-to-one association to Request
	@OneToMany(mappedBy="user")
	private List<Request> requests;

	public User() {
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCin() {
		return this.cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public String getConfirmPassword() {
		return this.confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getDiscriminator() {
		return this.discriminator;
	}

	public void setDiscriminator(String discriminator) {
		this.discriminator = discriminator;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPhone() {
		return this.phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getPoints() {
		return this.points;
	}

	public void setPoints(int points) {
		this.points = points;
	}





	public User(String address, int cin, String confirmPassword, String discriminator, String email, String firstName,
			String imageUrl, String lastName, String password, int phone) {
		super();
		this.address = address;
		this.cin = cin;
		this.confirmPassword = confirmPassword;
		this.discriminator = discriminator;
		this.email = email;
		this.firstName = firstName;
		this.imageUrl = imageUrl;
		this.lastName = lastName;
		this.password = password;
		this.phone = phone;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public List<Request> getRequests() {
		return this.requests;
	}

	public void setRequests(List<Request> requests) {
		this.requests = requests;
	}

	public Request addRequest(Request request) {
		getRequests().add(request);
		request.setUser(this);

		return request;
	}

	public Request removeRequest(Request request) {
		getRequests().remove(request);
		request.setUser(null);

		return request;
	}

}