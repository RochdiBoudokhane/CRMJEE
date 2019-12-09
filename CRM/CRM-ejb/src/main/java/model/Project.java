package model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the Projects database table.
 * 
 */
@Entity
@Table(name="Projects")
@NamedQuery(name="Project.findAll", query="SELECT p FROM Project p")
public class Project implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ProjectId")
	private int projectId;

	@Column(name="Datebegin")
	private Date datebegin;

	@Column(name="DateEnd")
	private Date dateEnd;

	private String description;

	private int maxNbrresource;

	private int minNbrResource;

	private String name;

	@Column(name="State")
	private String state;

	@Column(name="TotaleNbrResource")
	private int totaleNbrResource;

	//bi-directional many-to-one association to Request
	@OneToMany(mappedBy="project1")
	private List<Request> requests1;

	//bi-directional many-to-one association to Request
	@OneToMany(mappedBy="project2")
	private List<Request> requests2;

	public Project() {
	}

	public int getProjectId() {
		return this.projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public Date getDatebegin() {
		return this.datebegin;
	}

	public void setDatebegin(Date datebegin) {
		this.datebegin = datebegin;
	}

	public Date getDateEnd() {
		return this.dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	public Project(Date datebegin, Date dateEnd, String description, int maxNbrresource, int minNbrResource,
			String name, String state, int totaleNbrResource) {
		super();
		this.datebegin = datebegin;
		this.dateEnd = dateEnd;
		this.description = description;
		this.maxNbrresource = maxNbrresource;
		this.minNbrResource = minNbrResource;
		this.name = name;
		this.state = state;
		this.totaleNbrResource = totaleNbrResource;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getMaxNbrresource() {
		return this.maxNbrresource;
	}

	public void setMaxNbrresource(int maxNbrresource) {
		this.maxNbrresource = maxNbrresource;
	}

	public int getMinNbrResource() {
		return this.minNbrResource;
	}

	public void setMinNbrResource(int minNbrResource) {
		this.minNbrResource = minNbrResource;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getTotaleNbrResource() {
		return this.totaleNbrResource;
	}

	public void setTotaleNbrResource(int totaleNbrResource) {
		this.totaleNbrResource = totaleNbrResource;
	}

	public List<Request> getRequests1() {
		return this.requests1;
	}

	public void setRequests1(List<Request> requests1) {
		this.requests1 = requests1;
	}

	public Request addRequests1(Request requests1) {
		getRequests1().add(requests1);
		requests1.setProject1(this);

		return requests1;
	}

	public Request removeRequests1(Request requests1) {
		getRequests1().remove(requests1);
		requests1.setProject1(null);

		return requests1;
	}

	public List<Request> getRequests2() {
		return this.requests2;
	}

	public void setRequests2(List<Request> requests2) {
		this.requests2 = requests2;
	}

	public Request addRequests2(Request requests2) {
		getRequests2().add(requests2);
		requests2.setProject2(this);

		return requests2;
	}

	public Request removeRequests2(Request requests2) {
		getRequests2().remove(requests2);
		requests2.setProject2(null);

		return requests2;
	}

}