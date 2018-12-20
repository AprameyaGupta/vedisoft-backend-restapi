package com.vedisoft.pojos;

import java.util.Date;

public class StudentBatch {
	protected int sbId;
	protected String studentId;
	protected int batchId;
	protected String flag;
	protected String createdBy;
	protected Date createdDate;
	protected String lastUpdatedBy;
	protected Date lastUpdatedDate;
	protected String joined;
	protected String certificate;
	/**
	 * 
	 */
	public StudentBatch() {
		super();
	}
	/**
	 * @param studentId
	 * @param batchId
	 * @param flag
	 * @param createdBy
	 * @param createdDate
	 * @param lastUpdatedBy
	 * @param lastUpdatedDate
	 * @param joined
	 * @param certificate
	 */
	public StudentBatch(String studentId, int batchId, String flag, String createdBy, Date createdDate,
			String lastUpdatedBy, Date lastUpdatedDate, String joined, String certificate) {
		super();
		this.studentId = studentId;
		this.batchId = batchId;
		this.flag = flag;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedDate = lastUpdatedDate;
		this.joined = joined;
		this.certificate = certificate;
	}
	/**
	 * @param sbId
	 * @param studentId
	 * @param batchId
	 * @param flag
	 * @param createdBy
	 * @param createdDate
	 * @param lastUpdatedBy
	 * @param lastUpdatedDate
	 * @param joined
	 * @param certificate
	 */
	public StudentBatch(int sbId, String studentId, int batchId, String flag, String createdBy, Date createdDate,
			String lastUpdatedBy, Date lastUpdatedDate, String joined, String certificate) {
		super();
		this.sbId = sbId;
		this.studentId = studentId;
		this.batchId = batchId;
		this.flag = flag;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedDate = lastUpdatedDate;
		this.joined = joined;
		this.certificate = certificate;
	}
	/**
	 * @return the sbId
	 */
	public int getSbId() {
		return sbId;
	}
	/**
	 * @param sbId the sbId to set
	 */
	public void setSbId(int sbId) {
		this.sbId = sbId;
	}
	/**
	 * @return the studentId
	 */
	public String getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(String studentId) {
		this.studentId = studentId;
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
	 * @return the flag
	 */
	public String getFlag() {
		return flag;
	}
	/**
	 * @param flag the flag to set
	 */
	public void setFlag(String flag) {
		this.flag = flag;
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
	/**
	 * @return the joined
	 */
	public String getJoined() {
		return joined;
	}
	/**
	 * @param joined the joined to set
	 */
	public void setJoined(String joined) {
		this.joined = joined;
	}
	/**
	 * @return the certificate
	 */
	public String getCertificate() {
		return certificate;
	}
	/**
	 * @param certificate the certificate to set
	 */
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + batchId;
		result = prime * result + ((certificate == null) ? 0 : certificate.hashCode());
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result + ((flag == null) ? 0 : flag.hashCode());
		result = prime * result + ((joined == null) ? 0 : joined.hashCode());
		result = prime * result + ((lastUpdatedBy == null) ? 0 : lastUpdatedBy.hashCode());
		result = prime * result + ((lastUpdatedDate == null) ? 0 : lastUpdatedDate.hashCode());
		result = prime * result + sbId;
		result = prime * result + ((studentId == null) ? 0 : studentId.hashCode());
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
		StudentBatch other = (StudentBatch) obj;
		if (batchId != other.batchId)
			return false;
		if (certificate == null) {
			if (other.certificate != null)
				return false;
		} else if (!certificate.equals(other.certificate))
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
		if (flag == null) {
			if (other.flag != null)
				return false;
		} else if (!flag.equals(other.flag))
			return false;
		if (joined == null) {
			if (other.joined != null)
				return false;
		} else if (!joined.equals(other.joined))
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
		if (sbId != other.sbId)
			return false;
		if (studentId == null) {
			if (other.studentId != null)
				return false;
		} else if (!studentId.equals(other.studentId))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StudentBatch [sbId=" + sbId + ", studentId=" + studentId + ", batchId=" + batchId + ", flag=" + flag
				+ ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", lastUpdatedBy=" + lastUpdatedBy
				+ ", lastUpdatedDate=" + lastUpdatedDate + ", joined=" + joined + ", certificate=" + certificate + "]";
	}
}
