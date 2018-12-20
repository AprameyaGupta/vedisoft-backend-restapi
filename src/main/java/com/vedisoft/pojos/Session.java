package com.vedisoft.pojos;

import java.util.Date;

public class Session {
	protected int sessionId;
	protected String sessionName;
	protected Date startDate;
	protected Date endDate;
	protected String createdBy;
	protected Date creationDate;
	protected String lastUpdatedBy;
	protected Date lastUpdationDate;
	protected String extra;
	/**
	 * 
	 */
	public Session() {
		super();
	}
	/**
	 * @param sessionName
	 * @param startDate
	 * @param endDate
	 * @param createdBy
	 * @param creationDate
	 * @param lastUpdatedBy
	 * @param lastUpdationDate
	 * @param extra
	 */
	public Session(String sessionName, Date startDate, Date endDate, String createdBy, Date creationDate,
			String lastUpdatedBy, Date lastUpdationDate, String extra) {
		super();
		this.sessionName = sessionName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdationDate = lastUpdationDate;
		this.extra = extra;
	}
	/**
	 * @param sessionId
	 * @param sessionName
	 * @param startDate
	 * @param endDate
	 * @param createdBy
	 * @param creationDate
	 * @param lastUpdatedBy
	 * @param lastUpdationDate
	 * @param extra
	 */
	public Session(int sessionId, String sessionName, Date startDate, Date endDate, String createdBy, Date creationDate,
			String lastUpdatedBy, Date lastUpdationDate, String extra) {
		super();
		this.sessionId = sessionId;
		this.sessionName = sessionName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdationDate = lastUpdationDate;
		this.extra = extra;
	}
	/**
	 * @return the sessionId
	 */
	public int getSessionId() {
		return sessionId;
	}
	/**
	 * @param sessionId the sessionId to set
	 */
	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}
	/**
	 * @return the sessionName
	 */
	public String getSessionName() {
		return sessionName;
	}
	/**
	 * @param sessionName the sessionName to set
	 */
	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}
	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
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
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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
	 * @return the extra
	 */
	public String getExtra() {
		return extra;
	}
	/**
	 * @param extra the extra to set
	 */
	public void setExtra(String extra) {
		this.extra = extra;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((extra == null) ? 0 : extra.hashCode());
		result = prime * result + ((lastUpdatedBy == null) ? 0 : lastUpdatedBy.hashCode());
		result = prime * result + ((lastUpdationDate == null) ? 0 : lastUpdationDate.hashCode());
		result = prime * result + sessionId;
		result = prime * result + ((sessionName == null) ? 0 : sessionName.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
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
		Session other = (Session) obj;
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
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (extra == null) {
			if (other.extra != null)
				return false;
		} else if (!extra.equals(other.extra))
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
		if (sessionId != other.sessionId)
			return false;
		if (sessionName == null) {
			if (other.sessionName != null)
				return false;
		} else if (!sessionName.equals(other.sessionName))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Session [sessionId=" + sessionId + ", sessionName=" + sessionName + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", createdBy=" + createdBy + ", creationDate=" + creationDate
				+ ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdationDate=" + lastUpdationDate + ", extra=" + extra
				+ "]";
	}
	
	
}
