package com.vedisoft.pojos;

import java.util.Date;

public class Installment {
	protected int id;
	protected int receiptNo;
	protected String regNo;
	protected Date instDate;
	protected float amt;
	protected int batchId;
	protected String mode1;
	protected int chqNo;
	protected String bank;
	protected Date chqDate;
	protected int staffId;
	protected int branchId;
	protected String createdBy;
	protected Date creationDate;
	protected String lastCreatedBy;
	protected Date lastCreationDate;
	protected Date deliveryDate;
	protected int extra2;
	/**
	 * 
	 */
	public Installment() {
		super();
	}
	/**
	 * @param receiptNo
	 * @param regNo
	 * @param instDate
	 * @param amt
	 * @param batchId
	 * @param mode1
	 * @param chqNo
	 * @param bank
	 * @param chqDate
	 * @param staffId
	 * @param branchId
	 * @param createdBy
	 * @param creationDate
	 * @param lastCreatedBy
	 * @param lastCreationDate
	 * @param deliveryDate
	 * @param extra2
	 */
	public Installment(int receiptNo, String regNo, Date instDate, float amt, int batchId, String mode1, int chqNo,
			String bank, Date chqDate, int staffId, int branchId, String createdBy, Date creationDate,
			String lastCreatedBy, Date lastCreationDate, Date deliveryDate, int extra2) {
		super();
		this.receiptNo = receiptNo;
		this.regNo = regNo;
		this.instDate = instDate;
		this.amt = amt;
		this.batchId = batchId;
		this.mode1 = mode1;
		this.chqNo = chqNo;
		this.bank = bank;
		this.chqDate = chqDate;
		this.staffId = staffId;
		this.branchId = branchId;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.lastCreatedBy = lastCreatedBy;
		this.lastCreationDate = lastCreationDate;
		this.deliveryDate = deliveryDate;
		this.extra2 = extra2;
	}
	/**
	 * @param id
	 * @param receiptNo
	 * @param regNo
	 * @param instDate
	 * @param amt
	 * @param batchId
	 * @param mode1
	 * @param chqNo
	 * @param bank
	 * @param chqDate
	 * @param staffId
	 * @param branchId
	 * @param createdBy
	 * @param creationDate
	 * @param lastCreatedBy
	 * @param lastCreationDate
	 * @param deliveryDate
	 * @param extra2
	 */
	public Installment(int id, int receiptNo, String regNo, Date instDate, float amt, int batchId, String mode1,
			int chqNo, String bank, Date chqDate, int staffId, int branchId, String createdBy, Date creationDate,
			String lastCreatedBy, Date lastCreationDate, Date deliveryDate, int extra2) {
		super();
		this.id = id;
		this.receiptNo = receiptNo;
		this.regNo = regNo;
		this.instDate = instDate;
		this.amt = amt;
		this.batchId = batchId;
		this.mode1 = mode1;
		this.chqNo = chqNo;
		this.bank = bank;
		this.chqDate = chqDate;
		this.staffId = staffId;
		this.branchId = branchId;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.lastCreatedBy = lastCreatedBy;
		this.lastCreationDate = lastCreationDate;
		this.deliveryDate = deliveryDate;
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
	 * @return the receiptNo
	 */
	public int getReceiptNo() {
		return receiptNo;
	}
	/**
	 * @param receiptNo the receiptNo to set
	 */
	public void setReceiptNo(int receiptNo) {
		this.receiptNo = receiptNo;
	}
	/**
	 * @return the regNo
	 */
	public String getRegNo() {
		return regNo;
	}
	/**
	 * @param regNo the regNo to set
	 */
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	/**
	 * @return the instDate
	 */
	public Date getInstDate() {
		return instDate;
	}
	/**
	 * @param instDate the instDate to set
	 */
	public void setInstDate(Date instDate) {
		this.instDate = instDate;
	}
	/**
	 * @return the amt
	 */
	public float getAmt() {
		return amt;
	}
	/**
	 * @param amt the amt to set
	 */
	public void setAmt(float amt) {
		this.amt = amt;
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
	 * @return the chqNo
	 */
	public int getChqNo() {
		return chqNo;
	}
	/**
	 * @param chqNo the chqNo to set
	 */
	public void setChqNo(int chqNo) {
		this.chqNo = chqNo;
	}
	/**
	 * @return the bank
	 */
	public String getBank() {
		return bank;
	}
	/**
	 * @param bank the bank to set
	 */
	public void setBank(String bank) {
		this.bank = bank;
	}
	/**
	 * @return the chqDate
	 */
	public Date getChqDate() {
		return chqDate;
	}
	/**
	 * @param chqDate the chqDate to set
	 */
	public void setChqDate(Date chqDate) {
		this.chqDate = chqDate;
	}
	/**
	 * @return the staffId
	 */
	public int getStaffId() {
		return staffId;
	}
	/**
	 * @param staffId the staffId to set
	 */
	public void setStaffId(int staffId) {
		this.staffId = staffId;
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
	 * @return the lastCreatedBy
	 */
	public String getLastCreatedBy() {
		return lastCreatedBy;
	}
	/**
	 * @param lastCreatedBy the lastCreatedBy to set
	 */
	public void setLastCreatedBy(String lastCreatedBy) {
		this.lastCreatedBy = lastCreatedBy;
	}
	/**
	 * @return the lastCreationDate
	 */
	public Date getLastCreationDate() {
		return lastCreationDate;
	}
	/**
	 * @param lastCreationDate the lastCreationDate to set
	 */
	public void setLastCreationDate(Date lastCreationDate) {
		this.lastCreationDate = lastCreationDate;
	}
	/**
	 * @return the deliveryDate
	 */
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	/**
	 * @param deliveryDate the deliveryDate to set
	 */
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
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
		result = prime * result + Float.floatToIntBits(amt);
		result = prime * result + ((bank == null) ? 0 : bank.hashCode());
		result = prime * result + batchId;
		result = prime * result + branchId;
		result = prime * result + ((chqDate == null) ? 0 : chqDate.hashCode());
		result = prime * result + chqNo;
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + ((deliveryDate == null) ? 0 : deliveryDate.hashCode());
		result = prime * result + extra2;
		result = prime * result + id;
		result = prime * result + ((instDate == null) ? 0 : instDate.hashCode());
		result = prime * result + ((lastCreatedBy == null) ? 0 : lastCreatedBy.hashCode());
		result = prime * result + ((lastCreationDate == null) ? 0 : lastCreationDate.hashCode());
		result = prime * result + ((mode1 == null) ? 0 : mode1.hashCode());
		result = prime * result + receiptNo;
		result = prime * result + ((regNo == null) ? 0 : regNo.hashCode());
		result = prime * result + staffId;
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
		Installment other = (Installment) obj;
		if (Float.floatToIntBits(amt) != Float.floatToIntBits(other.amt))
			return false;
		if (bank == null) {
			if (other.bank != null)
				return false;
		} else if (!bank.equals(other.bank))
			return false;
		if (batchId != other.batchId)
			return false;
		if (branchId != other.branchId)
			return false;
		if (chqDate == null) {
			if (other.chqDate != null)
				return false;
		} else if (!chqDate.equals(other.chqDate))
			return false;
		if (chqNo != other.chqNo)
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
		if (deliveryDate == null) {
			if (other.deliveryDate != null)
				return false;
		} else if (!deliveryDate.equals(other.deliveryDate))
			return false;
		if (extra2 != other.extra2)
			return false;
		if (id != other.id)
			return false;
		if (instDate == null) {
			if (other.instDate != null)
				return false;
		} else if (!instDate.equals(other.instDate))
			return false;
		if (lastCreatedBy == null) {
			if (other.lastCreatedBy != null)
				return false;
		} else if (!lastCreatedBy.equals(other.lastCreatedBy))
			return false;
		if (lastCreationDate == null) {
			if (other.lastCreationDate != null)
				return false;
		} else if (!lastCreationDate.equals(other.lastCreationDate))
			return false;
		if (mode1 == null) {
			if (other.mode1 != null)
				return false;
		} else if (!mode1.equals(other.mode1))
			return false;
		if (receiptNo != other.receiptNo)
			return false;
		if (regNo == null) {
			if (other.regNo != null)
				return false;
		} else if (!regNo.equals(other.regNo))
			return false;
		if (staffId != other.staffId)
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Installment [id=" + id + ", receiptNo=" + receiptNo + ", regNo=" + regNo + ", instDate=" + instDate
				+ ", amt=" + amt + ", batchId=" + batchId + ", mode1=" + mode1 + ", chqNo=" + chqNo + ", bank=" + bank
				+ ", chqDate=" + chqDate + ", staffId=" + staffId + ", branchId=" + branchId + ", createdBy="
				+ createdBy + ", creationDate=" + creationDate + ", lastCreatedBy=" + lastCreatedBy
				+ ", lastCreationDate=" + lastCreationDate + ", deliveryDate=" + deliveryDate + ", extra2=" + extra2
				+ "]";
	}
	
	
}
