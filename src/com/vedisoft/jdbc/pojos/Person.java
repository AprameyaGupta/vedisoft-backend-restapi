package com.vedisoft.pojos;

import java.util.Date;

public class Person {
	protected int personId;
	protected int personTypeId;
	protected String personName;
	protected String designation;
	protected int branchId;
	protected String contactNo;
	protected String address;
	protected String plotNo;
	protected String street;
	protected String locality;
	protected String city;
	protected String state;
	protected Date dob;
	protected Date doj;
	protected Date dol;
	protected String username;
	protected String password;
	protected String key1;
	protected String active;
	protected String cardNo;
	protected String createdBy;
	protected Date createdDate;
	protected String lastUpdatedBy;
	protected Date lastUpdatedDate;
	/**
	 * 
	 */
	public Person() {
		super();
	}
	/**
	 * @param personTypeId
	 * @param personName
	 * @param designation
	 * @param branchId
	 * @param contactNo
	 * @param address
	 * @param plotNo
	 * @param street
	 * @param locality
	 * @param city
	 * @param state
	 * @param dob
	 * @param doj
	 * @param dol
	 * @param username
	 * @param password
	 * @param key1
	 * @param active
	 * @param cardNo
	 * @param createdBy
	 * @param createdDate
	 * @param lastUpdatedBy
	 * @param lastUpdatedDate
	 */
	public Person(int personTypeId, String personName, String designation, int branchId, String contactNo,
			String address, String plotNo, String street, String locality, String city, String state, Date dob,
			Date doj, Date dol, String username, String password, String key1, String active, String cardNo,
			String createdBy, Date createdDate, String lastUpdatedBy, Date lastUpdatedDate) {
		super();
		this.personTypeId = personTypeId;
		this.personName = personName;
		this.designation = designation;
		this.branchId = branchId;
		this.contactNo = contactNo;
		this.address = address;
		this.plotNo = plotNo;
		this.street = street;
		this.locality = locality;
		this.city = city;
		this.state = state;
		this.dob = dob;
		this.doj = doj;
		this.dol = dol;
		this.username = username;
		this.password = password;
		this.key1 = key1;
		this.active = active;
		this.cardNo = cardNo;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedDate = lastUpdatedDate;
	}
	/**
	 * @param personId
	 * @param personTypeId
	 * @param personName
	 * @param designation
	 * @param branchId
	 * @param contactNo
	 * @param address
	 * @param plotNo
	 * @param street
	 * @param locality
	 * @param city
	 * @param state
	 * @param dob
	 * @param doj
	 * @param dol
	 * @param username
	 * @param password
	 * @param key1
	 * @param active
	 * @param cardNo
	 * @param createdBy
	 * @param createdDate
	 * @param lastUpdatedBy
	 * @param lastUpdatedDate
	 */
	public Person(int personId, int personTypeId, String personName, String designation, int branchId, String contactNo,
			String address, String plotNo, String street, String locality, String city, String state, Date dob,
			Date doj, Date dol, String username, String password, String key1, String active, String cardNo,
			String createdBy, Date createdDate, String lastUpdatedBy, Date lastUpdatedDate) {
		super();
		this.personId = personId;
		this.personTypeId = personTypeId;
		this.personName = personName;
		this.designation = designation;
		this.branchId = branchId;
		this.contactNo = contactNo;
		this.address = address;
		this.plotNo = plotNo;
		this.street = street;
		this.locality = locality;
		this.city = city;
		this.state = state;
		this.dob = dob;
		this.doj = doj;
		this.dol = dol;
		this.username = username;
		this.password = password;
		this.key1 = key1;
		this.active = active;
		this.cardNo = cardNo;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedDate = lastUpdatedDate;
	}
	/**
	 * @return the personId
	 */
	public int getPersonId() {
		return personId;
	}
	/**
	 * @param personId the personId to set
	 */
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	/**
	 * @return the personTypeId
	 */
	public int getPersonTypeId() {
		return personTypeId;
	}
	/**
	 * @param personTypeId the personTypeId to set
	 */
	public void setPersonTypeId(int personTypeId) {
		this.personTypeId = personTypeId;
	}
	/**
	 * @return the personName
	 */
	public String getPersonName() {
		return personName;
	}
	/**
	 * @param personName the personName to set
	 */
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	/**
	 * @return the branchId
	 */
	public int getBranchId() {
		return branchId;
	}
	/**
	 * @param branchId the branchId to set
	 */
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	/**
	 * @return the contactNo
	 */
	public String getContactNo() {
		return contactNo;
	}
	/**
	 * @param contactNo the contactNo to set
	 */
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the plotNo
	 */
	public String getPlotNo() {
		return plotNo;
	}
	/**
	 * @param plotNo the plotNo to set
	 */
	public void setPlotNo(String plotNo) {
		this.plotNo = plotNo;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the locality
	 */
	public String getLocality() {
		return locality;
	}
	/**
	 * @param locality the locality to set
	 */
	public void setLocality(String locality) {
		this.locality = locality;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}
	/**
	 * @return the doj
	 */
	public Date getDoj() {
		return doj;
	}
	/**
	 * @param doj the doj to set
	 */
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	/**
	 * @return the dol
	 */
	public Date getDol() {
		return dol;
	}
	/**
	 * @param dol the dol to set
	 */
	public void setDol(Date dol) {
		this.dol = dol;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the key1
	 */
	public String getKey1() {
		return key1;
	}
	/**
	 * @param key1 the key1 to set
	 */
	public void setKey1(String key1) {
		this.key1 = key1;
	}
	/**
	 * @return the active
	 */
	public String getActive() {
		return active;
	}
	/**
	 * @param active the active to set
	 */
	public void setActive(String active) {
		this.active = active;
	}
	/**
	 * @return the cardNo
	 */
	public String getCardNo() {
		return cardNo;
	}
	/**
	 * @param cardNo the cardNo to set
	 */
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * @return the lastUpdatedBy
	 */
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	/**
	 * @param lastUpdatedBy the lastUpdatedBy to set
	 */
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	/**
	 * @return the lastUpdatedDate
	 */
	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	/**
	 * @param lastUpdatedDate the lastUpdatedDate to set
	 */
	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((active == null) ? 0 : active.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + branchId;
		result = prime * result + ((cardNo == null) ? 0 : cardNo.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((contactNo == null) ? 0 : contactNo.hashCode());
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((doj == null) ? 0 : doj.hashCode());
		result = prime * result + ((dol == null) ? 0 : dol.hashCode());
		result = prime * result + ((key1 == null) ? 0 : key1.hashCode());
		result = prime * result + ((lastUpdatedBy == null) ? 0 : lastUpdatedBy.hashCode());
		result = prime * result + ((lastUpdatedDate == null) ? 0 : lastUpdatedDate.hashCode());
		result = prime * result + ((locality == null) ? 0 : locality.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + personId;
		result = prime * result + ((personName == null) ? 0 : personName.hashCode());
		result = prime * result + personTypeId;
		result = prime * result + ((plotNo == null) ? 0 : plotNo.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (active == null) {
			if (other.active != null)
				return false;
		} else if (!active.equals(other.active))
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (branchId != other.branchId)
			return false;
		if (cardNo == null) {
			if (other.cardNo != null)
				return false;
		} else if (!cardNo.equals(other.cardNo))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (contactNo == null) {
			if (other.contactNo != null)
				return false;
		} else if (!contactNo.equals(other.contactNo))
			return false;
		if (createdBy == null) {
			if (other.createdBy != null)
				return false;
		} else if (!createdBy.equals(other.createdBy))
			return false;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (!createdDate.equals(other.createdDate))
			return false;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (doj == null) {
			if (other.doj != null)
				return false;
		} else if (!doj.equals(other.doj))
			return false;
		if (dol == null) {
			if (other.dol != null)
				return false;
		} else if (!dol.equals(other.dol))
			return false;
		if (key1 == null) {
			if (other.key1 != null)
				return false;
		} else if (!key1.equals(other.key1))
			return false;
		if (lastUpdatedBy == null) {
			if (other.lastUpdatedBy != null)
				return false;
		} else if (!lastUpdatedBy.equals(other.lastUpdatedBy))
			return false;
		if (lastUpdatedDate == null) {
			if (other.lastUpdatedDate != null)
				return false;
		} else if (!lastUpdatedDate.equals(other.lastUpdatedDate))
			return false;
		if (locality == null) {
			if (other.locality != null)
				return false;
		} else if (!locality.equals(other.locality))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (personId != other.personId)
			return false;
		if (personName == null) {
			if (other.personName != null)
				return false;
		} else if (!personName.equals(other.personName))
			return false;
		if (personTypeId != other.personTypeId)
			return false;
		if (plotNo == null) {
			if (other.plotNo != null)
				return false;
		} else if (!plotNo.equals(other.plotNo))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personTypeId=" + personTypeId + ", personName=" + personName
				+ ", designation=" + designation + ", branchId=" + branchId + ", contactNo=" + contactNo + ", address="
				+ address + ", plotNo=" + plotNo + ", street=" + street + ", locality=" + locality + ", city=" + city
				+ ", state=" + state + ", dob=" + dob + ", doj=" + doj + ", dol=" + dol + ", username=" + username
				+ ", password=" + password + ", key1=" + key1 + ", active=" + active + ", cardNo=" + cardNo
				+ ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", lastUpdatedBy=" + lastUpdatedBy
				+ ", lastUpdatedDate=" + lastUpdatedDate + "]";
	}
}
