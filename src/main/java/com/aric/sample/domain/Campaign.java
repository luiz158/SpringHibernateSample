/**
 * 
 */
package com.aric.sample.domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Dursun KOC
 * 
 */
@Entity
@Table
public class Campaign {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String name;
	@Column
	private Date startDate;
	@Column
	private Date endDate;
	@Column
	private Date createDate;
	@Column
	private Integer isAbstract;
	@OneToMany(mappedBy = "campaign", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Offer> offerSet;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate
	 *            the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate
	 *            the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * @return the isAbstract
	 */
	public Integer getIsAbstract() {
		return isAbstract;
	}

	/**
	 * @param isAbstract
	 *            the isAbstract to set
	 */
	public void setIsAbstract(Integer isAbstract) {
		this.isAbstract = isAbstract;
	}

	/**
	 * @return the offerSet
	 */
	public Set<Offer> getOfferSet() {
		return offerSet;
	}

	/**
	 * @param offerSet
	 *            the offerSet to set
	 */
	public void setOfferSet(Set<Offer> offerSet) {
		this.offerSet = offerSet;
	}


}
