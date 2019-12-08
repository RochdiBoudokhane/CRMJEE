package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Offers database table.
 * 
 */
@Entity
@NamedQuery(name="Offers.findAll", query="SELECT o FROM Offers o")
public class Offers implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="OfferId")
	private int offerId;

	@Column(name="Description")
	private String description;

	@Column(name="EndDate")
	private String endDate;

	@Column(name="ImgUrl")
	private String imgUrl;

	@Column(name="OfferName")
	private String offerName;

	@Column(name="Price")
	private float price;

	@Column(name="ProductId", insertable=false, updatable=false)
	private int productId;

	@Column(name="StartDate")
	private String startDate;

	//bi-directional one-to-one association to Products
	@OneToOne(mappedBy="offer")
	private Products product;

	public Offers() {
	}

	public int getOfferId() {
		return this.offerId;
	}

	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getImgUrl() {
		return this.imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getOfferName() {
		return this.offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public Products getProduct() {
		return this.product;
	}

	public void setProduct(Products product) {
		this.product = product;
	}

}