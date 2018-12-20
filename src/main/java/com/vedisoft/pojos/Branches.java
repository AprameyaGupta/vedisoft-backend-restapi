package com.vedisoft.pojos;

import java.util.Date;

public class Branches {
	protected int branchId;
	protected String branchName;
	protected String branchPrefix;
	protected String plotNo;
	protected String locality;
	protected String street;
	protected String city;
	protected String state; 
	protected int branchManagerId;
	protected String branchContactNo;
	protected String multipleCourses;
	protected Date estbDate;
	protected String createdBy;
	protected Date creationDate;
	protected String lastUpdatedBy;
	protected Date lastUpdationDate;
	protected String extra1;
	protected int extra2;
	/*
	 *a 
	 */
	public Branches() {
		super();
	}
	/**
	 * @param branchName
	 * @param branchPrefix
	 * @param plotNo
	 * @param locality
	 * @param street
	 * @param city
	 * @param state
	 * @param branchManagerId
	 * @param branchContactNo
	 * @param multipleCourses
	 * @param estbDate
	 * @param createdBy
	 * @param creationDate
	 * @param lastUpdatedBy
	 * @param lastUpdationDate
	 * @param extra1
	 * @param extra2
	 */
	public Branches(String branchName, String branchPrefix, String plotNo, String locality, String street, String city,
			String state, int branchManagerId, String branchContactNo, String multipleCourses, Date estbDate,
			String createdBy, Date creationDate, String lastUpdatedBy, Date lastUpdationDate, String extra1,
			int extra2) {
		super();
		this.branchName = branchName;
		this.branchPrefix = branchPrefix;
		this.plotNo = plotNo;
		this.locality = locality;
		this.street = street;
		this.city = city;
		this.state = state;
		this.branchManagerId = branchManagerId;
		this.branchContactNo = branchContactNo;
		this.multipleCourses = multipleCourses;
		this.estbDate = estbDate;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdationDate = lastUpdationDate;
		this.extra1 = extra1;
		this.extra2 = extra2;
	}
	/**
	 * @param branchId
	 * @param branchName
	 * @param branchPrefix
	 * @param plotNo
	 * @param locality
	 * @param street
	 * @param city
	 * @param state
	 * @param branchManagerId
	 * @param branchContactNo
	 * @param multipleCourses
	 * @param estbDate
	 * @param createdBy
	 * @param creationDate
	 * @param lastUpdatedBy
	 * @param lastUpdationDate
	 * @param extra1
	 * @param extra2
	 */
	public Branches(int branchId, String branchName, String branchPrefix, String plotNo, String locality, String street,
			String city, String state, int branchManagerId, String branchContactNo, String multipleCourses,
			Date estbDate, String createdBy, Date creationDate, String lastUpdatedBy, Date lastUpdationDate,
			String extra1, int extra2) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
		this.branchPrefix = branchPrefix;
		this.plotNo = plotNo;
		this.locality = locality;
		this.street = street;
		this.city = city;
		this.state = state;
		this.branchManagerId = branchManagerId;
		this.branchContactNo = branchContactNo;
		this.multipleCourses = multipleCourses;
		this.estbDate = estbDate;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdationDate = lastUpdationDate;
		this.extra1 = extra1;
		this.extra2 = extra2;
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
	 * @return the branchName
	 */
	public String getBranchName() {
		return branchName;
	}
	/**
	 * @param branchName the branchName to set
	 */
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	/**
	 * @return the branchPrefix
	 */
	public String getBranchPrefix() {
		return branchPrefix;
	}
	/**
	 * @param branchPrefix the branchPrefix to set
	 */
	public void setBranchPrefix(String branchPrefix) {
		this.branchPrefix = branchPrefix;
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
	 * @return the branchManagerId
	 */
	public int getBranchManagerId() {
		return branchManagerId;
	}
	/**
	 * @param branchManagerId the branchManagerId to set
	 */
	public void setBranchManagerId(int branchManagerId) {
		this.branchManagerId = branchManagerId;
	}
	/**
	 * @return the branchContactNo
	 */
	public String getBranchContactNo() {
		return branchContactNo;
	}
	/**
	 * @param branchContactNo the branchContactNo to set
	 */
	public void setBranchContactNo(String branchContactNo) {
		this.branchContactNo = branchContactNo;
	}
	/**
	 * @return the multipleCourses
	 */
	public String getMultipleCourses() {
		return multipleCourses;
	}
	/**
	 * @param multipleCourses the multipleCourses to set
	 */
	public void setMultipleCourses(String multipleCourses) {
		this.multipleCourses = multipleCourses;
	}
	/**
	 * @return the estbDate
	 */
	public Date getEstbDate() {
		return estbDate;
	}
	/**
	 * @param estbDate the estbDate to set
	 */
	public void setEstbDate(Date estbDate) {
		this.estbDate = estbDate;
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
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}
	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
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
	 * @return the lastUpdationDate
	 */
	public Date getLastUpdationDate() {
		return lastUpdationDate;
	}
	/**
	 * @param lastUpdationDate the lastUpdationDate to set
	 */
	public void setLastUpdationDate(Date lastUpdationDate) {
		this.lastUpdationDate = lastUpdationDate;
	}
	/**
	 * @return the extra1
	 */
	public String getExtra1() {
		return extra1;
	}
	/**
	 * @param extra1 the extra1 to set
	 */
	public void setExtra1(String extra1) {
		this.extra1 = extra1;
	}
	/**
	 * @return the extra2
	 */
	public int getExtra2() {
		return extra2;
	}
	/**
	 * @param extra2 the extra2 to set
	 */
	public void setExtra2(int extra2) {
		this.extra2 = extra2;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((branchContactNo == null) ? 0 : branchContactNo.hashCode());
		result = prime * result + branchId;
		result = prime * result + branchManagerId;
		result = prime * result + ((branchName == null) ? 0 : branchName.hashCode());
		result = prime * result + ((branchPrefix == null) ? 0 : branchPrefix.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + ((estbDate == null) ? 0 : estbDate.hashCode());
		result = prime * result + ((extra1 == null) ? 0 : extra1.hashCode());
		result = prime * result + extra2;
		result = prime * result + ((lastUpdatedBy == null) ? 0 : lastUpdatedBy.hashCode());
		result = prime * result + ((lastUpdationDate == null) ? 0 : lastUpdationDate.hashCode());
		result = prime * result + ((locality == null) ? 0 : locality.hashCode());
		result = prime * result + ((multipleCourses == null) ? 0 : multipleCourses.hashCode());
		result = prime * result + ((plotNo == null) ? 0 : plotNo.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
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
		Branches other = (Branches) obj;
		if (branchContactNo == null) {
			if (other.branchContactNo != null)
				return false;
		} else if (!branchContactNo.equals(other.branchContactNo))
			return false;
		if (branchId != other.branchId)
			return false;
		if (branchManagerId != other.branchManagerId)
			return false;
		if (branchName == null) {
			if (other.branchName != null)
				return false;
		} else if (!branchName.equals(other.branchName))
			return false;
		if (branchPrefix == null) {
			if (other.branchPrefix != null)
				return false;
		} else if (!branchPrefix.equals(other.branchPrefix))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (createdBy == null) {
			if (other.createdBy != null)
				return false;
		} else if (!createdBy.equals(other.createdBy))
			return false;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (estbDate == null) {
			if (other.estbDate != null)
				return false;
		} else if (!estbDate.equals(other.estbDate))
			return false;
		if (extra1 == null) {
			if (other.extra1 != null)
				return false;
		} else if (!extra1.equals(other.extra1))
			return false;
		if (extra2 != other.extra2)
			return false;
		if (lastUpdatedBy == null) {
			if (other.lastUpdatedBy != null)
				return false;
		} else if (!lastUpdatedBy.equals(other.lastUpdatedBy))
			return false;
		if (lastUpdationDate == null) {
			if (other.lastUpdationDate != null)
				return false;
		} else if (!lastUpdationDate.equals(other.lastUpdationDate))
			return false;
		if (locality == null) {
			if (other.locality != null)
				return false;
		} else if (!locality.equals(other.locality))
			return false;
		if (multipleCourses == null) {
			if (other.multipleCourses != null)
				return false;
		} else if (!multipleCourses.equals(other.multipleCourses))
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
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Branches [branchId=" + branchId + ", branchName=" + branchName + ", branchPrefix=" + branchPrefix
				+ ", plotNo=" + plotNo + ", locality=" + locality + ", street=" + street + ", city=" + city + ", state="
				+ state + ", branchManagerId=" + branchManagerId + ", branchContactNo=" + branchContactNo
				+ ", multipleCourses=" + multipleCourses + ", estbDate=" + estbDate + ", createdBy=" + createdBy
				+ ", creationDate=" + creationDate + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdationDate="
				+ lastUpdationDate + ", extra1=" + extra1 + ", extra2=" + extra2 + "]";
	}
	
	
}
