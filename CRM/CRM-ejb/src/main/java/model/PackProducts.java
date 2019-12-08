package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


/**
 * The persistent class for the PackProducts database table.
 * 
 */
@Entity
@NamedQuery(name="PackProducts.findAll", query="SELECT p FROM PackProducts p")
public class PackProducts implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PackProductsPK id;

	@Column(name="EndDate")
	private Date endDate;

	@Column(name="StartDate")
	private Date startDate;

	//bi-directional many-to-one association to Packs
	@ManyToOne(cascade=CascadeType.PERSIST, fetch=FetchType.EAGER)
	@JoinColumn(name="PackId",insertable=false, updatable=false)
	private Packs pack;

	//bi-directional many-to-one association to Products
	@ManyToOne(cascade=CascadeType.PERSIST, fetch=FetchType.EAGER)
	@JoinColumn(name="ProductId", insertable=false, updatable=false)
	private Products product;
	private PackProductsPK packPk;

	public PackProducts() {
	}

	
	
	public PackProductsPK getPackPk() {
		return packPk;
	}



	public void setPackPk(PackProductsPK packPk) {
		this.packPk = packPk;
	}




	
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Packs getPack() {
		return this.pack;
	}

	public void setPack(Packs pack) {
		this.pack = pack;
	}

	public Products getProduct() {
		return this.product;
	}

	public void setProduct(Products product) {
		this.product = product;
	}



	public PackProductsPK getId() {
		return id;
	}



	public void setId(PackProductsPK id) {
		this.id = id;
	}

}