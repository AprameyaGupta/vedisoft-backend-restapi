package com.vedisoft.pojos;

import java.util.Date;

public class Batch {
	protected int batchId;
	protected String code;
	protected int facultyId;
	protected int courseId;
	protected String timings;
	protected Date sdate;
	protected String days;
	protected String enddate;
	protected int sessionId;
	protected String createdBy;
	protected Date creationDate;
	protected String lastUpdatedBy;
	protected Date lastUpdationDate;
	protected String status;
	protected int branchId;
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
	 * @param code
	 * @param facultyId
	 * @param courseId
	 * @param timings
	 * @param sdate
	 * @param days
	 * @param enddate
	 * @param sessionId
	 * @param createdBy
	 * @param creationDate
	 * @param lastUpdatedBy
	 * @param lastUpdationDate
	 * @param status
	 * @param branchId
	 */
	public Batch(String code, int facultyId, int courseId, String timings, Date sdate, String days, String enddate,
			int sessionId, String createdBy, Date creationDate, String lastUpdatedBy, Date lastUpdationDate,
			String status, int branchId) {
		super();
		this.code = code;
		this.facultyId = facultyId;
		this.courseId = courseId;
		this.timings = timings;
		this.sdate = sdate;
		this.days = days;
		this.enddate = enddate;
		this.sessionId = sessionId;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdationDate = lastUpdationDate;
		this.status = status;
		this.branchId = branchId;
	}
	/**
	 * @param batchId
	 * @param code
	 * @param facultyId
	 * @param courseId
	 * @param timings
	 * @param sdate
	 * @param days
	 * @param enddate
	 * @param sessionId
	 * @param createdBy
	 * @param creationDate
	 * @param lastUpdatedBy
	 * @param lastUpdationDate
	 * @param status
	 * @param branchId
	 */
	public Batch(int batchId, String code, int facultyId, int courseId, String timings, Date sdate, String days,
			String enddate, int sessionId, String createdBy, Date creationDate, String lastUpdatedBy,
			Date lastUpdationDate, String status, int branchId) {
		super();
		this.batchId = batchId;
		this.code = code;
		this.facultyId = facultyId;
		this.courseId = courseId;
		this.timings = timings;
		this.sdate = sdate;
		this.days = days;
		this.enddate = enddate;
		this.sessionId = sessionId;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdationDate = lastUpdationDate;
		this.status = status;
		this.branchId = branchId;
	}
	/**
	 * 
	 */
	public Batch() {
		super();
	}
	/**
	 * @param code
	 * @param facultyId
	 * @param courseId
	 * @param timings
	 * @param sdate
	 * @param days
	 * @param enddate
	 * @param sessionId
	 * @param createdBy
	 * @param creationDate
	 * @param lastUpdatedBy
	 * @param lastUpdationDate
	 * @param status
	 */
	public Batch(String code, int facultyId, int courseId, String timings, Date sdate, String days, String enddate,
			int sessionId, String createdBy, Date creationDate, String lastUpdatedBy, Date lastUpdationDate,
			String status) {
		super();
		this.code = code;
		this.facultyId = facultyId;
		this.courseId = courseId;
		this.timings = timings;
		this.sdate = sdate;
		this.days = days;
		this.enddate = enddate;
		this.sessionId = sessionId;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdationDate = lastUpdationDate;
		this.status = status;
	}
	/**
	 * @param batchId
	 * @param code
	 * @param facultyId
	 * @param courseId
	 * @param timings
	 * @param sdate
	 * @param days
	 * @param enddate
	 * @param sessionId
	 * @param createdBy
	 * @param creationDate
	 * @param lastUpdatedBy
	 * @param lastUpdationDate
	 * @param status
	 */
	public Batch(int batchId, String code, int facultyId, int courseId, String timings, Date sdate, String days,
			String enddate, int sessionId, String createdBy, Date creationDate, String lastUpdatedBy,
			Date lastUpdationDate, String status) {
		super();
		this.batchId = batchId;
		this.code = code;
		this.facultyId = facultyId;
		this.courseId = courseId;
		this.timings = timings;
		this.sdate = sdate;
		this.days = days;
		this.enddate = enddate;
		this.sessionId = sessionId;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdationDate = lastUpdationDate;
		this.status = status;
	}
	/**
	 * @return the batchId
	 */
	public int getBatchId() {
		return batchId;
	}
	/**
	 * @param batchId the batchId to set
	 */
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the facultyId
	 */
	public int getFacultyId() {
		return facultyId;
	}
	/**
	 * @param facultyId the facultyId to set
	 */
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}
	/**
	 * @return the courseId
	 */
	public int getCourseId() {
		return courseId;
	}
	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	/**
	 * @return the timings
	 */
	public String getTimings() {
		return timings;
	}
	/**
	 * @param timings the timings to set
	 */
	public void setTimings(String timings) {
		this.timings = timings;
	}
	/**
	 * @return the sdate
	 */
	public Date getSdate() {
		return sdate;
	}
	/**
	 * @param sdate the sdate to set
	 */
	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}
	/**
	 * @return the days
	 */
	public String getDays() {
		return days;
	}
	/**
	 * @param days the days to set
	 */
	public void setDays(String days) {
		this.days = days;
	}
	/**
	 * @return the enddate
	 */
	public String getEnddate() {
		return enddate;
	}
	/**
	 * @param enddate the enddate to set
	 */
	public void setEnddate(String enddate) {
		this.enddate = enddate;
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
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + batchId;
		result = prime * result + branchId;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + courseId;
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + ((days == null) ? 0 : days.hashCode());
		result = prime * result + ((enddate == null) ? 0 : enddate.hashCode());
		result = prime * result + facultyId;
		result = prime * result + ((lastUpdatedBy == null) ? 0 : lastUpdatedBy.hashCode());
		result = prime * result + ((lastUpdationDate == null) ? 0 : lastUpdationDate.hashCode());
		result = prime * result + ((sdate == null) ? 0 : sdate.hashCode());
		result = prime * result + sessionId;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((timings == null) ? 0 : timings.hashCode());
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
		Batch other = (Batch) obj;
		if (batchId != other.batchId)
			return false;
		if (branchId != other.branchId)
			return false;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (courseId != other.courseId)
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
		if (days == null) {
			if (other.days != null)
				return false;
		} else if (!days.equals(other.days))
			return false;
		if (enddate == null) {
			if (other.enddate != null)
				return false;
		} else if (!enddate.equals(other.enddate))
			return false;
		if (facultyId != other.facultyId)
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
		if (sdate == null) {
			if (other.sdate != null)
				return false;
		} else if (!sdate.equals(other.sdate))
			return false;
		if (sessionId != other.sessionId)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (timings == null) {
			if (other.timings != null)
				return false;
		} else if (!timings.equals(other.timings))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Batch [batchId=" + batchId + ", code=" + code + ", facultyId=" + facultyId + ", courseId=" + courseId
				+ ", timings=" + timings + ", sdate=" + sdate + ", days=" + days + ", enddate=" + enddate
				+ ", sessionId=" + sessionId + ", createdBy=" + createdBy + ", creationDate=" + creationDate
				+ ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdationDate=" + lastUpdationDate + ", status=" + status
				+ ", branchId=" + branchId + "]";
	}
		
	
	
}
