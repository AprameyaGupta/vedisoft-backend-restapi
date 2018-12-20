package com.vedisoft.pojos;

import java.util.Date;

public class Fees {
	protected int id;
	protected int batchId;
	protected float famt;
	protected Date dueDate;
	protected String mode1;
	protected int branchId;
	protected String createdBy;
	protected Date creationDate;
	protected String lastUpdatedBy;
	protected Date lastUpdationDate;
	protected String extra1;
	protected int extra2;
	/**
	 * 
	 */
	public Fees() {
		super();
	}
	/**
	 * @param batchId
	 * @param famt
	 * @param dueDate
	 * @param mode1
	 * @param branchId
	 * @param createdBy
	 * @param creationDate
	 * @param lastUpdatedBy
	 * @param lastUpdationDate
	 * @param extra1
	 * @param extra2
	 */
	public Fees(int batchId, float famt, Date dueDate, String mode1, int branchId, String createdBy, Date creationDate,
			String lastUpdatedBy, Date lastUpdationDate, String extra1, int extra2) {
		super();
		this.batchId = batchId;
		this.famt = famt;
		this.dueDate = dueDate;
		this.mode1 = mode1;
		this.branchId = branchId;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdationDate = lastUpdationDate;
		this.extra1 = extra1;
		this.extra2 = extra2;
	}
	/**
	 * @param id
	 * @param batchId
	 * @param famt
	 * @param dueDate
	 * @param mode1
	 * @param branchId
	 * @param createdBy
	 * @param creationDate
	 * @param lastUpdatedBy
	 * @param lastUpdationDate
	 * @param extra1
	 * @param extra2
	 */
	public Fees(int id, int batchId, float famt, Date dueDate, String mode1, int branchId, String createdBy,
			Date creationDate, String lastUpdatedBy, Date lastUpdationDate, String extra1, int extra2) {
		super();
		this.id = id;
		this.batchId = batchId;
		this.famt = famt;
		this.dueDate = dueDate;
		this.mode1 = mode1;
		this.branchId = branchId;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdationDate = lastUpdationDate;
		this.extra1 = extra1;
		this.extra2 = extra2;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the famt
	 */
	public float getFamt() {
		return famt;
	}
	/**
	 * @param famt the famt to set
	 */
	public void setFamt(float famt) {
		this.famt = famt;
	}
	/**
	 * @return the dueDate
	 */
	public Date getDueDate() {
		return dueDate;
	}
	/**
	 * @param dueDate the dueDate to set
	 */
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	/**
	 * @return the mode1
	 */
	public String getMode1() {
		return mode1;
	}
	/**
	 * @param mode1 the mode1 to set
	 */
	public void setMode1(String mode1) {
		this.mode1 = mode1;
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
		result = prime * result + batchId;
		result = prime * result + branchId;
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + ((dueDate == null) ? 0 : dueDate.hashCode());
		result = prime * result + ((extra1 == null) ? 0 : extra1.hashCode());
		result = prime * result + extra2;
		result = prime * result + Float.floatToIntBits(famt);
		result = prime * result + id;
		result = prime * result + ((lastUpdatedBy == null) ? 0 : lastUpdatedBy.hashCode());
		result = prime * result + ((lastUpdationDate == null) ? 0 : lastUpdationDate.hashCode());
		result = prime * result + ((mode1 == null) ? 0 : mode1.hashCode());
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
		Fees other = (Fees) obj;
		if (batchId != other.batchId)
			return false;
		if (branchId != other.branchId)
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
		if (dueDate == null) {
			if (other.dueDate != null)
				return false;
		} else if (!dueDate.equals(other.dueDate))
			return false;
		if (extra1 == null) {
			if (other.extra1 != null)
				return false;
		} else if (!extra1.equals(other.extra1))
			return false;
		if (extra2 != other.extra2)
			return false;
		if (Float.floatToIntBits(famt) != Float.floatToIntBits(other.famt))
			return false;
		if (id != other.id)
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
		if (mode1 == null) {
			if (other.mode1 != null)
				return false;
		} else if (!mode1.equals(other.mode1))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Fees [id=" + id + ", batchId=" + batchId + ", famt=" + famt + ", dueDate=" + dueDate + ", mode1="
				+ mode1 + ", branchId=" + branchId + ", createdBy=" + createdBy + ", creationDate=" + creationDate
				+ ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdationDate=" + lastUpdationDate + ", extra1=" + extra1
				+ ", extra2=" + extra2 + "]";
	}
	
	
}
